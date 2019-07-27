package net.kineticdevelopment.arcana.client.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.IRecipeType;

public class ContainerThaumonomicon extends ContainerThaumonomiconAbstract
{
    public ContainerThaumonomicon(int i, PlayerInventory playerInventory)
    {
        super(ContainerType.GENERIC_3X3, i, playerInventory);
    }
}
