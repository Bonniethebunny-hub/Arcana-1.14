package net.kineticdevelopment.arcana.common.blocks.treeblocks;

import java.util.Random;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class taintedoaklog extends RotatedPillarBlock {
    public taintedoaklog(Properties properties) {
        super(properties);
        setRegistryName("taintedoaklog");
    }
    
    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
    	if(player.getHeldItemMainhand().getItem() instanceof AxeItem)
    	{
    		worldIn.setBlockState(pos, ModBlocks.STRIPPEDTAINTEDOAKLOG.getDefaultState().with(RotatedPillarBlock.AXIS, state.get(RotatedPillarBlock.AXIS)), 11);
    		player.getHeldItemMainhand().setDamage(player.getHeldItemMainhand().getDamage() + 1);
    		return true;
    	}
    	else
    	{
    		return false;
    	}
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
