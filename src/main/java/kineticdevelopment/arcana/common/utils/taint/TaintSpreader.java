package kineticdevelopment.arcana.common.utils.taint;

import kineticdevelopment.arcana.api.registry.ArcanaBlocks;
import kineticdevelopment.arcana.common.blocks.tainted.TaintedCrust;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaintSpreader {

    /**
     * List of blocks tainted grass spreads to
     */

    static Block[] TaintedGrassProspects = {
            Blocks.GRASS_BLOCK,
            Blocks.MYCELIUM
    };

    /**
     * List of blocks tainted soil spreads to
     */

    static Block[] TaintedSoilProspects = {
            Blocks.DIRT,
            Blocks.COARSE_DIRT,
            Blocks.PODZOL,
            Blocks.SANDSTONE
    };

    /**
     * List of blocks tainted rock spreads to
     */
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
            Blocks.MOSSY_COBBLESTONE
    };

    /**
     * List of blocks tainted crust spreads to
     */
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
            Blocks.JUNGLE_LOG,
            Blocks.DARK_OAK_LOG
    };

    /**
     * List of blocks taint goo spreads to
     */
    static Block[] TaintGooProspects = {
            Blocks.JUNGLE_LEAVES,
            Blocks.DARK_OAK_LEAVES
    };

    static Block[] TaintedFlowerProspects = {
            Blocks.CORNFLOWER,
            Blocks.SUNFLOWER,
            Blocks.ROSE_BUSH,
            Blocks.OXEYE_DAISY,
            Blocks.ORANGE_TULIP,
            Blocks.PINK_TULIP,
            Blocks.RED_TULIP,
            Blocks.WHITE_TULIP,
            Blocks.DANDELION,
            Blocks.WITHER_ROSE,
            Blocks.LILY_OF_THE_VALLEY,
            Blocks.ALLIUM,
            Blocks.AZURE_BLUET,
            Blocks.BLUE_ORCHID,
            Blocks.LILAC,
            Blocks.PEONY,
            Blocks.POPPY,
            Blocks.GRASS,
            Blocks.TALL_GRASS
    };


    @SuppressWarnings("serial")
    static HashMap<Block, Block> singleBlockConversions = new HashMap<Block, Block>() {{

        //Trees
        put(Blocks.OAK_LOG, ArcanaBlocks.tainted_oak_log);
        put(Blocks.OAK_LEAVES, ArcanaBlocks.tainted_oak_leaves);
        put(Blocks.OAK_STAIRS, ArcanaBlocks.tainted_plank_stairs);
        put(Blocks.OAK_PLANKS, ArcanaBlocks.tainted_oak_planks);
        put(Blocks.OAK_SLAB, ArcanaBlocks.tainted_plank_slab);

        put(Blocks.ACACIA_LOG, ArcanaBlocks.tainted_acacia_log);
        put(Blocks.STRIPPED_ACACIA_LOG, ArcanaBlocks.tainted_stripped_acacia_log);
        put(Blocks.ACACIA_LEAVES, ArcanaBlocks.tainted_acacia_leaves);
        //put(Blocks.ACACIA_STAIRS, ArcanaBlocks.tainted_acacia_stairs);
        put(Blocks.ACACIA_PLANKS, ArcanaBlocks.tainted_acacia_planks);
        //put(Blocks.ACACIA_SLAB, ArcanaBlocks.tainted_acacia_slab);

        put(Blocks.SPRUCE_LOG, ArcanaBlocks.tainted_spruce_log);
        put(Blocks.STRIPPED_SPRUCE_LOG, ArcanaBlocks.tainted_stripped_spruce_log);
        put(Blocks.SPRUCE_LEAVES, ArcanaBlocks.tainted_spruce_leaves);
        //put(Blocks.SPRUCE_STAIRS, ArcanaBlocks.tainted_spruce_stairs);
        put(Blocks.SPRUCE_PLANKS, ArcanaBlocks.tainted_spruce_planks);
        //put(Blocks.SPRUCE_SLAB, ArcanaBlocks.tainted_spruce_slab);

        put(ArcanaBlocks.dair_log, ArcanaBlocks.tainted_dair_log);
        put(ArcanaBlocks.stripped_dair_log, ArcanaBlocks.tainted_stripped_dair_log);
        put(ArcanaBlocks.dair_leaves, ArcanaBlocks.tainted_dair_leaves);
        //put(ArcanaBlocks.dair_stairs, ArcanaBlocks.tainted_dair_stairs);
        put(ArcanaBlocks.dair_planks, ArcanaBlocks.tainted_dair_planks);
        //put(ArcanaBlocks.dair_slab, ArcanaBlocks.tainted_dair_slab);

        //Misc
        put(Blocks.GRASS_PATH, ArcanaBlocks.tainted_path);
        put(Blocks.FARMLAND, ArcanaBlocks.tainted_farmland);
        put(Blocks.SAND, ArcanaBlocks.tainted_sand);
        put(Blocks.RED_SAND, ArcanaBlocks.tainted_sand);
        put(Blocks.GRAVEL, ArcanaBlocks.tainted_gravel);

        //Ores
        put(Blocks.COAL_ORE, ArcanaBlocks.tainted_coal_ore);
        put(Blocks.DIAMOND_ORE, ArcanaBlocks.tainted_diamond_ore);
        put(Blocks.IRON_ORE, ArcanaBlocks.tainted_iron_ore);
        put(Blocks.GOLD_ORE, ArcanaBlocks.tainted_gold_ore);
        put(Blocks.REDSTONE_ORE, ArcanaBlocks.tainted_redstone_ore);
        put(Blocks.LAPIS_ORE, ArcanaBlocks.tainted_lapis_lazuli_ore);
        put(Blocks.EMERALD_ORE, ArcanaBlocks.tainted_emerald_ore);
        //put(ArcanaBlocks.cinnabar_ore, ArcanaBlocks.tainted_cinnabar_ore);

        //Mat. Blocks
        put(Blocks.COBBLESTONE_SLAB, ArcanaBlocks.tainted_rock_slab);
        put(Blocks.REDSTONE_BLOCK, ArcanaBlocks.tainted_redstone_block);
        put(ArcanaBlocks.thaumium_block, ArcanaBlocks.tainted_thaumium_block);
        put(Blocks.LAPIS_BLOCK, ArcanaBlocks.tainted_lapis_block);
        put(Blocks.IRON_BLOCK, ArcanaBlocks.tainted_iron_block);
        put(Blocks.GOLD_BLOCK, ArcanaBlocks.tainted_gold_block);
        put(Blocks.EMERALD_BLOCK, ArcanaBlocks.tainted_emerald_block);
        put(Blocks.DIAMOND_BLOCK, ArcanaBlocks.tainted_diamond_block);
        put(Blocks.COAL_BLOCK, ArcanaBlocks.tainted_coal_block);
        put(ArcanaBlocks.arcanium_block, ArcanaBlocks.tainted_arcanium_block);


        put(ArcanaBlocks.tainted_amber_ore, Blocks.GRASS);
        
        //To be replaced with tainted wood pile
        put(Blocks.OAK_DOOR, Blocks.AIR);
        put(Blocks.OAK_TRAPDOOR, Blocks.AIR);
    }};

    /**
     * Spreads taint
     * @param worldIn
     * @param pos
     */
    @SuppressWarnings("serial")
    public static void spreadTaint(World worldIn, BlockPos pos) {
        if (TaintLevelHandler.getTaintLevel(worldIn.getWorld()) >= 5) {
            // Map of <OriginalBlocks -> TaintedBlock>
            // For <OriginalBlock -> TaintedBlock> see singleBlockConversions above
            HashMap<Block[], Block> conversionLists = new HashMap<Block[], Block>() {{
                put(TaintedSoilProspects, ArcanaBlocks.tainted_soil);
                put(TaintedRockProspects, ArcanaBlocks.tainted_rock);
                put(TaintGooProspects, ArcanaBlocks.tainted_goo);
                put(TaintedRockProspects, ArcanaBlocks.tainted_rock);
                put(TaintedCrustProspects, ArcanaBlocks.tainted_crust);
                put(TaintedFlowerProspects, ArcanaBlocks.tainted_bush);
                put(TaintedGrassProspects, ArcanaBlocks.tainted_grass_block);
            }};
            
            //Increases taint spread by one block for every 10 levels, might need to be upped to a higher threshold, gets laggy fast
            int int1 = -1;
            int int2 = 2;
            //int taintLevel = (int) TaintLevelHandler.getTaintLevel(worldIn);
            
            //for(int p = 10; p < taintLevel; p = p + 10) {
            //	int1 = int1 - 1;
            //	int2 = int2 + 1;
            //}
            
            for (int x = int1; x < int2; x++) {
                for (int y = int1; y < int2; y++) {
                    for (int z = int1; z < int2; z++) {
                        BlockPos nPos = pos.add(x, y, z);
                        Block b = worldIn.getBlockState(nPos).getBlock();
                        boolean changed = false;
                        for (Map.Entry<Block[], Block> entry : conversionLists.entrySet()) {
                            if (Arrays.stream(entry.getKey()).anyMatch(bl -> b.equals(bl.getBlock()))) {
                                if(worldIn.getBlockState(nPos).has(RotatedPillarBlock.AXIS) && !(entry.getValue() instanceof TaintedCrust)) {
                                    worldIn.setBlockState(nPos, entry.getValue().getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(nPos).get(RotatedPillarBlock.AXIS)));
                                }
                                else {
                                    worldIn.setBlockState(nPos, entry.getValue().getDefaultState());
                                }
                                changed = true;
                                break;
                            }
                        }

                        if (changed) {
                            continue;
                        }

                        for (Map.Entry<Block, Block> entry : singleBlockConversions.entrySet()) {
                            if (b.equals(entry.getKey().getBlock())) {
                                if(worldIn.getBlockState(nPos).has(RotatedPillarBlock.AXIS)) {
                                    worldIn.setBlockState(nPos, entry.getValue().getDefaultState().with(RotatedPillarBlock.AXIS, worldIn.getBlockState(nPos).get(RotatedPillarBlock.AXIS)));
                                }
                                else if(worldIn.getBlockState(nPos).has(BlockStateProperties.STAIRS_SHAPE) && !(entry.getValue() instanceof TaintedCrust)) {
                                    worldIn.setBlockState(nPos, entry.getValue().getDefaultState().with(BlockStateProperties.STAIRS_SHAPE, worldIn.getBlockState(nPos).get(BlockStateProperties.STAIRS_SHAPE)).with(HorizontalBlock.HORIZONTAL_FACING, worldIn.getBlockState(nPos).get(HorizontalBlock.HORIZONTAL_FACING)).with(BlockStateProperties.HALF, worldIn.getBlockState(nPos).get(BlockStateProperties.HALF)));
                                }
                                else if(worldIn.getBlockState(nPos).has(BlockStateProperties.SLAB_TYPE)) {
                                    worldIn.setBlockState(nPos, entry.getValue().getDefaultState().with(BlockStateProperties.SLAB_TYPE, worldIn.getBlockState(nPos).get(BlockStateProperties.SLAB_TYPE)));
                                }
                                else {
                                    worldIn.setBlockState(nPos, entry.getValue().getDefaultState());
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
