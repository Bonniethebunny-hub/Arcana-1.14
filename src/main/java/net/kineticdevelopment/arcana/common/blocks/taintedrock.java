package net.kineticdevelopment.arcana.common.blocks;

import java.util.Random;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class taintedrock extends Block {
    public taintedrock() {
        super(Block.Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .tickRandomly()
        );
        setRegistryName("taintedrock");
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
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
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
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.GRASS_BLOCK)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    	
    	//Cobblestone
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.COBBLESTONE)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	//Stone
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.STONE)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDROCK.getDefaultState());
    	}
    	
    	//Logs
    	if(worldIn.getBlockState(pos.add(1, 0, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 0, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 0, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 0, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 0, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 0, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 0, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 0, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, 1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, 1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, 1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, 1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, 1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	
    	if(worldIn.getBlockState(pos.add(1, -1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, -1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, -1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, -1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, -1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(-1, -1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(-1, -1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(1, -1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(1, -1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, -1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, -1, -1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 1)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, -1, 1), ModBlocks.TAINTEDOAKLOG.getDefaultState());
    	}
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.OAK_LOG)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDOAKLOG.getDefaultState());
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
    	if(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, 1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
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
    	if(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock().equals(Blocks.DIRT)) {
    		worldIn.setBlockState(pos.add(0, -1, 0), ModBlocks.TAINTEDSOIL.getDefaultState());
    	}
    }
}
