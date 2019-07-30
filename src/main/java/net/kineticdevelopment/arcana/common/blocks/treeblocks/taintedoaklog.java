package net.kineticdevelopment.arcana.common.blocks.treeblocks;

import java.util.Random;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.utilities.TaintSpreader;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class taintedoaklog extends RotatedPillarBlock {
    public taintedoaklog(Properties properties) {
        super(properties);
        setRegistryName("taintedoaklog");
    }
    
    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
    	if(player.getHeldItemMainhand().getItem() instanceof AxeItem)
    	{
    		worldIn.setBlockState(pos, ModBlocks.STRIPPEDTAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, state.get(RotatedPillarBlock.AXIS)), 11);
    		player.getHeldItemMainhand().setDamage(player.getHeldItemMainhand().getDamage() + 1);
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }
    
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
    	
    	TaintSpreader.spreadTaint(worldIn, pos);
    }
}
