package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaTileEntities;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.registry.Bootstrap;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.*;

public class BrightNodeTileEntity extends TileEntity implements ITickableTileEntity {

    public BrightNodeTileEntity() {
        super(bright_node_entity);
    }

    @Override
    public void tick() {
        if(world.isRemote) {
            System.out.println("TEST");
        }
    }
}
