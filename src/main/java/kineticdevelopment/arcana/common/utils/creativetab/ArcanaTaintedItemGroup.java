/**
 * Main creative tab
 */

package kineticdevelopment.arcana.common.utils.creativetab;

import kineticdevelopment.arcana.api.registry.ArcanaItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArcanaTaintedItemGroup extends ItemGroup {

    public static final ArcanaTaintedItemGroup instance = new ArcanaTaintedItemGroup(ItemGroup.GROUPS.length, "arcana_tainted");

    private ArcanaTaintedItemGroup(int index, String label) {
        super(index, label);
        this.setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon() {

        return new ItemStack(ArcanaItems.aspect_taint);
    }

    @Override
    public boolean hasSearchBar() {
        return true;

    }
}
