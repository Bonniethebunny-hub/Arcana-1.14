package net.kineticdevelopment.arcana.utilities.effects;

import net.kineticdevelopment.arcana.utilities.DamageSources.DamageSourceTaint;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.common.extensions.IForgeEffect;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;

@ObjectHolder("arcana")
public class Tainted extends Effect implements IForgeEffect {

    public Tainted(EffectType typeIn, int liquidColorIn) {
        super(typeIn, liquidColorIn);
    }

    @Override
    public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        System.out.println("Yote");
    }

    @Override
    public void performEffect(LivingEntity entity, int amplifier) {
        entity.attackEntityFrom(DamageSourceTaint.Taint, 0.5F);
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}
