package net.kineticdevelopment.arcana.client;

import com.mojang.blaze3d.platform.GlStateManager;
import net.kineticdevelopment.arcana.client.gui.RenderHelper;
import net.kineticdevelopment.arcana.common.armor.AspectGogglesHelmet;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.GL11;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GuiEvents {
    @SubscribeEvent
    public static void drawHUD(RenderGameOverlayEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        LivingEntity player = (PlayerEntity) mc.getRenderViewEntity();
        PlayerEntity playerEntity = mc.player;
        World world = mc.world;

        if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof AspectGogglesHelmet) {
                GlStateManager.pushMatrix();

                // ASPECT GOGGLES
                BlockPos blockPos = new BlockPos(player.posX, player.posY - 1, player.posZ);
                RenderHelper.renderText(TextFormatting.WHITE + "Aspect Goggles: " + world.getBlockState(blockPos).getPickBlock(null, world, blockPos, playerEntity).toString(), 20, 20, 0xFFFFFF);

                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
            }

            if (((PlayerEntity) player).isCreative()) {
                if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof AspectGogglesHelmet) {
                    return;
                } else {
                    RenderHelper.renderText(TextFormatting.WHITE + "Creative Mode", 20, 20, 0xFFFFFF);
                }
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
