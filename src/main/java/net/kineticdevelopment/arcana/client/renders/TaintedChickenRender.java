package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.client.models.TaintedChickenModel;
import net.kineticdevelopment.arcana.common.entities.TaintedChicken;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TaintedChickenRender extends LivingRenderer<TaintedChicken, TaintedChickenModel>
{
    public TaintedChickenRender(EntityRendererManager manager)
    {
        super(manager, new TaintedChickenModel(), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(TaintedChicken entity)
    {
        return EventSubscriber.location("textures/entity/tainted_chicken.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedChicken>
    {
        @Override
        public EntityRenderer<? super TaintedChicken> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedChickenRender(manager);
        }
    }

}
