package kineticdevelopment.arcana.api.registry;

import kineticdevelopment.arcana.client.particle.nodes.NormalNodeParticle;
import kineticdevelopment.arcana.core.Arcana;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ArcanaParticles extends ParticleTypes {

    public static final BasicParticleType BRIGHT_NODE_PARTICLE = register(Arcana.MOD_ID + ":bright_node_particle", true);
    public static final BasicParticleType ELDRITCH_NODE_PARTICLE = register(Arcana.MOD_ID + ":eldritch_node_particle", true);
    public static final BasicParticleType FADING_NODE_PARTICLE = register(Arcana.MOD_ID + ":fading_node_particle", true);
    public static final BasicParticleType HUNGRY_NODE_PARTICLE = register(Arcana.MOD_ID + ":hungry_node_particle", true);
    public static final BasicParticleType NORMAL_NODE_PARTICLE = register(Arcana.MOD_ID + ":normal_node_particle", true);
    public static final BasicParticleType PURE_NODE_PARTICLE = register(Arcana.MOD_ID + ":pure_node_particle", true);
    public static final BasicParticleType TAINTED_NODE_PARTICLE = register(Arcana.MOD_ID + ":tainted_node_particle", true);

    private static BasicParticleType register(String key, boolean alwaysShow) {
        System.out.println("Registering particle: " + key);
        return (BasicParticleType) Registry.<ParticleType<? extends IParticleData>>register(Registry.PARTICLE_TYPE, key, new BasicParticleType(alwaysShow));
    }

    private static <T extends IParticleData> ParticleType<T> register(String key, IParticleData.IDeserializer<T> deserializer) {
        return Registry.register(Registry.PARTICLE_TYPE, key, new ParticleType<>(false, deserializer));
    }
}
