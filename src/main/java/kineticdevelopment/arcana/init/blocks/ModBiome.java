package kineticdevelopment.arcana.init.blocks;

import kineticdevelopment.arcana.common.biomes.TaintBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiome {

    @SubscribeEvent
    public static void onBiomeRegistry(final RegistryEvent.Register<Biome> event) {
        event.getRegistry().register(new TaintBiome().setRegistryName("taint_biome"));

    }
}
