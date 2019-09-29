package kineticdevelopment.arcana.common.utils.eventbus;


import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TaintLevelStarter {
    @SubscribeEvent
    public static void onWorldLoad(WorldEvent.Load event) {
        TaintLevelHandler.createTaintLevelFile(event.getWorld().getWorld());
    }
//    To change the fog, mainly for when the taint level gets too high, current color is WAY too pink    
// 	  
//    @SubscribeEvent
//    public static void onFogColor(FogColors event) {
//    	event.setGreen(0);
//    	event.setBlue(228);
//    	event.setRed(228);
//    }
}