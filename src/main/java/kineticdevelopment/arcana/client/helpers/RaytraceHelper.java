package kineticdevelopment.arcana.client.helpers;

import net.minecraft.block.Block;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RaytraceHelper {

    /**
     * Helper function to help get the block the character is looking at
     * @param player - player's client entity
     * @param playerWorld - player's client-side world instance
     * @return - The first block in range on your screen where your cursor is pointing
     */
    public static Block getBlockOnCursor(ClientPlayerEntity player, World playerWorld) {
        double reachDistance = 100;
        Vec3d startPos = new Vec3d(player.getPositionVector().getX(), player.getPositionVector().getY() + player.getEyeHeight(), player.getPositionVector().getZ());
        Vec3d look = player.getLook(1.0F);
        Vec3d endPos = startPos.add(look.getX() * reachDistance, look.getY() * reachDistance, look.getZ() * reachDistance);
        RayTraceResult result = playerWorld.rayTraceBlocks(new RayTraceContext(startPos, endPos, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player));
        return playerWorld.getBlockState(new BlockPos(result.getHitVec())).getBlock();
    }
}
