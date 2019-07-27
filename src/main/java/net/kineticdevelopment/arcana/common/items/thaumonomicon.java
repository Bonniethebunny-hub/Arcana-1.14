package net.kineticdevelopment.arcana.common.items;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class thaumonomicon extends Item {

    public thaumonomicon() {
        super(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP).maxStackSize(1));

        setRegistryName("thaumonomicon");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemStack = new ItemStack(ModItems.THAUMONOMICON);

        if (!worldIn.isRemote)
        {
            playerIn.openContainer.getInventory().add(1, itemStack);
        }

        playerIn.openContainer.getInventory().add(1, itemStack);


        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
