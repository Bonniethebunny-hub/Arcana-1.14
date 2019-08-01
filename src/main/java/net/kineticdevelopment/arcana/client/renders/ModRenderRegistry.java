package net.kineticdevelopment.arcana.client.renders;

import net.kineticdevelopment.arcana.common.entities.*;
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
    }
}
