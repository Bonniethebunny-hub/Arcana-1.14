package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.client.models.TaintedPigModel;
import net.kineticdevelopment.arcana.common.entities.TaintedPig;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TaintedPigRender extends LivingRenderer<TaintedPig, TaintedPigModel>
{
    public TaintedPigRender(EntityRendererManager manager)
    {
        super(manager, new TaintedPigModel(), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(TaintedPig entity)
    {
        return RegistryHandler.location("textures/entity/tainted_pig.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedPig>
    {
        @Override
        public EntityRenderer<? super TaintedPig> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedPigRender(manager);
        }
    }

}
