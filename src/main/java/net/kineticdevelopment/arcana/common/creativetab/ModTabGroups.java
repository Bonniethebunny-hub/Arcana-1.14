package net.kineticdevelopment.arcana.common.creativetab;

import net.kineticdevelopment.arcana.common.init.ModItems;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ModTabGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModTabGroup(Constants.MODID, () -> new ItemStack(ModItems.THAUMONOMICON)).setBackgroundImageName("item_search.png");

    public static final class ModTabGroup extends ItemGroup {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name         String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

    }
}
