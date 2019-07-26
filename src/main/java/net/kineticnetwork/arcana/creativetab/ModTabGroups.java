package net.kineticnetwork.arcana.creativetab;

import net.kineticnetwork.arcana.blocks.ModBlocks;
import net.kineticnetwork.arcana.ArcanaMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ModTabGroups
{
    public static final ItemGroup MOD_ITEM_GROUP = new ModTabGroup(ArcanaMod.MODID, () -> new ItemStack(ModBlocks.ARCANESTONE));

    public static final class ModTabGroup extends ItemGroup
    {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }
}
