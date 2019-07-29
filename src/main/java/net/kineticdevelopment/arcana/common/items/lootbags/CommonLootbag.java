package net.kineticdevelopment.arcana.common.items.lootbags;

import net.kineticdevelopment.arcana.client.gui.lootbags.GuiCommonLootbag;
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

public class CommonLootbag extends Item
{
    public CommonLootbag() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP)
                .maxStackSize(1));

        setRegistryName("commonlootbag");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote) {
            NetworkHooks.openGui((ServerPlayerEntity) playerIn, (INamedContainerProvider) new GuiCommonLootbag());
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
