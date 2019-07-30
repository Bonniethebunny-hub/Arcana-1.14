package net.kineticdevelopment.arcana.client.gui;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class RenderHelper {
    public static void renderText(String text, int posX, int posY, int color) {
        Minecraft mc = Minecraft.getInstance();
        mc.fontRenderer.drawString(text, posX, posY, color);
    }

    public static void renderTextScaled(String text, int posX, int posY, int color, double givenScale) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(posX, posY, 0.0D);
        GlStateManager.scaled(givenScale, givenScale, givenScale);
        renderText(text, 0, 0, color);
        GlStateManager.popMatrix();
    }
}
