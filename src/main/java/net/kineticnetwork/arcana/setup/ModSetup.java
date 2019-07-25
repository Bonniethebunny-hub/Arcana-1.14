package net.kineticnetwork.arcana.setup;

import net.kineticnetwork.arcana.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("Arcana") {
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.ARCANESTONE);
        }
    };
    public void init() {

    }
}
