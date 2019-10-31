package kineticdevelopment.arcana.common.tile_entities;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.bright_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.tainted_node_entity;

public class TaintedNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public TaintedNodeTileEntity() {
        super(tainted_node_entity);
    }

    @Override
    public void tick() {
        if(world.isRemote) {
            System.out.println("TEST");
        }
    }
}
