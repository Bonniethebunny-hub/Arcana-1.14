package kineticdevelopment.arcana.common.nodes;

import kineticdevelopment.arcana.common.tile_entities.NormalNodeTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class NormalNode extends Node {

    public NormalNode(Properties p_i48440_1_) { super(p_i48440_1_); }

    @Override
    public TileEntity createNewTileEntity(IBlockReader p_196283_1_) {
        return setEntity(new NormalNodeTileEntity());
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        removeEntity();
        worldIn.playEvent(player, 2001, pos, getStateId(state));
    }
}
