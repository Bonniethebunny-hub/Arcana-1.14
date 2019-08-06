package net.kineticdevelopment.arcana.common.items.elements;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class spirit extends Item {

    public spirit() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP)
        .maxStackSize(64));

        setRegistryName("spirit");
    }
}
