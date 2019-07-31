package net.kineticdevelopment.arcana.utilities;

import java.util.*;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TaintSpreader {
	
	@SuppressWarnings("serial")
	static Block[] TaintedSoilProspects = {
		Blocks.GRASS_BLOCK,
		Blocks.DIRT,
		Blocks.COARSE_DIRT,
		Blocks.GRASS_PATH,
		Blocks.FARMLAND,
	};
	
	
	@SuppressWarnings("serial")
	static Block[] TaintedRockProspects = {
		Blocks.COBBLESTONE,
		Blocks.STONE,
		Blocks.DIORITE,
		Blocks.ANDESITE,
		Blocks.GRANITE,
		Blocks.STONE_BRICKS,
		Blocks.CHISELED_STONE_BRICKS,
		Blocks.CRACKED_STONE_BRICKS,
		Blocks.MOSSY_STONE_BRICKS,
		Blocks.MOSSY_COBBLESTONE,
	};
	
	@SuppressWarnings("serial")
	static Block[] TaintedCrustProspects = {
		Blocks.BLACK_CONCRETE,
		Blocks.WHITE_CONCRETE,
		Blocks.GREEN_CONCRETE,
		Blocks.GRAY_CONCRETE,
		Blocks.PINK_CONCRETE,
		Blocks.PURPLE_CONCRETE,
		Blocks.ORANGE_CONCRETE,
		Blocks.BLUE_CONCRETE,
		Blocks.BROWN_CONCRETE,
		Blocks.CYAN_CONCRETE,
		Blocks.CLAY,
		Blocks.END_STONE,
		Blocks.DARK_OAK_LOG,
		Blocks.JUNGLE_LOG
	};

	@SuppressWarnings("serial")
	static Block[] TaintGooProspects = {
		Blocks.JUNGLE_LEAVES,
		Blocks.DARK_OAK_LEAVES,
		Blocks.WATER
	};

	// Ugly instantiation; JDK9 introduces a fancier way but for now we're limited to JDK8
	static HashMap<Block, Block> singleBlockConversions = new HashMap<Block, Block>() {{
		put(Blocks.OAK_LOG, ModBlocks.TAINTEDOAKLOG);
		put(Blocks.OAK_LEAVES, ModBlocks.TAINTEDOAKLEAVES);
		put(Blocks.COAL_ORE, ModBlocks.TAINTEDCOALORE);
		put(Blocks.DIAMOND_ORE, ModBlocks.TAINTEDDIAMONDORE);
		put(Blocks.IRON_ORE, ModBlocks.TAINTEDIRONORE);
		put(Blocks.GOLD_ORE, ModBlocks.TAINTEDGOLDORE);
		put(Blocks.REDSTONE_ORE, ModBlocks.TAINTEDREDSTONEORE);
		put(Blocks.LAPIS_ORE, ModBlocks.TAINTEDLAPISORE);
		put(Blocks.EMERALD_ORE, ModBlocks.TAINTEDEMERALDORE);
		put(ModBlocks.CINNABARORE, ModBlocks.TAINTEDCINNABARORE);
	}};
	
	public static void spreadTaint(World worldIn, BlockPos pos) {

		// Map of <OriginalBlocks -> TaintedBlock>
		// For <OriginalBlock -> TaintedBlock> see singleBlockConversions above
		HashMap<Block[], Block> conversionLists = new HashMap<Block[], Block>(){{
			put(TaintedSoilProspects, ModBlocks.TAINTEDSOIL);
			put(TaintedRockProspects, ModBlocks.TAINTEDROCK);
			put(TaintGooProspects, ModBlocks.TAINTGOO);
			put(TaintedRockProspects, ModBlocks.TAINTEDROCK);
			put(TaintedCrustProspects, ModBlocks.TAINTEDCRUST);
		}};

		// iterate {x, y, z} through {-1, 0, 1}
		for (int x = -1; x<2; x++){
			for (int y = -1; y<2; y++){
				for (int z = -1; z<2; z++){
					BlockPos nPos = pos.add(x, y, z);
					Block b = worldIn.getBlockState(nPos).getBlock();
					boolean changed = false;
					for (Map.Entry<Block[], Block> entry : conversionLists.entrySet()){
						if (Arrays.stream(entry.getKey()).anyMatch(bl -> bl == b)) {
							worldIn.setBlockState(nPos, entry.getValue().getDefaultState());
							changed = true;
							break;
						}
					}

					if (changed){
						continue;
					}

					for (Map.Entry<Block, Block> entry : singleBlockConversions.entrySet()){
						if (entry.getKey() == b) {
							worldIn.setBlockState(nPos, entry.getValue().getDefaultState());
							break;
						}
					}
				}
			}
		}
	}
}
