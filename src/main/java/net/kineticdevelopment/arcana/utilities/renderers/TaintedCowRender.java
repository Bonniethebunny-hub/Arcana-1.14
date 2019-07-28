package net.kineticdevelopment.arcana.utilities.renderers;

import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.kineticdevelopment.arcana.utilities.renderers.models.TaintedCowModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TaintedCowRender extends LivingRenderer<TaintedCow, TaintedCowModel> {
    public TaintedCowRender(EntityRendererManager manager) {
        super(manager, new TaintedCowModel(), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(TaintedCow entity) {
        return EventSubscriber.location("textures/entity/tainted_cow.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedCow>
    {
        @Override
        public EntityRenderer<? super TaintedCow> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedCowRender(manager);
        }
    }
}
