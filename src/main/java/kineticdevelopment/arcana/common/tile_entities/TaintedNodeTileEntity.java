package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.client.helpers.ArcanaHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.*;

public class TaintedNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public TaintedNodeTileEntity() { super(tainted_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            Minecraft instance = Minecraft.getInstance();
            World playerWorld = instance.player.getEntityWorld();
            int priority = ArcanaHelper.getGogglesPriority();
            Vec3d particleLocation = null;
            if(priority >= ArcanaHelper.ASPECT_GOGGLES_PRIORITY) {
                particleLocation = ArcanaHelper.getTileEntityCenteredParticle(this);
                playerWorld.addParticle(ArcanaParticles.TAINTED_NODE_PARTICLE, true, particleLocation.getX(), particleLocation.getY(), particleLocation.getZ(), 0, 0, 0);
            }
            if(priority >= ArcanaHelper.GOGGLES_OF_REVEALING_PRIORITY && ArcanaHelper.isBlockOnCursor(instance, "arcana:tainted_node")) {
                playerWorld.addParticle(ArcanaParticles.ASPECT_TAINT_PARTICLE, true, particleLocation.getX(), particleLocation.getY() + 1, particleLocation.getZ(), 0, 0, 0);
            }
        }
    }
}
