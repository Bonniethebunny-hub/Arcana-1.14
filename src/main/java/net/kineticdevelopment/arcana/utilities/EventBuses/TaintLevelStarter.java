package net.kineticdevelopment.arcana.utilities.EventBuses;

import net.kineticdevelopment.arcana.utilities.TaintLevelHandler;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class TaintLevelStarter {

    @SubscribeEvent
    public static void serverStarting(WorldEvent.Load event) {
        TaintLevelHandler.createTaintLevelFile((World) event.getWorld());
    }
}
