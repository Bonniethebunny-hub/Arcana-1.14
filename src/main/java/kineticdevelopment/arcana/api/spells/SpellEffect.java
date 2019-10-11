package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;

public interface SpellEffect {

    AspectType getType();

    // Effect on block position
    void getEffect(BlockState block, int power);

    // Effect on entity
    void getEffect(LivingEntity entity, int power);

}
