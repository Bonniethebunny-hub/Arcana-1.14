package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.client.models.WizardVillagerModel;
import net.kineticdevelopment.arcana.common.entities.WizardVillager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class WizardVillagerRender extends LivingRenderer<WizardVillager, WizardVillagerModel>
{

    public WizardVillagerRender(EntityRendererManager manager)
    {
        super(manager, new WizardVillagerModel(0.0F), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(WizardVillager entity)
    {
        return RegistryHandler.location("textures/entity/villager_wizard.png");
    }

    public static class RenderFactory implements IRenderFactory<WizardVillager>
    {
        @Override
        public EntityRenderer<? super WizardVillager> createRenderFor(EntityRendererManager manager)
        {
            return new WizardVillagerRender(manager);
        }
    }
}
