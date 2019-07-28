package net.kineticdevelopment.arcana.client;

import net.kineticdevelopment.arcana.client.screen.ThaumonomiconScreen;
import net.kineticdevelopment.arcana.common.IProxy;
import net.kineticdevelopment.arcana.common.init.ModContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.world.World;

public class ClientProxy implements IProxy
{
    @Override
    public void init() {
        ScreenManager.registerFactory(ModContainer.THAUMONOMICON_CONTAINER, ThaumonomiconScreen::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
