package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.api.registry.ArcanaTileEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.registry.Bootstrap;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.*;

public class BrightNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public BrightNodeTileEntity() { super(bright_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            Minecraft.getInstance().player.getEntityWorld().addParticle(ArcanaParticles.BRIGHT_NODE_PARTICLE, true, getParticleX(), getParticleY(), getParticleZ(), 0, 0, 0);
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
}
