package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class taintedgrass extends Block {
    public taintedgrass() {
        super(Block.Properties.create(Material.PLANTS)
            .sound(SoundType.PLANT)
            .harvestLevel(0)
            .tickRandomly()
            .doesNotBlockMovement()
        );
        setRegistryName("taintedgrass");
    }
    
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
