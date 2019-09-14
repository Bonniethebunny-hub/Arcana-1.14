package net.kineticdevelopment.arcana.client.renders.sins;

import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.client.models.sins.PrideModel;
import net.kineticdevelopment.arcana.common.entities.sins.PrideDemon;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class PrideRenderer extends LivingRenderer<PrideDemon, PrideModel<PrideDemon>>
{
    public PrideRenderer(EntityRendererManager manager)
    {
        super(manager, new PrideModel<PrideDemon>(), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(PrideDemon entity)
    {
        return RegistryHandler.location("textures/entity/pride_demon.png");
    }

    public static class RenderFactory implements IRenderFactory<PrideDemon>
    {
        @Override
        public EntityRenderer<? super PrideDemon> createRenderFor(EntityRendererManager manager)
        {
            return new PrideRenderer(manager);
        }
    }

}