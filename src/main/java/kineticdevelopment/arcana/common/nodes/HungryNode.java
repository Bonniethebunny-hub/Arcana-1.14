package kineticdevelopment.arcana.common.nodes;

import kineticdevelopment.arcana.common.tile_entities.HungryNodeTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class HungryNode extends Node {

    public HungryNode(Properties property) {
        super(property);
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader p_196283_1_) {
        return setEntity(new HungryNodeTileEntity());
    }
}
