package kineticdevelopment.arcana.api.spells.effects;

import kineticdevelopment.arcana.api.spells.ISpellEffect;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpellEffectFire implements ISpellEffect {
    @Override
    public String getName() {
        return "FIRE";
    }

    @Override
    public void getEffect(BlockPos block, World world, int power) {
        if(!world.getBlockState(block.add(0,1,0)).getMaterial().isReplaceable()) {
            world.setBlockState(block.add(0, 1, 0), Blocks.FIRE.getDefaultState());
        } else {
            world.setBlockState(block, Blocks.FIRE.getDefaultState());
        }
    }

    @Override
    public void getEffect(LivingEntity entity, int power) {
        entity.setFire(power * 3);
    }

    @Override
    public BasicParticleType getParticle() {
        return ParticleTypes.FLAME;
    }

    @Override
    public boolean isAttack() {
        return true;
    }
}
