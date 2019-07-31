package net.kineticdevelopment.arcana.utilities;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

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
        // iterate {x, y, z} through {-2, -1, 0, 1, 2}
        for (int x = -2; x < 3; x++) {
            for (int y = -2; y < 3; y++) {
                for (int z = -2; z < 3; z++) {
                    if (DirtProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.DIRT.getDefaultState());
                    }
                }

            }
        }
    }
}
