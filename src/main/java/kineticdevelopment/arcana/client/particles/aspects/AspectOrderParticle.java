package kineticdevelopment.arcana.client.particles.aspects;

import kineticdevelopment.arcana.api.registry.ArcanaItems;
import kineticdevelopment.arcana.client.particles.nodes.BrightNodeParticle;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AspectOrderParticle extends AspectParticle {

    public AspectOrderParticle(World p_i48192_1_, double p_i48192_2_, double p_i48192_4_, double p_i48192_6_, IItemProvider p_i48192_8_) {
        super(p_i48192_1_, p_i48192_2_, p_i48192_4_, p_i48192_6_, p_i48192_8_);
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        public Factory() {
        }

        public Particle makeParticle(BasicParticleType p_199234_1_, World p_199234_2_, double p_199234_3_, double p_199234_5_, double p_199234_7_, double p_199234_9_, double p_199234_11_, double p_199234_13_) {
            return new BrightNodeParticle(p_199234_2_, p_199234_3_, p_199234_5_, p_199234_7_, ArcanaItems.aspect_order);
        }
    }
}
