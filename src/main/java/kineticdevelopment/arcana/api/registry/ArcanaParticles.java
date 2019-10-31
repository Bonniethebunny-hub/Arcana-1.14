package kineticdevelopment.arcana.api.registry;

import kineticdevelopment.arcana.client.particle.nodes.NormalNodeParticle;
import kineticdevelopment.arcana.core.Arcana;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ArcanaParticles {

    public static final BasicParticleType NORMAL_NODE_PARTICLE = register(Arcana.MOD_ID + ":normal_node_particle", true);

    private static BasicParticleType register(String key, boolean alwaysShow) {
        System.out.println("Registering particle: " + key);
        return (BasicParticleType) Registry.<ParticleType<? extends IParticleData>>register(Registry.PARTICLE_TYPE, key, new BasicParticleType(alwaysShow));
    }

    private static <T extends IParticleData> ParticleType<T> register(String key, IParticleData.IDeserializer<T> deserializer) {
        return Registry.register(Registry.PARTICLE_TYPE, key, new ParticleType<>(false, deserializer));
    }
}
