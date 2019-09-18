package net.kineticdevelopment.arcana.client.renders;


import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.client.models.TaintedSpiderModel;
import net.kineticdevelopment.arcana.common.entities.TaintedSpider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer; //leave for now, see comment block for the ISSUE
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TaintedSpiderRender extends LivingRenderer<TaintedSpider, TaintedSpiderModel>
{
    public TaintedSpiderRender(EntityRendererManager manager)
    {
        super(manager, new TaintedSpiderModel(), 0f);
        /*

        this.addLayer(new SpiderEyesLayer<>(this));
        *
        *Commented to disable the use, but left for easy reimplementation or deletion once a decision is made.
        *ISSUE: SpiderEyesLayer offers no method to change the texture from the default spider eyes layer location,
        *and forge does not offer, at this point in time, a solution. The import has been left for this reason.
        *
        *Suggested Course of Action: Just leave out a spider eyes layer, not likely going to be noticed by anyone and can be explained away via lore
         */
        
        /*
         * Solution: Make a copy of the SpiderEyesLayer class, and direct it to custom texture, simple fix
         */
    }

    @Override
    protected ResourceLocation getEntityTexture(TaintedSpider entity)
    {
        return RegistryHandler.location("textures/entity/tainted_spider.png");
    }

    public static class RenderFactory implements IRenderFactory<TaintedSpider>
    {
        @Override
        public EntityRenderer<? super TaintedSpider> createRenderFor(EntityRendererManager manager)
        {
            return new TaintedSpiderRender(manager);
        }
    }

}
