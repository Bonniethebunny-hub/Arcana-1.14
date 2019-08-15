package net.kineticdevelopment.arcana.common.blocks.treeblocks;

import net.kineticdevelopment.arcana.common.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class dairlog extends RotatedPillarBlock {
    public dairlog(Block.Properties properties) {
        super(properties);
        setRegistryName("dairlog");
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (player.getHeldItemMainhand().getItem() instanceof AxeItem) {
            worldIn.setBlockState(pos, BlockInit.STRIPPEDDAIRLOG.getDefaultState().with(RotatedPillarBlock.AXIS, state.get(RotatedPillarBlock.AXIS)), 11);
            player.getHeldItemMainhand().setDamage(player.getHeldItemMainhand().getDamage() + 1);
            return true;
        } else {
            return false;
        }
    }
}
