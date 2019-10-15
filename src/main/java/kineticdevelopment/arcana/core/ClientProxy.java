package kineticdevelopment.arcana.core;

import kineticdevelopment.arcana.client.screen.ThaumonomiconScreen;
import kineticdevelopment.arcana.init.ModContainers;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.world.World;

import javax.swing.text.html.parser.Entity;

public class ClientProxy extends CommonProxy {

    public ClientProxy(){

    }

    public static void init() {
        ScreenManager.registerFactory(ModContainers.THAUMONOMICON_CONTAINER, ThaumonomiconScreen::new);
    }

    public World getEntityWorld(Entity entity) {
        return Minecraft.getInstance().world;
    }

}

//Add grass colour here :D



