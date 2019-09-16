package kineticdevelopment.common.utils.eventbus;


import kineticdevelopment.common.utils.taint.TaintLevelHandler;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TaintLevelStarter {
    @SubscribeEvent
    public static void onWorldLoad(WorldEvent.Load event) {
        TaintLevelHandler.createTaintLevelFile(event.getWorld().getWorld());
    }
}