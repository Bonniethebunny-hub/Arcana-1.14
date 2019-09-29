package kineticdevelopment.arcana.common.blocks.tainted;

import kineticdevelopment.arcana.api.blocks.TaintedBlock;
import net.minecraft.block.BlockState;

public class TaintedPath extends TaintedBlock {
    public TaintedPath(Properties properties) {
        super(properties);

    }

    @Override
    public boolean isSolid(BlockState state) {
        return false;
    }
}