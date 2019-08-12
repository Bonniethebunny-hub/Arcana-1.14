package net.kineticdevelopment.arcana.utilities.taint;

import net.kineticdevelopment.arcana.common.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class TaintCleaner {

    @SuppressWarnings("serial")
    static List<Block> DirtProspects = new ArrayList<Block>() {{
        add(BlockInit.TAINTEDSOIL);
    }};

    @SuppressWarnings("serial")
    static List<Block> CobblestoneProspects = new ArrayList<Block>() {{
        add(BlockInit.TAINTEDROCK);
        add(BlockInit.TAINTEDAMBERORE);
        add(BlockInit.TAINTEDIRONORE);
        add(BlockInit.TAINTEDGOLDORE);
        add(BlockInit.TAINTEDDIAMONDORE);
        add(BlockInit.TAINTEDLAPISORE);
        add(BlockInit.TAINTEDEMERALDORE);
        add(BlockInit.TAINTEDCOALORE);
        add(BlockInit.TAINTEDCINNABARORE);
        add(BlockInit.TAINTEDREDSTONEORE);
    }};
    
    @SuppressWarnings("serial")
    static List<Block> SandProspects = new ArrayList<Block>() {{
        add(BlockInit.TAINTEDSAND);
    }};
    
    @SuppressWarnings("serial")
    static List<Block> GravelProspects = new ArrayList<Block>() {{
        add(BlockInit.TAINTEDGRAVEL);
    }};
    
    @SuppressWarnings("serial")
    static List<Block> AirProspects = new ArrayList<Block>() {{
        add(BlockInit.TAINTEDCRUST);
        add(BlockInit.TAINTGOO);
    }};
    
    /**
     * Cleans taint with a set radius of 5 in all directions
     * 
     * @see #cleanTaintWithRadius(World, BlockPos, int, int)
     */
    public static void cleanTaint(World worldIn, BlockPos pos) {
    	
        for (int x = -5; x < 6; x++) {
            for (int y = -5; y < 6; y++) {
                for (int z = -5; z < 6; z++) {
                    if (DirtProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.DIRT.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = -5; x < 6; x++) {
            for (int y = -5; y < 6; y++) {
                for (int z = -5; z < 6; z++) {
                    if (CobblestoneProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.COBBLESTONE.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = -5; x < 6; x++) {
            for (int y = -5; y < 6; y++) {
                for (int z = -5; z < 6; z++) {
                    if (AirProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = -5; x < 6; x++) {
            for (int y = -5; y < 6; y++) {
                for (int z = -5; z < 6; z++) {
                    if (SandProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.SAND.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = -5; x < 6; x++) {
            for (int y = -5; y < 6; y++) {
                for (int z = -5; z < 6; z++) {
                    if (GravelProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.GRAVEL.getDefaultState());
                    }
                }

            }
        }
    }
    
    /**
     * Uses a radius, radius is first number plus second number, example: -5 + 6 = radius of 5
     * <p>Radius is that many blocks in each direction<p>
     * 
     * @see #cleanTaint(World, BlockPos)
     */
    public static void cleanTaintWithRadius(World worldIn, BlockPos pos, int num1, int num2) {
    	
        for (int x = num1; x < num2; x++) {
            for (int y = num1; y < num2; y++) {
                for (int z = num1; z < num2; z++) {
                    if (DirtProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.DIRT.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = num1; x < num2; x++) {
            for (int y = num1; y < num2; y++) {
                for (int z = -5; z < num2; z++) {
                    if (CobblestoneProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.COBBLESTONE.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = num1; x < num2; x++) {
            for (int y = num1; y < num2; y++) {
                for (int z = -5; z < num2; z++) {
                    if (AirProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = num1; x < num2; x++) {
            for (int y = num1; y < num2; y++) {
                for (int z = -5; z < num2; z++) {
                    if (SandProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.SAND.getDefaultState());
                    }
                }

            }
        }
        
        for (int x = num1; x < num2; x++) {
            for (int y = num1; y < num2; y++) {
                for (int z = -5; z < num2; z++) {
                    if (GravelProspects.contains(worldIn.getBlockState(pos.add(x, y, z)).getBlock())) {
                        worldIn.setBlockState(pos.add(x, y, z), Blocks.GRAVEL.getDefaultState());
                    }
                }

            }
        }
    }
}
