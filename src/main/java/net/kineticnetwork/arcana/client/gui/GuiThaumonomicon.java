package net.kineticnetwork.arcana.client.gui;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.GuiContainerEvent;

@OnlyIn(Dist.CLIENT)
public class GuiThaumonomicon extends GuiContainerEvent
{
    public GuiThaumonomicon(ContainerScreen guiContainer)
    {
        super(guiContainer);
    }
}
