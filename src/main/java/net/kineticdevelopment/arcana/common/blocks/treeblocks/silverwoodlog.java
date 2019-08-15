package net.kineticdevelopment.arcana.common.blocks.treeblocks;

import net.kineticdevelopment.arcana.utilities.taint.TaintCleaner;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


public class silverwoodlog extends RotatedPillarBlock {

    public silverwoodlog(Block.Properties properties) {
        super(properties);
        setRegistryName("silverwoodlog");
    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintCleaner.cleanTaint(worldIn, pos);
    }
}