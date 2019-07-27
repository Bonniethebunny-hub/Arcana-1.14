package net.kineticdevelopment.arcana.common.items;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class light extends Item {

    public light() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP).maxStackSize(64));

        setRegistryName("light");
    }
}
