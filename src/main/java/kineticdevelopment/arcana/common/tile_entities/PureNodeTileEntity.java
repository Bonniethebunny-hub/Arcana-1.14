package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.*;

public class PureNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public PureNodeTileEntity() { super(pure_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            Minecraft.getInstance().player.getEntityWorld().addParticle(ArcanaParticles.PURE_NODE_PARTICLE, true, getParticleX(), getParticleY(), getParticleZ(), 0, 0, 0);
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
