package kineticdevelopment.arcana.api.spells.effects;

import kineticdevelopment.arcana.api.spells.SpellEffect;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpellEffectEarth implements SpellEffect {

    @Override
    public String getName() {
        return "EARTH";
    }

    @Override
    public void getEffect(BlockPos block, World world, int power) {
        if(!world.getBlockState(block.add(0,1,0)).getMaterial().isReplaceable()) {
            block.add(0, 1, 0);
            world.setBlockState(block, Blocks.GRASS_BLOCK.getDefaultState());
        } else {
            world.setBlockState(block, Blocks.GRASS_BLOCK.getDefaultState());
        }
    }


    @Override
    public void getEffect(LivingEntity entity, int power) {
        entity.setHealth(entity.getHealth() + power);
    }

    @Override
    public BasicParticleType getParticle() {
        return ParticleTypes.FLAME;
    }

}
