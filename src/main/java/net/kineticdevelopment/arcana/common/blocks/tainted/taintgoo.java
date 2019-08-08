package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.kineticdevelopment.arcana.common.init.ModPotions;
import net.kineticdevelopment.arcana.utilities.taint.TaintLevelHandler;
import net.kineticdevelopment.arcana.utilities.taint.TaintSpreader;
import net.minecraft.block.*;
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

import java.util.Random;

public class taintgoo extends Block {
	
    public taintgoo() {
        super(Block.Properties.create(Material.MISCELLANEOUS)
            .sound(SoundType.SLIME)
            .hardnessAndResistance(3.0f)
        );
        setRegistryName("taintgoo");
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        TaintSpreader.spreadTaint(worldIn, pos);
    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
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
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) entityIn;

            entity.addPotionEffect(new EffectInstance(ModPotions.TAINTED, 60, 1, false, true));
            entity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 60, 3, false, true));
            entity.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 60, 3, false, true));
        }
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
        if(!player.isCreative()) {
        	TaintLevelHandler.increaseTaintLevel(worldIn, 0.1d);
        }
    }
}
