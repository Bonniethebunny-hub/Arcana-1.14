package net.kineticdevelopment.arcana.client.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.IRecipeHelperPopulator;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ContainerThaumonomiconAbstract extends Container {
    protected final World world;
    private IInventory thaumonomiconInventory;

    protected ContainerThaumonomiconAbstract(ContainerType<?> containerTypeIn, int id, PlayerInventory playerInventoryIn) {
        this(containerTypeIn, id, playerInventoryIn, new Inventory(3), new IntArray(4));
    }

    protected ContainerThaumonomiconAbstract(ContainerType<?> containerTypeIn, int id, PlayerInventory playerInventoryIn, IInventory thaumonomiconInventoryIn, IIntArray iIntArray) {
        super(containerTypeIn, id);
        this.world = playerInventoryIn.player.world;
        this.thaumonomiconInventory = thaumonomiconInventoryIn;

        this.trackIntArray(iIntArray);
    }

    /**
     * Determines whether supplied player can use this container
     */
    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return this.thaumonomiconInventory.isUsableByPlayer(playerIn);
    }
}
