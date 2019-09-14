package net.kineticdevelopment.arcana.client.renders;

import net.kineticdevelopment.arcana.client.renders.sins.PrideRenderer;
import net.kineticdevelopment.arcana.common.entities.Koala;
import net.kineticdevelopment.arcana.common.entities.TaintedChicken;
import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.kineticdevelopment.arcana.common.entities.TaintedCreeper;
import net.kineticdevelopment.arcana.common.entities.TaintedPig;
import net.kineticdevelopment.arcana.common.entities.TaintedSlime;
import net.kineticdevelopment.arcana.common.entities.TaintedSpider;
import net.kineticdevelopment.arcana.common.entities.TaintedZombie;
import net.kineticdevelopment.arcana.common.entities.WizardVillager;
import net.kineticdevelopment.arcana.common.entities.sins.PrideDemon;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;



@OnlyIn(Dist.CLIENT)
public class ModRenderRegistry
{
    public static void registryEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(TaintedCow.class, new TaintedCowRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(TaintedZombie.class, new TaintedZombieRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(TaintedPig.class, new TaintedPigRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(TaintedChicken.class, new TaintedChickenRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(TaintedCreeper.class, new TaintedCreeperRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(TaintedSpider.class, new TaintedSpiderRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(TaintedSlime.class, new TaintedSlimeRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(Koala.class, new KoalaRenderer.RenderFactory());
        
        //Sin Demons
        RenderingRegistry.registerEntityRenderingHandler(PrideDemon.class, new PrideRenderer.RenderFactory());

        RenderingRegistry.registerEntityRenderingHandler(WizardVillager.class, new WizardVillagerRender.RenderFactory());
    }
}
