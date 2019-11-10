package kineticdevelopment.arcana.common.nodes;

import kineticdevelopment.arcana.common.tile_entities.TaintedNodeTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class TaintedNode extends Node {

    public TaintedNode(Properties property) {
        super(property);
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader p_196283_1_) {
        return setEntity(new TaintedNodeTileEntity());
    }
}
