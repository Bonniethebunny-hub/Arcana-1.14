package net.kineticnetwork.arcana.items;

import net.kineticnetwork.arcana.creativetab.ModTabGroups;
import net.minecraft.item.Item;

public class thaumonomicon extends Item {

    public thaumonomicon() {
        super(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)
        .maxStackSize(1));

        setRegistryName("thaumonomicon");
    }
}
