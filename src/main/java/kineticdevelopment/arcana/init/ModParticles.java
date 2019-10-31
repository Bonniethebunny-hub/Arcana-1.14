package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.api.registry.ArcanaParticleTypes;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModParticles {

    @SubscribeEvent
    public static void registerParticles(final RegistryEvent.Register<?> event) { ArcanaParticleTypes.registerParticles(); }
}
