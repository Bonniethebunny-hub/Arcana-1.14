package net.kineticdevelopment.arcana.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;


public class silverwoodsapling extends BushBlock implements IGrowable {
	public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    private final Tree tree;
    
    public silverwoodsapling(Tree tree, Block.Properties properties) {
        super(Block.Properties.create(Material.BAMBOO_SAPLING)
                .sound(SoundType.BAMBOO_SAPLING)
                .hardnessAndResistance(3.0f)
        );
        this.tree = tree;
        this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
        setRegistryName("silverwoodsapling");
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
       return SHAPE;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
       super.tick(state, worldIn, pos, random);
       if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
       if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
          this.grow(worldIn, pos, state, random);
       }

    }

    public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
       if (state.get(STAGE) == 0) {
          worldIn.setBlockState(pos, state.cycle(STAGE), 4);
       } else {
          if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos)) return;
          this.tree.spawn(worldIn, pos, state, rand);
       }

    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
       return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
       return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
       this.grow(worldIn, pos, state, rand);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
       builder.add(STAGE);
    }
}
