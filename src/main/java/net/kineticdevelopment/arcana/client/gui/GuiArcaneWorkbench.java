package net.kineticdevelopment.arcana.client.gui;

import net.kineticdevelopment.arcana.client.container.ArcaneWorkbenchContainer;
import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
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
public class GuiArcaneWorkbench implements INamedContainerProvider {
    public GuiArcaneWorkbench() {
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent("Thaumonomicon GUI");
    }

    @Nullable
    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new ArcaneWorkbenchContainer(i, playerInventory);
    }
}