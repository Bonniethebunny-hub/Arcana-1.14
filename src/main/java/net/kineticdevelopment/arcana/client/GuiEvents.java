package net.kineticdevelopment.arcana.client;

import com.mojang.blaze3d.platform.GlStateManager;
import net.kineticdevelopment.arcana.client.gui.RenderHelper;
import net.kineticdevelopment.arcana.common.armor.AspectGogglesHelmet;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.GL11;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GuiEvents {
    @SubscribeEvent
    public void drawHUD(RenderGameOverlayEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        PlayerEntity player = (PlayerEntity) mc.getRenderViewEntity();

        if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof AspectGogglesHelmet) {
                GL11.glPushMatrix();

                // ASPECT GOGGLES
                RenderHelper.renderText("Aspect Goggles: ", 20, 20, 1006063360);

                GlStateManager.disableBlend();
                GL11.glPopMatrix();
            }
        }
    }

    @SubscribeEvent
    public void onRenderGuiPre(RenderGameOverlayEvent.Pre event) {
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
