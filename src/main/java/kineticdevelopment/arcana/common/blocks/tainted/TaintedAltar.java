package kineticdevelopment.arcana.common.blocks.tainted;

import kineticdevelopment.arcana.api.blocks.TaintedBlock;
import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class TaintedAltar extends TaintedBlock {

	public TaintedAltar(Properties properties) {
		super(properties);
	}
	
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if(!worldIn.isRemote) {
			if(player.isSneaking()) {
				TaintLevelHandler.decreaseTaintLevel(worldIn, 1);
				player.sendStatusMessage(new StringTextComponent(String.valueOf(TaintLevelHandler.getTaintLevel(worldIn))), true);
				return true;
			}
			else {
				TaintLevelHandler.increaseTaintLevel(worldIn, 1);
				player.sendStatusMessage(new StringTextComponent(String.valueOf(TaintLevelHandler.getTaintLevel(worldIn))), true);
				return true;
			}
		}
		return false;
	}
	
	@Override
    public boolean isSolid(BlockState state) {
        return false;
    }
}
