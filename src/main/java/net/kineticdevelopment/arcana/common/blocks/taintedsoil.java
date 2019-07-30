package net.kineticdevelopment.arcana.common.blocks;

import java.util.Random;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.utilities.TaintLevelHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
    	
    	//Grass
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	//Dirt
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
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
