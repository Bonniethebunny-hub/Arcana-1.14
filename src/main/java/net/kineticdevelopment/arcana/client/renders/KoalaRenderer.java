package net.kineticdevelopment.arcana.client.renders;

import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.client.models.KoalaModel;
import net.kineticdevelopment.arcana.common.entities.Koala;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class KoalaRenderer extends LivingRenderer<Koala, KoalaModel>
{
    public KoalaRenderer(EntityRendererManager manager)
    {
        super(manager, new KoalaModel(), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Koala entity)
    {
        return RegistryHandler.location("textures/entity/tainted_pig.png");
    }

    public static class RenderFactory implements IRenderFactory<Koala>
    {
        @Override
        public EntityRenderer<? super Koala> createRenderFor(EntityRendererManager manager)
        {
            return new KoalaRenderer(manager);
        }
    }

}