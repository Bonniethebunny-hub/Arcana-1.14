package kineticdevelopment.common.blocks.tainted;

import kineticdevelopment.api.blocks.TaintedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TaintedPath extends TaintedBlock {
    public TaintedPath(Properties properties) {
        super(properties);

    }

    @Override
    public boolean isSolid(BlockState state) {
        return false;
    }
}