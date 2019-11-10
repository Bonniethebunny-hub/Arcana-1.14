package kineticdevelopment.arcana.api.packets;

import kineticdevelopment.arcana.api.aspects.AspectItem;
import kineticdevelopment.arcana.client.helpers.ArcanaHelper;
import kineticdevelopment.arcana.client.particles.aspects.AspectParticle;
import kineticdevelopment.arcana.client.particles.numbers.AspectNumberParticle;
import kineticdevelopment.arcana.common.tile_entities.NodeTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ShowAspectsPacket {

    private final BlockPos nodePos;
    private ArrayList<ItemStack> aspectList = new ArrayList<>();

    public ShowAspectsPacket(PacketBuffer buf) {
        this.nodePos = buf.readBlockPos();
    }

    public ShowAspectsPacket(BlockPos pos) {
        this.nodePos = pos;
    }

    public ArrayList<ItemStack> getAspectList() {
        return aspectList;
    }

    public void setAspectList(ArrayList<ItemStack> stack) {
        aspectList = stack;
    }

    public void resetAspectList() {
        aspectList.clear();
    }

    public BlockPos getPos() {
        return this.nodePos;
    }

    public static void encode(final ShowAspectsPacket message, PacketBuffer buf) {
        buf.writeBlockPos(message.nodePos);
    }

    public static ShowAspectsPacket decode(final PacketBuffer buffer) {
        return new ShowAspectsPacket(buffer.readBlockPos());
    }

    //Function used when the packet is called. The nodeInventory variable is passed in from the packet call.
    public static void handle(ShowAspectsPacket nodeInventory, Supplier<NetworkEvent.Context> context) {

        //Always wrap packets int this function to make sure it is threaded properly
        context.get().enqueueWork(() -> {

            //Get the server world to access server-side information
            ServerWorld serverWorld = context.get().getSender().getServerWorld();

            //Variable to store the Client World
            World playerWorld = Minecraft.getInstance().player.getEntityWorld();

            //Variable to store the node Tile Entity
            NodeTileEntity node = (NodeTileEntity) serverWorld.getTileEntity(nodeInventory.getPos());

            //Variable to store the location of where the particle should be in a vector
            Vec3d particleLocation = ArcanaHelper.getTileEntityCenteredParticle(node);

            //Loop to add only aspect items from the node container to a List
            for (ItemStack item : node.getChestContents()) {
                if (item.getItem() instanceof AspectItem) {
                    nodeInventory.getAspectList().add(item);
                }
            }

            //Variable to store the location of the first aspect particle. This will change based on which number aspect it is
            float shift = nodeInventory.getAspectList().size() > node.getParticleHorizontalLimit() ? -(( node.getParticleHorizontalLimit() - 1) * AspectParticle.getScaleSpace()) : -((nodeInventory.getAspectList().size() - 1) * AspectParticle.getScaleSpace());

            //Counters
            int aspectOverload = 0;
            int overloadCount = 0;

            //Variable storing the angle offset between the player and the node
            double angleOffset = node.getParticleOffset();

            //Loop to show the particles perpendicular to the player at all times
            for(ItemStack item : nodeInventory.getAspectList()) {
                ArrayList<Integer> numList = NodeTileEntity.splitParticleNumber(item.getCount());
                if(aspectOverload % node.getParticleHorizontalLimit() == 0 && aspectOverload != 0) {
                    overloadCount++;
                    shift = nodeInventory.getAspectList().size() - (overloadCount * node.getParticleHorizontalLimit()) > node.getParticleHorizontalLimit() ? -(( node.getParticleHorizontalLimit() - 1) * AspectParticle.getScaleSpace()) : -(((float)(nodeInventory.getAspectList().size() - (overloadCount * node.getParticleHorizontalLimit())) - 1) * AspectParticle.getScaleSpace());
                    System.out.println(shift);
                }
                aspectOverload++;
                if(item.getItem() instanceof AspectItem) {

                    double aspectLocationX = particleLocation.getX() + (shift * Math.sin(angleOffset));
                    double aspectLocationY = particleLocation.getY() + (overloadCount * AspectParticle.getHeightFromNode()) + 1;
                    double aspectLocationZ = particleLocation.getZ() + (shift * Math.cos(angleOffset));

                    playerWorld.addParticle(AspectItem.getParticle((AspectItem) item.getItem()), true, aspectLocationX, aspectLocationY, aspectLocationZ,0,0,0);

                    int numberCount = numList.size();
                    for(int number : numList) {

                        float numberShift = shift - AspectNumberParticle.getScaleSpace() * ((float)(numberCount - 1)/2.5F);

                        double aspectNumberLocationX = particleLocation.getX() + (numberShift * Math.sin(angleOffset));
                        double aspectNumberLocationY = particleLocation.getY() + (overloadCount * AspectParticle.getHeightFromNode()) + 0.75;
                        double aspectNumberLocationZ = particleLocation.getZ() + (numberShift * Math.cos(angleOffset));

                        playerWorld.addParticle(AspectNumberParticle.getNumberParticle(number), true, aspectNumberLocationX, aspectNumberLocationY, aspectNumberLocationZ, 0, 0, 0);

                        numberCount -= 2;
                    }
                    shift += AspectParticle.getScaleSpace() * 2;
                }
            }
        });

        //Always include this outside the queue to let Minecraft know the packet has ended.
        context.get().setPacketHandled(true);
    }
}
