package net.kineticdevelopment.arcana.client;

import net.kineticdevelopment.arcana.client.screen.ArcaneWorkbenchScreen;
import net.kineticdevelopment.arcana.client.screen.ThaumonomiconScreen;
import net.kineticdevelopment.arcana.client.screen.lootbags.CommonLootbagScreen;
import net.kineticdevelopment.arcana.common.IProxy;
import net.kineticdevelopment.arcana.common.init.ContainerInit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory(ContainerInit.THAUMONOMICON_CONTAINER, ThaumonomiconScreen::new);
        ScreenManager.registerFactory(ContainerInit.ARCANEWORKBENCH_CONTAINER, ArcaneWorkbenchScreen::new);
        ScreenManager.registerFactory(ContainerInit.COMMONLOOTBAG_CONTAINER, CommonLootbagScreen::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
