package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class greatwoodsapling extends Block 
{

    public greatwoodsapling() 
    {
        super(Block.Properties.create(Material.BAMBOO_SAPLING)
                .sound(SoundType.BAMBOO_SAPLING)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("greatwoodsapling");
    }
}
