package net.kineticnetwork.arcana.common.items;

import net.kineticnetwork.arcana.common.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class thaumonomicon extends Item {

    public thaumonomicon() {
        super(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)
        .maxStackSize(1));

        setRegistryName("thaumonomicon");
    }
}
