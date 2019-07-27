package net.kineticdevelopment.arcana.client.gui;

import net.kineticdevelopment.arcana.client.container.ContainerThaumonomicon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class GuiThaumonomicon implements INamedContainerProvider
{
    public GuiThaumonomicon()
    {
    }

    @Override
    public ITextComponent getDisplayName()
    {
        return new StringTextComponent("thaumonomicon");
    }

    @Nullable
    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity)
    {
        // TODO This is for testing and make a new container for the thaumonomicon
        return new ContainerThaumonomicon(i, playerInventory);
    }
}