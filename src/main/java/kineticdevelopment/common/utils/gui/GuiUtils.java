package kineticdevelopment.common.utils.gui;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Utils for the GUI's
 * @author MaxIsH0t
 */
public class GuiUtils
{
    /**
     * Draws a Text
     */
    public static void drawText(String text, int posX, int posY, int color) {
        Minecraft minecraft = Minecraft.getInstance();
        minecraft.fontRenderer.drawString(text, posX, posY, color);
    }

    /**
     * Draws a Scaled Text
     */
    public static void drawTextScaled(String text, int posX, int posY, double givenScale, int givenColor) {
        GL11.glPushMatrix();
        GL11.glTranslated((double)posX, (double)posY, 0.0D);
        GL11.glScaled(givenScale, givenScale, givenScale);
        drawText(text, 0, 0, givenColor);
        GL11.glPopMatrix();
    }

    /**
     * Draws an image on to the screen
     */
    public static void drawImage(final double x, final double y, final ResourceLocation image, final double width, final double height)
    {
        final Minecraft mc = Minecraft.getInstance();
        mc.textureManager.bindTexture(image);
        final Tessellator tessellator = Tessellator.getInstance();
        GlStateManager.enableBlend();
        GL11.glEnable(GL11.GL_POINT_SMOOTH);
        final BufferBuilder buffer = tessellator.getBuffer();
        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_COLOR);
        buffer.pos(x, y + height, 0.0).tex(0.0, 1.0).color(255, 255, 255, 255).endVertex();
        buffer.pos(x + width, y + height, 0.0).tex(1.0, 1.0).color(255, 255, 255, 255).endVertex();
        buffer.pos(x + width, y, 0.0).tex(1.0, 0.0).color(255, 255, 255, 255).endVertex();
        buffer.pos(x, y, 0.0).tex(0.0, 0.0).color(255, 255, 255, 255).endVertex();
        tessellator.draw();
        GL11.glDisable(GL11.GL_POINT_SMOOTH);
        GlStateManager.disableBlend();
    }
}
