package kineticdevelopment.arcana.api.blocks;

import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import static net.minecraft.block.LeavesBlock.*;

/**
 * All Arcana tainted leaves blocks should extend this class
 * @see TaintedBlock
 * @see TaintedSlab
 * @see TaintedStairsBlock
 */
public class TaintedLeavesBlock extends TaintedBlock {

    public TaintedLeavesBlock() {
            super(Block.Properties.create(Material.MISCELLANEOUS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(3.0f)
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

  //  public BlockRenderLayer getRenderLayer() {return BlockRenderLayer.CUTOUT_MIPPED;}

    @SuppressWarnings("deprecation")
        @Override
        public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
            worldIn.playEvent(player, 2001, pos, getStateId(state));
            if(!player.isCreative()) {
                TaintLevelHandler.increaseTaintLevel(worldIn, 0.1f);
            }
        }
    }
