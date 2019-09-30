package kineticdevelopment.arcana.common.utils.effect;

import kineticdevelopment.arcana.common.utils.damagesource.TaintDamage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.common.extensions.IForgeEffect;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;

@ObjectHolder("arcana")
public class TaintedEffect extends Effect implements IForgeEffect {

    public TaintedEffect(EffectType typeIn, int liquidColorIn) {

        super(typeIn, liquidColorIn);
    }

    @Override
    public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        System.out.println("Its working :D");
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
