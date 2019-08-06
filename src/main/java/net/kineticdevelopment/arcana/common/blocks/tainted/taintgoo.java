package net.kineticdevelopment.arcana.common.blocks.tainted;

import java.util.Random;

import net.kineticdevelopment.arcana.common.init.ModPotions;
<<<<<<< HEAD
import net.kineticdevelopment.arcana.utilities.taint.TaintLevelHandler;
import net.kineticdevelopment.arcana.utilities.taint.TaintSpreader;
import net.minecraft.block.*;
=======
import net.kineticdevelopment.arcana.utilities.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

<<<<<<< HEAD
import java.util.Random;

public class taintgoo extends Block {
	
    public taintgoo() {
        super(Block.Properties.create(Material.MISCELLANEOUS)
            .sound(SoundType.SLIME)
            .hardnessAndResistance(3.0f)
        );
        setRegistryName("taintgoo");
    }

    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack) {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
            double d0 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            double d1 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            double d2 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            ItemEntity itementity = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, stack);
            itementity.setDefaultPickupDelay();
            worldIn.addEntity(itementity);
        }
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        TaintSpreader.spreadTaint(worldIn, pos);
    }
=======
public class taintgoo extends FallingBlock {
    public taintgoo() {
        super(Block.Properties.create(Material.MISCELLANEOUS)
                .sound(SoundType.SLIME)
                .hardnessAndResistance(3.0f)
                .doesNotBlockMovement()
        );
        setRegistryName("taintgoo");
    }
    
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
     }

     /**
      * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
      * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
      * returns its solidified counterpart.
      * Note that this method should ideally consider only the specific face passed in.
      */
     public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, this.tickRate(worldIn));
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
     }

     public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
    	TaintSpreader.spreadTaint(worldIn, pos);
        if (!worldIn.isRemote) {
           this.checkFallable(worldIn, pos);
        }

     }

     private void checkFallable(World worldIn, BlockPos pos) {
        if (worldIn.isAirBlock(pos.down()) || canFallThrough(worldIn.getBlockState(pos.down())) && pos.getY() >= 0) {
           if (!worldIn.isRemote) {
              FallingBlockEntity fallingblockentity = new FallingBlockEntity(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, worldIn.getBlockState(pos));
              this.onStartFalling(fallingblockentity);
              worldIn.addEntity(fallingblockentity);
           }

        }
     }

     protected void onStartFalling(FallingBlockEntity fallingEntity) {
     }

     /**
      * How many world ticks before ticking
      */
     public int tickRate(IWorldReader worldIn) {
        return 2;
     }

     @SuppressWarnings("deprecation")
	public static boolean canFallThrough(BlockState state) {
        Block block = state.getBlock();
        Material material = state.getMaterial();
        return state.isAir() || block == Blocks.FIRE || material.isLiquid() || material.isReplaceable();
     }

     public void onEndFalling(World worldIn, BlockPos pos, BlockState fallingState, BlockState hitState) {
     }

     public void onBroken(World worldIn, BlockPos pos) {
     }
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion

     @OnlyIn(Dist.CLIENT)
     public int getDustColor(BlockState state) {
        return -16777216;
     }
    
    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }
    
<<<<<<< HEAD
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
       return VoxelShapes.fullCube();
    }

=======
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
    
    @SuppressWarnings("deprecation")
	@OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
       return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
    }
    
    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
    	if(entityIn instanceof LivingEntity) {
        	LivingEntity entity = (LivingEntity) entityIn;
        	
        	entity.addPotionEffect(new EffectInstance(ModPotions.TAINTED, 60, 1, false, true));
        	entity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 60, 3, false, true));
        	entity.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 60, 3, false, true));
        }
    }
    
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
        TaintLevelHandler.increaseTaintLevel(worldIn, 1);
        spawnAsEntity(worldIn, pos, new ItemStack(this));
    }
    
    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack) {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
           double d0 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d1 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d2 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
           itementity.setDefaultPickupDelay();
           worldIn.addEntity(itementity);
        }
    }
}
