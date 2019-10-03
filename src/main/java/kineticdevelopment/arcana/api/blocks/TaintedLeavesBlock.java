package kineticdevelopment.arcana.api.blocks;

import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TaintedLeavesBlock extends TaintedBlock {

        public TaintedLeavesBlock() {
            super(Block.Properties.create(Material.MISCELLANEOUS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(3.0f)
            );
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
            return VoxelShapes.fullCube();
        }

        public BlockRenderLayer getRenderLayer() {
            return BlockRenderLayer.TRANSLUCENT;
        }

        @SuppressWarnings("deprecation")
        @OnlyIn(Dist.CLIENT)
        public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }

        @Override
        public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
            worldIn.playEvent(player, 2001, pos, getStateId(state));
            if(!player.isCreative()) {
                TaintLevelHandler.increaseTaintLevel(worldIn, 0.1f);
            }
        }
    }
