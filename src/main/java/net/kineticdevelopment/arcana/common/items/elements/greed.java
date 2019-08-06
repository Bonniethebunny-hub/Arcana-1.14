package net.kineticdevelopment.arcana.common.items.elements;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class greed extends Item {

    public greed() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP)
        .maxStackSize(64));

        setRegistryName("greed");
    }
}
