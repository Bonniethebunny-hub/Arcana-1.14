package kineticdevelopment.arcana.api.spells;

import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface ISpellEffect {

    String getName();

    // Effect on block position
    void getEffect(BlockPos block, World world, int power);

    // Effect on entity
    void getEffect(LivingEntity entity, int power);

    BasicParticleType getParticle();

    boolean isAttack();

}
