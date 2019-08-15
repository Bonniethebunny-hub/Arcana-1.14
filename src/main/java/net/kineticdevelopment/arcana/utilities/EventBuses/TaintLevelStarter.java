package net.kineticdevelopment.arcana.utilities.EventBuses;

import net.kineticdevelopment.arcana.utilities.taint.TaintLevelHandler;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class TaintLevelStarter {
	@SubscribeEvent
	public static void onWorldLoad(WorldEvent.Load event) {
		TaintLevelHandler.createTaintLevelFile(event.getWorld().getWorld());
	}
}
