package kineticdevelopment.arcana.client.particles.aspects;

import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class AspectParticle extends SpriteTexturedParticle {

    protected static float scale = 0.15F;
    protected static float scaleSpace = 0.25F;
    protected static float heightFromNode = 0.5F;

    public AspectParticle(World p_i48192_1_, double p_i48192_2_, double p_i48192_4_, double p_i48192_6_, IItemProvider p_i48192_8_) {
        super(p_i48192_1_, p_i48192_2_, p_i48192_4_, p_i48192_6_);
        this.setSprite(Minecraft.getInstance().getItemRenderer().getItemModelMesher().getParticleIcon(p_i48192_8_));
        this.particleGravity = 0.0F;
        this.maxAge = 1;
        this.canCollide = false;
    }

    public IParticleRenderType getRenderType() {
        return IParticleRenderType.TERRAIN_SHEET;
    }

    public static float getScale() {
        return scale;
    }

    public static float getScaleSpace() {
        return scaleSpace;
    }

    public static float getHeightFromNode() {
        return heightFromNode;
    }

    public float getScale(float p_217561_1_) {
        return getScale();
    }

    @Override
    public void renderParticle(BufferBuilder buffer, ActiveRenderInfo entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, 0, 0);
    }

    public static class Factory implements IParticleFactory<BasicParticleType> {
        public Factory() {
        }

        public Particle makeParticle(BasicParticleType p_199234_1_, World p_199234_2_, double p_199234_3_, double p_199234_5_, double p_199234_7_, double p_199234_9_, double p_199234_11_, double p_199234_13_) {
            return new AspectParticle(p_199234_2_, p_199234_3_, p_199234_5_, p_199234_7_, Blocks.BARRIER.asItem());
        }
    }
}
