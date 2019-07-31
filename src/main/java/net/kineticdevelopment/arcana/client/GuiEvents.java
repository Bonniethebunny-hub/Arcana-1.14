package net.kineticdevelopment.arcana.client;

import com.mojang.blaze3d.platform.GlStateManager;
import net.kineticdevelopment.arcana.client.gui.RenderHelper;
import net.kineticdevelopment.arcana.common.armor.AspectGogglesHelmet;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GuiEvents {
    @SubscribeEvent
    public static void drawHUD(RenderGameOverlayEvent.Post event) throws InterruptedException {
        Minecraft mc = Minecraft.getInstance();
        LivingEntity player = (PlayerEntity) mc.getRenderViewEntity();
        PlayerEntity playerEntity = mc.player;
        World world = mc.world;

        if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof AspectGogglesHelmet) {
                GlStateManager.pushMatrix();

                // X POS
                BlockPos blockPosX = new BlockPos(player.posX - 1, player.posY, player.posZ);
                BlockPos blockPo2X = new BlockPos(player.posX - 2, player.posY, player.posZ);
                BlockPos blockPo3X = new BlockPos(player.posX - 3, player.posY, player.posZ);

                // Y POS
                BlockPos blockPosY = new BlockPos(player.posX, player.posY - 1, player.posZ);
                BlockPos blockPo2Y = new BlockPos(player.posX, player.posY - 2, player.posZ);
                BlockPos blockPo3Y = new BlockPos(player.posX, player.posY - 3, player.posZ);

                // Z POS
                BlockPos blockPosZ = new BlockPos(player.posX, player.posY, player.posZ - 1);
                BlockPos blockPo2Z = new BlockPos(player.posX, player.posY, player.posZ - 2);
                BlockPos blockPo3Z = new BlockPos(player.posX, player.posY, player.posZ - 3);

                // ASPECT GOGGLES
                RenderHelper.renderTextScaled(TextFormatting.RED + "(Press the F key to scan blocks around you)", 10, 10, 0xFFFFFF, 0.8D);
                RenderHelper.renderTextScaled(TextFormatting.WHITE + "Aspect Goggles " + TextFormatting.GREEN + "X: " + TextFormatting.WHITE + ""
                        + world.getBlockState(blockPosX).getPickBlock(null, world, blockPosX, playerEntity).toString() + ", "
                        + world.getBlockState(blockPo2X).getPickBlock(null, world, blockPo2X, playerEntity).toString() + ", "
                        + world.getBlockState(blockPo3X).getPickBlock(null, world, blockPo3X, playerEntity).toString() + " " +

                        TextFormatting.GREEN + "Y: " + TextFormatting.WHITE + ""
                        + world.getBlockState(blockPosY).getPickBlock(null, world, blockPosY, playerEntity).toString() + ", "
                        + world.getBlockState(blockPo2Y).getPickBlock(null, world, blockPo2Y, playerEntity).toString() + ", "
                        + world.getBlockState(blockPo3Y).getPickBlock(null, world, blockPo3Y, playerEntity).toString() + " " +

                        TextFormatting.GREEN + "Z: " + TextFormatting.WHITE + ""
                        + world.getBlockState(blockPosZ).getPickBlock(null, world, blockPosZ, playerEntity).toString() + ", "
                        + world.getBlockState(blockPo2Z).getPickBlock(null, world, blockPo2Z, playerEntity).toString() + ", "
                        + world.getBlockState(blockPo3Z).getPickBlock(null, world, blockPo3Z, playerEntity).toString(),
                    10, 20, 0xFFFFFF, 0.6D);

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
