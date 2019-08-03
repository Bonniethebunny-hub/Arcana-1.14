package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.client.models.TaintedCreeperModel;
import net.kineticdevelopment.arcana.common.entities.TaintedCreeper;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TaintedCreeperRender extends LivingRenderer<TaintedCreeper, TaintedCreeperModel>
{
    public TaintedCreeperRender(EntityRendererManager manager)
    {
        super(manager, new TaintedCreeperModel(), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(TaintedCreeper entity)
    {
        return EventSubscriber.location("textures/entity/tainted_creeper.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedCreeper>
    {
        @Override
        public EntityRenderer<? super TaintedCreeper> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedCreeperRender(manager);
        }
    }
}
