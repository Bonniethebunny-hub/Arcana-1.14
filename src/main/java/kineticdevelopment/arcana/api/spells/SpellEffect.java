package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface SpellEffect {

    String getName();

    // Effect on block position
    void getEffect(BlockPos block, World world, int power);

    // Effect on entity
    void getEffect(LivingEntity entity, int power);

}
