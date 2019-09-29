package kineticdevelopment.arcana.api.spells.effects;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.api.spells.SpellEffect;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent;

public class SpellEffectEarth implements SpellEffect {

    @Override
    public Aspect.AspectType getType() {
        return Aspect.AspectType.EARTH;
    }

    @Override
    public void getEffect(BlockState block, int power) {

    }


    @Override
    public void getEffect(LivingEntity entity, int power) {
        entity.setHealth(entity.getHealth() - power );
    }

}
