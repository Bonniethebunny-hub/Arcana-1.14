package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.client.particle.nodes.*;
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
    public static void registerParticles(final ParticleFactoryRegisterEvent event)
    {
        //System.out.println("Registering particle factories...");
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.BRIGHT_NODE_PARTICLE, new BrightNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ELDRITCH_NODE_PARTICLE, new EldritchNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.FADING_NODE_PARTICLE, new FadingNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.HUNGRY_NODE_PARTICLE, new HungryNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NORMAL_NODE_PARTICLE, new NormalNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.PURE_NODE_PARTICLE, new PureNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.TAINTED_NODE_PARTICLE, new TaintedNodeParticle.Factory());
    }

    @SubscribeEvent
    public static void registerParticles(final RegistryEvent.Register<ParticleType<?>> event)
    {
        //System.out.println("Registering particles...");
        BasicParticleType type = ArcanaParticles.BRIGHT_NODE_PARTICLE;
        type = ArcanaParticles.ELDRITCH_NODE_PARTICLE;
        type = ArcanaParticles.FADING_NODE_PARTICLE;
        type = ArcanaParticles.HUNGRY_NODE_PARTICLE;
        type = ArcanaParticles.NORMAL_NODE_PARTICLE;
        type = ArcanaParticles.PURE_NODE_PARTICLE;
        type = ArcanaParticles.TAINTED_NODE_PARTICLE;
    }
}
