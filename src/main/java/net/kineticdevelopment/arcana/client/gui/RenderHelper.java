package net.kineticdevelopment.arcana.client.gui;

import net.minecraft.client.Minecraft;

public class RenderHelper {
    public static void renderText(String text, int posX, int posY, int color) {
        Minecraft mc = Minecraft.getInstance();
        mc.fontRenderer.drawString(text, posX, posY, color);
    }
}
