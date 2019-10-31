package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.client.particle.nodes.NormalNodeParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModParticles {

    @SubscribeEvent
    public void registerParticles(final ParticleFactoryRegisterEvent event)
    {
       // System.out.println("Registering particle factories...");
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NORMAL_NODE_PARTICLE, new NormalNodeParticle.Factory());
    }

    @SubscribeEvent
    public static void registerParticles(final RegistryEvent.Register<ParticleType<?>> event)
    {
        //System.out.println("Registering particles...");
        BasicParticleType type = ArcanaParticles.NORMAL_NODE_PARTICLE;
    }
}
