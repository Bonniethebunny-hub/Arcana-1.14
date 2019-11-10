package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.packets.ArcanaPacketHandler;
import kineticdevelopment.arcana.api.packets.ShowAspectsPacket;
import kineticdevelopment.arcana.client.helpers.ArcanaHelper;
import kineticdevelopment.arcana.common.nodes.Node;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandlerModifiable;

import java.util.ArrayList;

public abstract class NodeTileEntity extends LockableLootTileEntity implements INodeTileEntity, ITickableTileEntity {

    protected NonNullList<ItemStack> chestContents = NonNullList.withSize(27, ItemStack.EMPTY);
    protected int numPlayersUsing;
    protected LazyOptional<IItemHandlerModifiable> chestHandler;

    protected NodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public NonNullList<ItemStack> getChestContents() {
        return this.chestContents;
    }

    public int getSizeInventory() {
        return 27;
    }

    public boolean isEmpty() {
        for(ItemStack itemstack : this.chestContents) {
            if (!itemstack.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public void read(CompoundNBT compound) {
        super.read(compound);
        if (!this.checkLootAndRead(compound)) {
            ItemStackHelper.loadAllItems(compound, this.chestContents);
        }
    }

    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        if (!this.checkLootAndWrite(compound)) {
            ItemStackHelper.saveAllItems(compound, this.chestContents);
        }
        return compound;
    }

    public void openInventory(PlayerEntity player) {
        if (!player.isSpectator()) {
            if (this.numPlayersUsing < 0) {
                this.numPlayersUsing = 0;
            }

            ++this.numPlayersUsing;
            this.onOpenOrClose();
        }

    }

    public void closeInventory(PlayerEntity player) {
        if (!player.isSpectator()) {
            --this.numPlayersUsing;
            this.onOpenOrClose();
        }

    }

    protected void onOpenOrClose() {
        Block block = this.getBlockState().getBlock();
        if (block instanceof ChestBlock) {
            this.world.addBlockEvent(this.pos, block, 1, this.numPlayersUsing);
            this.world.notifyNeighborsOfStateChange(this.pos, block);
        }

    }

    protected NonNullList<ItemStack> getItems() {
        return this.chestContents;
    }

    protected void setItems(NonNullList<ItemStack> itemsIn) {
        this.chestContents = itemsIn;
    }

    protected Container createMenu(int id, PlayerInventory player) {
        return ChestContainer.createGeneric9X3(id, player, this);
    }

    @Override
    public void updateContainingBlockInfo() {
        super.updateContainingBlockInfo();
        if (this.chestHandler != null) {
            this.chestHandler.invalidate();
            this.chestHandler = null;
        }
    }

    /**
     * invalidates a tile entity
     */
    @Override
    public void remove() {
        super.remove();
        if (this.chestHandler != null)
            this.chestHandler.invalidate();
    }

    @Override
    public void tick() {
        if(world.isRemote()) {
            switch (ArcanaHelper.getGogglePriority()) {
                case SHOW_NONE:
                    this.getNode().hitboxOff();
                    break;
                case SHOW_NODE:
                    this.showNodes();
                    break;
                case SHOW_NODE_AND_ASPECTS:
                    this.showNodes();
                    if(ArcanaHelper.isNodeOnCursor(this)) {
                        this.showAspects();
                    }
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public Node getNode() {
        return ((Node)this.getBlockState().getBlock());
    }

    @Override
    public double getParticleOffset() {
        ClientPlayerEntity player = Minecraft.getInstance().player;
        Vec3d playerVec = player.getPositionVector();
        BlockPos nodeVec = this.getPos();
        double slopeX = (playerVec.getX() - nodeVec.getX()) - 0.5;
        double slopeZ = (playerVec.getZ() - nodeVec.getZ()) - 0.5;
        double hypotenuse = Math.sqrt(Math.pow(slopeX,2) + Math.pow(slopeZ,2));
        double angle = Math.asin(slopeX/hypotenuse) + Math.PI/2;
        return slopeZ < 0 ? -angle : angle;
    }

    public static ArrayList<Integer> splitParticleNumber(int number) {
        System.out.println(number);
        ArrayList<Integer> numList = new ArrayList<>();
        String numString = Integer.toString(number);
        for(int i = 0; i < numString.length(); i++) {
            numList.add((int) numString.charAt(i) - '0');
        }
        return numList;
    }

    @Override
    public void showNodes() {
        this.getNode().hitboxOn();
        Vec3d particleLocation = ArcanaHelper.getTileEntityCenteredParticle(this);
        Minecraft.getInstance().player.getEntityWorld().addParticle(this.getParticle(), true, particleLocation.getX(), particleLocation.getY(), particleLocation.getZ(), 0, 0, 0);
    }

    @Override
    public void showAspects() {
        ArcanaPacketHandler.SHOW_ASPECTS.sendToServer(new ShowAspectsPacket(this.getPos()));
    }
}