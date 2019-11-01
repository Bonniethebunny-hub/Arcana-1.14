package kineticdevelopment.arcana.common.nodes;

import kineticdevelopment.arcana.common.tile_entities.BrightNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.TaintedNodeTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class TaintedNode extends Node {

    public TaintedNode(Properties property) {
        super(property);
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader p_196283_1_) {
        return setEntity(new TaintedNodeTileEntity());
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        removeEntity();
        worldIn.playEvent(player, 2001, pos, getStateId(state));
    }

}
