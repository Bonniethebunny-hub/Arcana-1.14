package net.kineticdevelopment.arcana.client.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.IRecipeType;

public class ContainerThaumonomicon extends AbstractFurnaceContainer
{
    public ContainerThaumonomicon(int p_i50082_1_, PlayerInventory p_i50082_2_) {
        super(ContainerType.FURNACE, IRecipeType.SMELTING, p_i50082_1_, p_i50082_2_);
    }
}
