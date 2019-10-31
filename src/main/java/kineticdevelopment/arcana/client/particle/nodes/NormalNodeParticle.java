package kineticdevelopment.arcana.client.particle.nodes;

import jdk.nashorn.internal.runtime.regexp.joni.constants.NodeType;
import kineticdevelopment.arcana.api.registry.ArcanaNodes;
import kineticdevelopment.arcana.common.nodes.Node;
import kineticdevelopment.arcana.core.Arcana;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.*;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.w3c.dom.NodeList;

@OnlyIn(Dist.CLIENT)
public class NormalNodeParticle extends SpriteTexturedParticle {

    private NormalNodeParticle(World p_i48192_1_, double p_i48192_2_, double p_i48192_4_, double p_i48192_6_, IItemProvider p_i48192_8_) {
        super(p_i48192_1_, p_i48192_2_, p_i48192_4_, p_i48192_6_);
        this.setSprite(Minecraft.getInstance().getItemRenderer().getItemModelMesher().getParticleIcon(p_i48192_8_));
        this.particleGravity = 0.0F;
        this.maxAge = 80;
        this.canCollide = false;
    }

    public IParticleRenderType getRenderType() {
        return IParticleRenderType.TERRAIN_SHEET;
    }

    public float getScale(float p_217561_1_) {
        return 0.5F;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        public Factory() {
        }

        public Particle makeParticle(BasicParticleType p_199234_1_, World p_199234_2_, double p_199234_3_, double p_199234_5_, double p_199234_7_, double p_199234_9_, double p_199234_11_, double p_199234_13_) {
            return new NormalNodeParticle(p_199234_2_, p_199234_3_, p_199234_5_, p_199234_7_, ArcanaNodes.normal_node.asItem());
        }
    }
}
