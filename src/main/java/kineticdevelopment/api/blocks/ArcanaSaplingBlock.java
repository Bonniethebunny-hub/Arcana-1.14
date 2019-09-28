package kineticdevelopment.api.blocks;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.*;
import net.minecraft.block.trees.Tree;
import net.minecraft.state.IntegerProperty;

import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import net.minecraft.world.World;
import java.util.Random;

public class ArcanaSaplingBlock extends SaplingBlock implements IGrowable {

    public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
    public static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    private final Tree tree;


    public ArcanaSaplingBlock(Tree tree, Block.Properties properties)  {
        super(tree, properties);
        this.tree = tree;
        this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
    }


    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        super.tick(state, worldIn, pos, random);
        if (!worldIn.isAreaLoaded(pos, 1))
            return;

        if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
            this.grow(worldIn, pos, state, random);
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {
        return SHAPE;
    }

    //Checks to see if IGrowable can grow
    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {

    }
}
