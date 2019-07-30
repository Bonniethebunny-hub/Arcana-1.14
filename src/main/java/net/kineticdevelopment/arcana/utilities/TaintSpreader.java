package net.kineticdevelopment.arcana.utilities;

import java.util.ArrayList;
import java.util.List;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TaintSpreader {
	
	@SuppressWarnings("serial")
	static List<Block> TaintedSoilProspects = new ArrayList<Block>() {{
		add(Blocks.GRASS_BLOCK);
		add(Blocks.DIRT);
		add(Blocks.COARSE_DIRT);
		add(Blocks.GRASS_PATH);
		add(Blocks.FARMLAND);
	}};
	
	@SuppressWarnings("serial")
	static List<Block> TaintedRockProspects = new ArrayList<Block>() {{
		add(Blocks.COBBLESTONE);
		add(Blocks.STONE);
		add(Blocks.DIORITE);
		add(Blocks.ANDESITE);
		add(Blocks.GRANITE);
		add(Blocks.STONE_BRICKS);
		add(Blocks.CHISELED_STONE_BRICKS);
		add(Blocks.CRACKED_STONE_BRICKS);
		add(Blocks.MOSSY_STONE_BRICKS);
		add(Blocks.MOSSY_COBBLESTONE);
	}};
	
	@SuppressWarnings("serial")
	static List<Block> TaintedCrustProspects = new ArrayList<Block>() {{
		add(Blocks.BLACK_CONCRETE);
		add(Blocks.WHITE_CONCRETE);
		add(Blocks.GREEN_CONCRETE);
		add(Blocks.GRAY_CONCRETE);
		add(Blocks.PINK_CONCRETE);
		add(Blocks.PURPLE_CONCRETE);
		add(Blocks.ORANGE_CONCRETE);
		add(Blocks.BLUE_CONCRETE);
		add(Blocks.BROWN_CONCRETE);
		add(Blocks.CYAN_CONCRETE);
		add(Blocks.CLAY);
		add(Blocks.END_STONE);
		add(Blocks.WATER);
	}};
	
	public static void spreadTaint(World worldIn, BlockPos pos) {
		//Tainted Soil
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	if(TaintedSoilProspects.contains(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	//Tainted Rock
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(TaintedRockProspects.contains(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	//Tainted Crust
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	if(TaintedCrustProspects.contains(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock())) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDCRUST.getDefaultState());
    	}
    	
    	//Logs
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, 0, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, 0, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, 0, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, 0, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, 0, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, 0, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, 0, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, 0, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, 1, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, 1, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, 1, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, 1, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, 1, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, 1, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, 1, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, 1, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, 1, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, -1, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, -1, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, -1, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, -1, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(-1, -1, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(1, -1, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, -1, -1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, -1, 1)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(pos.add(0, -1, 0)).get(RotatedPillarBlock.AXIS)), 11);
    	}
    	
    	//Leaves
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.OAK_LEAVES)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDOAKLEAVES.getDefaultState());
    	}
	}
}
