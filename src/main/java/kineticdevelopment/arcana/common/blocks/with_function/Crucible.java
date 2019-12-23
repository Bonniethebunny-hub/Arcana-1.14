package kineticdevelopment.arcana.common.blocks.with_function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
//import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class Crucible extends Block {
    public Crucible() {
        super(Block.Properties.create(Material.ROCK)
                .sound(SoundType.ANVIL)
                .hardnessAndResistance(0.0f)
        );

    }

    @Override
    public boolean isSolid(BlockState state) {
        return false;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.fullCube();
    }

   // public BlockRenderLayer getRenderLayer() {return BlockRenderLayer.CUTOUT_MIPPED;}
}
