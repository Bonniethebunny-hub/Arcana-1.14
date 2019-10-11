package kineticdevelopment.arcana.common.blocks.tainted;

import kineticdevelopment.arcana.api.blocks.TaintedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TaintedSand extends TaintedBlock {
    public TaintedSand() {
        super(Block.Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(0.1f, 0.2f)
        );
    }
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.offset(facing));
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.offset(facing));

        if (plant.getBlock() == Blocks.CACTUS || plant.getBlock() == Blocks.SUGAR_CANE)
            return true;

        else return false;
        }
    }