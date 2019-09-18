package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class magicalforestgrass extends Block {

    public magicalforestgrass() {
        super(Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT));
        setRegistryName("magicalgrass");
    }
}
