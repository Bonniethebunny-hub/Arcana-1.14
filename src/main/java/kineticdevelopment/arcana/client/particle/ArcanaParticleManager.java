package kineticdevelopment.arcana.client.particle;

import kineticdevelopment.arcana.api.registry.ArcanaParticleTypes;
import kineticdevelopment.arcana.client.particle.nodes.NormalNodeParticle;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ArcanaParticleManager extends ParticleManager{

    public ArcanaParticleManager(World p_i1220_1_, TextureManager p_i1220_2_) {
        super(p_i1220_1_, p_i1220_2_);
    }

    private void registerFactories() {
        this.registerFactory(ArcanaParticleTypes.NORMAL_NODE_PARTICLE, new NormalNodeParticle.Factory());
    }
}
