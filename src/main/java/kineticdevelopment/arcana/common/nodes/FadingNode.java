package kineticdevelopment.arcana.common.nodes;

import kineticdevelopment.arcana.common.tile_entities.FadingNodeTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class FadingNode extends Node {

    public FadingNode(Properties property) {
        super(property);
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader p_196283_1_) {
        return setEntity(new FadingNodeTileEntity());
    }
}
