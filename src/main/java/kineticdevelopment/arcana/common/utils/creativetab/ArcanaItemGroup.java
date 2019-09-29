/**
 * Main creative tab
 */

package kineticdevelopment.arcana.common.utils.creativetab;

import kineticdevelopment.arcana.api.registry.ArcanaItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArcanaItemGroup extends ItemGroup {

    public static final ArcanaItemGroup instance = new ArcanaItemGroup(ItemGroup.GROUPS.length, "arcana");

    private ArcanaItemGroup(int index, String label) {
        super(index, label);
        this.setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon() {

        return new ItemStack(ArcanaItems.thaumonomicon);
    }

    @Override
    public boolean hasSearchBar() {
        return true;

    }
}
