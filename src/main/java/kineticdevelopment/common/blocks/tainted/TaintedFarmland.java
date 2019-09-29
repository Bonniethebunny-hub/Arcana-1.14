package kineticdevelopment.common.blocks.tainted;

import kineticdevelopment.api.blocks.TaintedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TaintedFarmland extends TaintedBlock {
    public TaintedFarmland (Properties properties) {
        super(properties);

    }

    @Override
    public boolean isSolid(BlockState state) {
        return false;
    }
    
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
       return true;
    }
}