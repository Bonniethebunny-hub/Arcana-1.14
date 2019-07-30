package net.kineticdevelopment.arcana.common.blocks;

import net.kineticdevelopment.arcana.client.gui.GuiArcaneWorkbench;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

public class arcaneworktable extends Block {

    public arcaneworktable() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .lightValue(2)
                .harvestTool(ToolType.AXE)
        );
        setRegistryName("arcaneworktable");
    }
    public static boolean isOpaque(VoxelShape shape) {
        return false;
    }

    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    @SuppressWarnings("deprecation")
	@Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) new GuiArcaneWorkbench());
        }

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
    
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
        if(!player.isCreative()) {
        	spawnAsEntity(worldIn, pos, new ItemStack(this));
        }
    }
    
    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack) {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
           double d0 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d1 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d2 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
           itementity.setDefaultPickupDelay();
           worldIn.addEntity(itementity);
        }
    }
}
