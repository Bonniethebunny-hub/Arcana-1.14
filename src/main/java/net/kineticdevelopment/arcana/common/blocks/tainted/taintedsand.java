package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.kineticdevelopment.arcana.common.init.ModPotions;
import net.kineticdevelopment.arcana.utilities.taint.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class taintedsand extends Block {
    public taintedsand() {
        super(Block.Properties.create(Material.SAND)
            .sound(SoundType.GROUND)
            .hardnessAndResistance(3.0f)
            .harvestLevel(0)
            .harvestTool(ToolType.SHOVEL)
            .tickRandomly()
        );
        setRegistryName("taintedsand");
    }
    
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
       return false;
    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintSpreader.spreadTaint(worldIn, pos);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) entityIn;

            entity.addPotionEffect(new EffectInstance(ModPotions.TAINTED, 60, 1, false, true));
        }
    }
}
