package kineticdevelopment.arcana.client.particles.numbers;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AspectNumberParticle extends SpriteTexturedParticle {

    protected static float scale = 0.05F;
    protected static float scaleSpace = 0.15F;

    public AspectNumberParticle(World p_i48192_1_, double p_i48192_2_, double p_i48192_4_, double p_i48192_6_, IItemProvider p_i48192_8_) {
        super(p_i48192_1_, p_i48192_2_, p_i48192_4_, p_i48192_6_);
        this.setSprite(Minecraft.getInstance().getItemRenderer().getItemModelMesher().getParticleIcon(p_i48192_8_));
        this.particleGravity = 0.0F;
        this.maxAge = 1;
        this.canCollide = false;
    }

    public IParticleRenderType getRenderType() {
        return IParticleRenderType.TERRAIN_SHEET;
    }

    public static BasicParticleType getNumberParticle(int number) {
        switch (number) {
            case 0:
                return ArcanaParticles.NUMBER_PARTICLE_0;
            case 1:
                return ArcanaParticles.NUMBER_PARTICLE_1;
            case 2:
                return ArcanaParticles.NUMBER_PARTICLE_2;
            case 3:
                return ArcanaParticles.NUMBER_PARTICLE_3;
            case 4:
                return ArcanaParticles.NUMBER_PARTICLE_4;
            case 5:
                return ArcanaParticles.NUMBER_PARTICLE_5;
            case 6:
                return ArcanaParticles.NUMBER_PARTICLE_6;
            case 7:
                return ArcanaParticles.NUMBER_PARTICLE_7;
            case 8:
                return ArcanaParticles.NUMBER_PARTICLE_8;
            case 9:
                return ArcanaParticles.NUMBER_PARTICLE_9;
            default:
                return ParticleTypes.BARRIER;
        }
    }

    public static float getScale() {
        return scale;
    }

    public static float getScaleSpace() {
        return scaleSpace;
    }

    public float getScale(float p_217561_1_) {
        return getScale();
    }

    @Override
    public void renderParticle(BufferBuilder buffer, ActiveRenderInfo entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, 0, 0);
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        public Factory() {
        }

        public Particle makeParticle(BasicParticleType p_199234_1_, World p_199234_2_, double p_199234_3_, double p_199234_5_, double p_199234_7_, double p_199234_9_, double p_199234_11_, double p_199234_13_) {
            return new AspectNumberParticle(p_199234_2_, p_199234_3_, p_199234_5_, p_199234_7_, Blocks.BARRIER.asItem());
        }
    }
}
