/**
 * Creative tab for aspects. This doesn't need to be in the final build
 */
package kineticdevelopment.common.utils.creativetab;

import kineticdevelopment.api.registry.ArcanaItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArcanaAspectsItemGroup extends ItemGroup {

    public static final ArcanaAspectsItemGroup instance = new ArcanaAspectsItemGroup(ItemGroup.GROUPS.length, "arcana_aspects");

    private ArcanaAspectsItemGroup(int index, String label) {
        super(index, label);
        this.setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon() {

        return new ItemStack(ArcanaItems.aspect_air);
    }

    @Override
    public boolean hasSearchBar() {
        return true;

    }


}
