package net.kineticdevelopment.arcana.common.blocks;

import java.util.Random;

import org.apache.http.client.entity.EntityBuilder;

import net.kineticdevelopment.arcana.utilities.TaintLevelHandler;
import net.kineticdevelopment.arcana.utilities.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class taintedsoil extends Block {
    public taintedsoil() {
        super(Block.Properties.create(Material.SAND)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(3.0f)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
                .tickRandomly()
        );
        setRegistryName("taintedsoil");
    }
    
    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }
    
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
    	
    	TaintSpreader.spreadTaint(worldIn, pos);
    }
    
    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
    	if(!worldIn.isRemote) {
    		if(player.getHeldItemMainhand().getItem() instanceof AxeItem)
        	{
        		TaintLevelHandler.increaseTaintLevel((World) worldIn, 10);
        		return true;
        	}
        	else
        	{
        		return false;
        	}
    	}
    	else {
    		return false;
    	}
    }
}
