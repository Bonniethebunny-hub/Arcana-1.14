package kineticdevelopment.common.utils.creativetab;

import net.minecraft.item.ItemGroup;
import kineticdevelopment.api.items.ArcanaItems;
import net.minecraft.item.ItemStack;

public class ArcanaItemGroup extends ItemGroup {

    public static final ArcanaItemGroup instance = new ArcanaItemGroup(ItemGroup.GROUPS.length, "arcana");

    private ArcanaItemGroup(int index, String lable) {

        super(index, lable);

    }

    @Override
    public ItemStack createIcon() {

        return new ItemStack(ArcanaItems.Thaumonomicon);
    }

    @Override
    public boolean hasSearchBar() {
        return true;

    }


}
