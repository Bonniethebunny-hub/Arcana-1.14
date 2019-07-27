package net.kineticdevelopment.arcana.common.items;

import net.kineticdevelopment.arcana.client.gui.GuiThaumonomicon;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class thaumonomicon extends Item {

    public thaumonomicon() {
        super(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)
        .maxStackSize(1));

        setRegistryName("thaumonomicon");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        if (!worldIn.isRemote)
        {
            NetworkHooks.openGui((ServerPlayerEntity) playerIn, (INamedContainerProvider) new GuiThaumonomicon(1));
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}