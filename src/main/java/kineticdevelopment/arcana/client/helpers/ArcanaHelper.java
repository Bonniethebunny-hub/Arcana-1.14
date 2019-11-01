package kineticdevelopment.arcana.client.helpers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ArcanaHelper {

    public static final int ASPECT_GOGGLES_PRIORITY = 1;
    public static final int GOGGLES_OF_REVEALING_PRIORITY = 2;

    /**
     * Helper function to check if the block the character is looking at matches the given registry name
     * @param playerInstance Minecraft Instance
     * @param registryName Registry Name of block (Including ModID - Example: "arcana:bright_node")
     * @return - <b>True</b> If registry names match
     */
    public static boolean isBlockOnCursor(Minecraft playerInstance, String registryName) {
        World playerWorld = playerInstance.player.getEntityWorld();
        Vec3d location = playerInstance.objectMouseOver.getHitVec();
        return playerWorld.getBlockState(new BlockPos(location)).getBlock().getRegistryName().toString().equals(registryName);
    }

    public static int getGogglesPriority() {
        String helmet = Minecraft.getInstance().player.inventory.armorInventory.get(3).getItem().getRegistryName().toString();
        switch (helmet) {
            case "arcana:aspect_goggles": {
                return 1;
            }
            case "arcana:goggles_of_revealing": {
                return 2;
            }
            default:
                return 0;
        }
    }

    public static Vec3d getTileEntityCenteredParticle(TileEntity tile) {
        return new Vec3d(tile.getPos().getX() + 0.5f, tile.getPos().getY() + 0.5f, tile.getPos().getZ() + 0.5f);
    }
}
