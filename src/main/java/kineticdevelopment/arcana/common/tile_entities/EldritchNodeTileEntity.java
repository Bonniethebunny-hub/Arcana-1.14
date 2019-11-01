package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.*;

public class EldritchNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public EldritchNodeTileEntity() { super(eldritch_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            World playerWorld = Minecraft.getInstance().player.getEntityWorld();
            int priority = getHelmetPriority();
            if(priority > 0) {
                playerWorld.addParticle(ArcanaParticles.ELDRITCH_NODE_PARTICLE, true, getParticleX(), getParticleY(), getParticleZ(), 0, 0, 0);
            }
            if(priority > 1) {

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
}
