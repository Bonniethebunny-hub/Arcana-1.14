package kineticdevelopment.arcana.common.blocks.tainted;

import kineticdevelopment.arcana.api.blocks.TaintedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TaintedGrassBlock extends TaintedBlock {
    public TaintedGrassBlock (Properties properties) {
        super(properties);

    }
    
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
       return true;
    }
}