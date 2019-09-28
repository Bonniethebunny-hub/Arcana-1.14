package kineticdevelopment.api.blocks;

import java.util.Random;

import kineticdevelopment.common.utils.taint.TaintSpreader;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TaintedSlab extends SlabBlock {

	public TaintedSlab(Properties properties) {
		super(properties);
	}
	
	@Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintSpreader.spreadTaint(worldIn, pos);

    }
}
