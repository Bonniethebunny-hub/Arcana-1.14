package net.kineticdevelopment.arcana.common.blocks;

import java.util.Random;

import net.kineticdevelopment.arcana.utilities.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class taintedcrust extends Block {
    public taintedcrust() {
        super(Block.Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("taintedcrust");
    }
    
    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }
    
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
    	
    	TaintSpreader.spreadTaint(worldIn, pos);
    }
}
