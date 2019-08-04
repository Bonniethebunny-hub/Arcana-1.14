package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.client.models.TaintedZombieModel;
import net.kineticdevelopment.arcana.common.entities.TaintedZombie;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;



@OnlyIn(Dist.CLIENT)
public class TaintedZombieRender extends LivingRenderer<TaintedZombie, TaintedZombieModel> {

    public TaintedZombieRender(EntityRendererManager manager)
    {
        super(manager, new TaintedZombieModel(), 0f);
    }


    @Override
    protected ResourceLocation getEntityTexture(TaintedZombie entity) {
        return RegistryHandler.location("textures/entity/tainted_zombie.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedZombie>
    {
        @Override
        public EntityRenderer<? super TaintedZombie> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedZombieRender(manager);
        }
    }
}
