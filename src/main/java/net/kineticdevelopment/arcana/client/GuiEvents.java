package net.kineticdevelopment.arcana.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GuiEvents
{
    @SubscribeEvent
    public void drawHUD(RenderGameOverlayEvent.Post event)
    {
        Minecraft mc = Minecraft.getInstance();
        PlayerEntity player = (PlayerEntity) mc.getRenderViewEntity();

        if (event.getType() == RenderGameOverlayEvent.ElementType.ALL)
        {

        }
    }

    @SubscribeEvent
    public void onRenderGuiPre(RenderGameOverlayEvent.Pre event)
    {
        /**
         * Example of canceling rendergameoverlayevents

        if (event.getType() == RenderGameOverlayEvent.ElementType.HEALTH || event.getType() == RenderGameOverlayEvent.ElementType.FOOD || event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE || event.getType() == RenderGameOverlayEvent.ElementType.ARMOR) {
            event.setCanceled(true);
        }
         */
    }

    public float calculatePercentage(final float input, final float max) {
        return input * 100.0f / max;
    }

    public float calculateper(final float input) {
        final int max = 20;
        return input * 100.0f / max;
    }
}
