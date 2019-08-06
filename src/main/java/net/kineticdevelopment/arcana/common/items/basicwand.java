package net.kineticdevelopment.arcana.common.items;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class basicwand extends Item {
    public basicwand() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP)
        .maxStackSize(1));

        setRegistryName("basicwand");
    }
}
