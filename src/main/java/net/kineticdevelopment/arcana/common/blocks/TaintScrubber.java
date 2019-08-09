package net.kineticdevelopment.arcana.common.blocks;

import net.kineticdevelopment.arcana.utilities.taint.TaintCleaner;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class TaintScrubber extends Block{
    public TaintScrubber() {
        super(Block.Properties.create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(3.0f)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("taintscrubber");
    }
    
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        worldIn.getPendingBlockTicks().scheduleTick(pos, this, 20);
    }   
    
    @Override
    public boolean isSolid(BlockState state) {
		return false;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintCleaner.cleanTaintWithRadius(worldIn, pos, -15, 16);
        worldIn.getPendingBlockTicks().scheduleTick(pos, this, 20);
    }
}
