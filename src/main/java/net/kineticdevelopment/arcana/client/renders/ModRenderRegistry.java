package net.kineticdevelopment.arcana.client.renders;

import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ModRenderRegistry
{
    public static void registryEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(TaintedCow.class, new TaintedCowRender.RenderFactory());
    }
}
