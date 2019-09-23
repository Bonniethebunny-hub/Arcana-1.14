/**
 Used for stairs as they don't have a public constructor. Please always use this class when making a stair block.
 **/

package kineticdevelopment.api.blocks;

import java.util.Random;

import kineticdevelopment.common.utils.taint.TaintSpreader;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class TaintedStairsBlock extends StairsBlock {
    public TaintedStairsBlock(BlockState state, Properties properties) {
        super(state, properties);
    }
    
    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintSpreader.spreadTaint(worldIn, pos);
    }
}
