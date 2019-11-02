package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.eldritch_node_entity;

public class EldritchNodeTileEntity extends TileEntity implements NodeTileEntity, ITickableTileEntity {

    public EldritchNodeTileEntity() { super(eldritch_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            switch(getGogglePriority()) {
                case SHOW_NODE:
                    showNode(ArcanaParticles.ELDRITCH_NODE_PARTICLE);
                    break;
                case SHOW_NODE_AND_ASPECTS:
                    showNodeAndAspects(ArcanaParticles.ELDRITCH_NODE_PARTICLE);
                    break;
                default:
                    break;
            }
        }
    }
}
