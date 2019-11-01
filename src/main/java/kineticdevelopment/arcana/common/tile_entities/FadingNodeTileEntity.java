package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.bright_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.fading_node_entity;

public class FadingNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public FadingNodeTileEntity() { super(fading_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            ClientPlayerEntity player = Minecraft.getInstance().player;
            World playerWorld = player.getEntityWorld();
            int priority = getHelmetPriority();
            if(priority > 0) {
                playerWorld.addParticle(ArcanaParticles.FADING_NODE_PARTICLE, true, getParticleX(), getParticleY(), getParticleZ(), 0, 0, 0);
            }
            if(priority > 1 && getBlockOnCursor(player, playerWorld)) {
                playerWorld.addParticle(ArcanaParticles.ASPECT_DARKNESS_PARTICLE, true, getParticleX(), getParticleY() + 1, getParticleZ(), 0, 0, 0);
            }
        }
    }

    public double getParticleX() {
        return getPos().getX() + 0.5d;
    }

    public double getParticleY() {
        return getPos().getY() + 0.5d;
    }

    public double getParticleZ() {
        return getPos().getZ() + 0.5d;
    }

    private int getHelmetPriority() {
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

    private boolean getBlockOnCursor(ClientPlayerEntity player, World playerWorld) {
        double reachDistance = 3;
        Vec3d startPos = new Vec3d(player.getPositionVector().getX(), player.getPositionVector().getY() + player.getEyeHeight(), player.getPositionVector().getZ());
        Vec3d look = player.getLook(1.0F);
        Vec3d endPos = startPos.add(look.getX() * reachDistance, look.getY() * reachDistance, look.getZ() * reachDistance);
        RayTraceResult result = playerWorld.rayTraceBlocks(new RayTraceContext(startPos, endPos, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player));
        return playerWorld.getBlockState(new BlockPos(result.getHitVec())).getBlock().getRegistryName().toString().equals("arcana:fading_node");
    }
}
