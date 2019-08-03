package net.kineticdevelopment.arcana.utilities.EventBuses;

import net.kineticdevelopment.arcana.common.entities.TaintedChicken;
import net.kineticdevelopment.arcana.utilities.DamageSources.DamageSourceTaint;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class MobTaintifier {
	
	@SubscribeEvent
	public static void onMobDeath(LivingDeathEvent event) {
		if(event.getSource().equals(DamageSourceTaint.Taint)) {
			World world = event.getEntityLiving().getEntityWorld();
			LivingEntity subject = (LivingEntity) event.getEntityLiving();
			if(subject instanceof ChickenEntity) {
				LivingEntity taintedsubject = new TaintedChicken(EntityType.CHICKEN, world);
				taintedsubject.posX = subject.posX;
				taintedsubject.posY = subject.posY;
				taintedsubject.posZ = subject.posZ;
				world.addEntity(taintedsubject);
			}
		}
	}
}
