package net.kineticdevelopment.arcana.client.renders;

import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.kineticdevelopment.arcana.common.entities.TaintedPig;
import net.kineticdevelopment.arcana.common.entities.TaintedZombie;
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
    }
}
