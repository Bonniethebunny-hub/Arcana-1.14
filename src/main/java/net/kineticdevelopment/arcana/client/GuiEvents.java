package net.kineticdevelopment.arcana.client;

import com.mojang.blaze3d.platform.GlStateManager;
import net.java.games.input.Keyboard;
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
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.GL11;

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

                BlockPos blockPos = new BlockPos(player.posX, player.posY, player.posZ);
                int x;
                int y;
                int z;

                for (x = blockPos.getX() - 2; x < 3; x++) {
                    for (z = blockPos.getZ() - 2; z < 3; z++) {
                        for (y = blockPos.getY() - 2; y < 3; y++) {
                            System.out.println(x + "," + y + "," + z);

                            /**
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
                                    10, 20, 0xFFFFFF, 0.6D);**/
                        }
                    }
                }
                
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
