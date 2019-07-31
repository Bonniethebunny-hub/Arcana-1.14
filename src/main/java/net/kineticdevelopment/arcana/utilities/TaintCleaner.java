package net.kineticdevelopment.arcana.utilities;

import java.util.ArrayList;
import java.util.List;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TaintCleaner {
	
	@SuppressWarnings("serial")
	static List<Block> DirtProspects = new ArrayList<Block>() {{
		add(ModBlocks.TAINTEDSOIL);
	}};
	
	@SuppressWarnings("serial")
	static List<Block> CobblestoneProspects = new ArrayList<Block>() {{
		add(ModBlocks.TAINTEDROCK);
		add(ModBlocks.TAINTEDAMBERORE);
		add(ModBlocks.TAINTEDIRONORE);
		add(ModBlocks.TAINTEDGOLDORE);
		add(ModBlocks.TAINTEDDIAMONDORE);
		add(ModBlocks.TAINTEDLAPISORE);
		add(ModBlocks.TAINTEDEMERALDORE);
		add(ModBlocks.TAINTEDCOALORE);
		add(ModBlocks.TAINTEDCINNABARORE);
		add(ModBlocks.TAINTEDREDSTONEORE);
	}};
	
	@SuppressWarnings("serial")
	static List<Block> AirProspects = new ArrayList<Block>() {{
		add(ModBlocks.TAINTEDCRUST);
		add(ModBlocks.TAINTGOO);
	}};
	
	public static void cleanTaint(World worldIn, BlockPos pos) {
		//Dirt
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, 1), Blocks.DIRT.getDefaultState());
    	}
    	
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 0), Blocks.DIRT.getDefaultState());
    	}
    	
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, -1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 1), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 0), Blocks.DIRT.getDefaultState());
    	}
    	
    	//Extra Range
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, 0, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, 0, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, 0, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, 0, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, 0, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, 0, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, 0, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, 0, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, 0, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, 0, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 0, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 0, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, 2), Blocks.DIRT.getDefaultState());
    	}
    	
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, 2, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, 2, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, 2, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, 2, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, 2, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, 2, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, 2, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, 2, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, 2, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, 2, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, 2, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, 2, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 2, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 2, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 2, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 2, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, 2, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 2, 0), Blocks.DIRT.getDefaultState());
    	}
    	
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, -2, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, -2, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, -2, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, -2, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, -2, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, -2, 0), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, -2, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, -2, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(-2, -2, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(-2, -2, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(2, -2, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(2, -2, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, -2, -2)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -2, -2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, -2, 2)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -2, 2), Blocks.DIRT.getDefaultState());
    	}
    	if(DirtProspects.contains(worldIn.getBlockState(pos.add(0, -2, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -2, 0), Blocks.DIRT.getDefaultState());
    	}
	}
}
