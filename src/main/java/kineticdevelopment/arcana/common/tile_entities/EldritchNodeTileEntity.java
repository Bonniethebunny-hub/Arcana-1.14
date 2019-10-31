package kineticdevelopment.arcana.common.tile_entities;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.bright_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.eldritch_node_entity;

public class EldritchNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public EldritchNodeTileEntity() {
        super(eldritch_node_entity);
    }

    @Override
    public void tick() {
        if(world.isRemote) {
            System.out.println("TEST");
        }
    }
}
