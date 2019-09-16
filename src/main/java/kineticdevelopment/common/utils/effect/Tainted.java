package kineticdevelopment.common.utils.effect;

import kineticdevelopment.common.utils.damagesource.TaintDamage;
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
    }

    @Override
    public void performEffect(LivingEntity entity, int amplifier) {
        entity.attackEntityFrom(TaintDamage.Taint, 0.5F);
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}
