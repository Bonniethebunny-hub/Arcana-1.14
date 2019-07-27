package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class greatwoodlog {

    public LogBlock(MaterialColor p_i48367_1_, Block.Properties p_i48367_2_) {
        super(p_i48367_2_);
    }

    public MaterialColor getMaterialColor(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.get(AXIS) == Direction.Axis.Y ? this.verticalColor : this.materialColor;
    }
}
