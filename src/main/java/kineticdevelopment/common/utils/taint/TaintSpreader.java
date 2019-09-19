package kineticdevelopment.common.utils.taint;

import kineticdevelopment.api.blocks.ArcanaBlocks;
import kineticdevelopment.common.blocks.tainted.TaintedCrust;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaintSpreader {

    /**
     * List of blocks tainted soil spreads to
     */
    static Block[] TaintedSoilProspects = {
            Blocks.GRASS_BLOCK,
            Blocks.DIRT,
            Blocks.COARSE_DIRT,
            Blocks.GRASS_PATH,
            Blocks.FARMLAND,
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
            Blocks.MOSSY_COBBLESTONE,
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
            Blocks.POPPY
    };


    @SuppressWarnings("serial")
    static HashMap<Block, Block> singleBlockConversions = new HashMap<Block, Block>() {{
       // put(Blocks.OAK_LOG, ArcanaBlocks.TAINTEDOAKLOG);
        //put(Blocks.OAK_LEAVES, ArcanaBlocks.TAINTEDOAKLEAVES);
        put(Blocks.COAL_ORE, ArcanaBlocks.tainted_coal_ore);
        put(Blocks.DIAMOND_ORE, ArcanaBlocks.tainted_diamond_ore);
        put(Blocks.IRON_ORE, ArcanaBlocks.tainted_iron_ore);
        put(Blocks.GOLD_ORE, ArcanaBlocks.tainted_gold_ore);
        put(Blocks.REDSTONE_ORE, ArcanaBlocks.tainted_redstone_ore);
        put(Blocks.LAPIS_ORE, ArcanaBlocks.tainted_lapis_lazuli_ore);
        put(Blocks.EMERALD_ORE, ArcanaBlocks.tainted_emerald_ore);
        put(ArcanaBlocks.cinnabar_ore, ArcanaBlocks.tainted_cinnabar_ore);
        put(Blocks.SAND, ArcanaBlocks.tainted_sand);
        put(Blocks.RED_SAND, ArcanaBlocks.tainted_sand);
        put(Blocks.GRAVEL, ArcanaBlocks.tainted_gravel);
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
               // put(TaintedFlowerProspects, ArcanaBlocks.TAINTEDFLOWER);
            }};

            // iterate {x, y, z} through {-1, 0, 1}
            for (int x = -1; x < 2; x++) {
                for (int y = -1; y < 2; y++) {
                    for (int z = -1; z < 2; z++) {
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
