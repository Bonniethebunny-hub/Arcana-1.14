package kineticdevelopment.arcana.client.helpers;

import kineticdevelopment.arcana.common.armour.AspectGogglesHelmet;
import kineticdevelopment.arcana.common.armour.GogglesPriority;
import kineticdevelopment.arcana.common.tile_entities.NodeTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ArcanaHelper {

    /**
     * Helper function to check if the block the character is looking at matches the given registry name
     * @param match Blockstate of block to check
     * @return - <b>True</b> If the blockstates are equal
     */
    public static boolean isBlockOnCursor(BlockState match) {
        World w = Minecraft.getInstance().world;
        RayTraceResult over = Minecraft.getInstance().objectMouseOver;
        if (over.getType() == RayTraceResult.Type.BLOCK && over instanceof BlockRayTraceResult) {
            BlockPos at = ((BlockRayTraceResult) over).getPos();
            return match.equals(w.getBlockState(at));
        }
        return false; //Not looking at a block atm.
    }
    
    
    public static boolean isNodeOnCursor(NodeTileEntity match) {
        World w = Minecraft.getInstance().world;
        RayTraceResult over = Minecraft.getInstance().objectMouseOver;
        if (over.getType() == RayTraceResult.Type.BLOCK && over instanceof BlockRayTraceResult) {
            BlockPos at = ((BlockRayTraceResult) over).getPos();
            return match.getPos().equals(((BlockRayTraceResult) over).getPos());
        }
        return false; //Not looking at a node atm.
    }

    public static GogglesPriority getGogglePriority() {
        ClientPlayerEntity player = Minecraft.getInstance().player;
        return !player.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()
                ? ((AspectGogglesHelmet)player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem()).getPriority()
                : GogglesPriority.SHOW_NONE;
    }

    public static Vec3d getTileEntityCenteredParticle(TileEntity tile) {
        return new Vec3d(tile.getPos().getX() + 0.5f, tile.getPos().getY() + 0.5f, tile.getPos().getZ() + 0.5f);
    }

    public static boolean playerCanSeeNodes() {
        ClientPlayerEntity player = Minecraft.getInstance().player;
        return !player.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty() ? player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof AspectGogglesHelmet : false;
    }
}
