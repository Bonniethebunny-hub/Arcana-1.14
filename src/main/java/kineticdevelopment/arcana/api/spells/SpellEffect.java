package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public interface SpellEffect {

    Aspect.AspectType getType();

    // Effect on block position
    void getEffect(BlockState block, int power);

    // Effect on entity
    void getEffect(LivingEntity entity, int power);

}
