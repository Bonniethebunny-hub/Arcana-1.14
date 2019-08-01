package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.client.models.TaintedSlimeModel;
import net.kineticdevelopment.arcana.common.entities.TaintedSlime;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.SlimeGelLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TaintedSlimeRender extends LivingRenderer<TaintedSlime, TaintedSlimeModel>
{
    public TaintedSlimeRender(EntityRendererManager manager)
    {
        super(manager, new TaintedSlimeModel(16), .25F); //TODO, FINISH SLIMES
        this.addLayer(new SlimeGelLayer(this));
    }

    @Override
    protected ResourceLocation getEntityTexture(TaintedSlime entity)
    {
        return EventSubscriber.location("textures/entity/tainted_slime.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedSlime>
    {
        @Override
        public EntityRenderer<? super TaintedSlime> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedSlimeRender(manager);
        }
    }

}
