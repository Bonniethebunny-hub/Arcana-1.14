package net.kineticdevelopment.arcana.common.items;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class wandcapvoid extends Item {

    public wandcapvoid() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP).maxStackSize(64));

        setRegistryName("wandcapvoid");
    }
}
