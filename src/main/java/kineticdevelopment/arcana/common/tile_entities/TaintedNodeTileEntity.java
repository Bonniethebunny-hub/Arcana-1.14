package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.tainted_node_entity;

public class TaintedNodeTileEntity extends TileEntity implements NodeTileEntity, ITickableTileEntity {

    public TaintedNodeTileEntity() { super(tainted_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            switch(getGogglePriority()) {
                case SHOW_NODE:
                    showNode(ArcanaParticles.TAINTED_NODE_PARTICLE);
                    break;
                case SHOW_NODE_AND_ASPECTS:
                    showNodeAndAspects(ArcanaParticles.TAINTED_NODE_PARTICLE);
                    break;
                default:
                    break;
            }
        }
    }
}
