package kineticdevelopment.common.blocks.tainted;

import kineticdevelopment.api.blocks.TaintedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TaintedSoil extends TaintedBlock {
    public TaintedSoil() {
        super(Block.Properties.create(Material.EARTH)
                .sound(SoundType.WET_GRASS)
                .hardnessAndResistance(0.1f)
        );

    }
    
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
       return true;
    }
}