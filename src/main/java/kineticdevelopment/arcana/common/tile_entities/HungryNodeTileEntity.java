package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.hungry_node_entity;

public class HungryNodeTileEntity extends TileEntity implements NodeTileEntity, ITickableTileEntity {

    public HungryNodeTileEntity() { super(hungry_node_entity); }

    @Override
    public void tick() {
        if(world.isRemote()) {
            switch(getGogglePriority()) {
                case SHOW_NODE:
                    showNode(ArcanaParticles.HUNGRY_NODE_PARTICLE);
                    break;
                case SHOW_NODE_AND_ASPECTS:
                    showNodeAndAspects(ArcanaParticles.HUNGRY_NODE_PARTICLE);
                    break;
                default:
                    break;
            }
        }
    }
}
