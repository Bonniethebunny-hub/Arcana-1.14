package kineticdevelopment.core;

import kineticdevelopment.client.screen.ThaumonomiconScreen;
import kineticdevelopment.init.ModContainers;
import net.minecraft.client.gui.ScreenManager;

public class ClientProxy extends CommonProxy {

    public ClientProxy(){

    }

    public static void init() {
        ScreenManager.registerFactory(ModContainers.THAUMONOMICON_CONTAINER, ThaumonomiconScreen::new);
    }
}

//Add grass colour here :D



