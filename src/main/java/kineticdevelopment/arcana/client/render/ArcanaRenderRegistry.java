package kineticdevelopment.arcana.client.render;

import kineticdevelopment.arcana.common.entities.ManaCreeper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ArcanaRenderRegistry {

    public static void registryEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(ManaCreeper.class, new ManaCreeperRender.RenderFactory());
    }
}
