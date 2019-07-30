package net.kineticdevelopment.arcana.common.blocks.treeblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class strippeddairlog extends RotatedPillarBlock {
    public strippeddairlog(Properties properties) {
        super(properties);
        setRegistryName("strippeddairlog");
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
