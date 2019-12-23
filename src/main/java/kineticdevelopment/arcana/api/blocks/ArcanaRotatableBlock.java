package kineticdevelopment.arcana.api.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.CarvedPumpkinBlock;
//import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

/**
 * All Arcana rotatable blocks should extend this class
 */
public class ArcanaRotatableBlock extends CarvedPumpkinBlock {
    public ArcanaRotatableBlock(Properties properties) {
        super(properties);

    }

    @Override
    public boolean isSolid(BlockState state) {
        return false;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.fullCube();
    }

  //  public BlockRenderLayer getRenderLayer() { return BlockRenderLayer.CUTOUT_MIPPED;}
}
