package net.kineticdevelopment.arcana.client.gui.lootbags;

import net.kineticdevelopment.arcana.client.container.lootbags.CommonLootbagContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class GuiCommonLootbag implements INamedContainerProvider {
    public GuiCommonLootbag() {
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent("Common Lootbag GUI");
    }

    @Nullable
    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new CommonLootbagContainer(i, playerInventory);
    }
}