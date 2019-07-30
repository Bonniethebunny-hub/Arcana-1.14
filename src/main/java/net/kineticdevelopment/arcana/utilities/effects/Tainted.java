package net.kineticdevelopment.arcana.utilities.effects;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.extensions.IForgeEffect;
import net.minecraftforge.registries.ObjectHolder;

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
		entity.attackEntityFrom(DamageSource.MAGIC, 0.5F);
	}
	
	@Override
	public boolean isReady(int duration, int amplifier) {
	      return true;
	   }
}
