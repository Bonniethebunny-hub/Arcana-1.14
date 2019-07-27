package net.kineticdevelopment.arcana.client.screen;

import net.kineticdevelopment.arcana.client.container.ContainerThaumonomicon;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class ScreenThaumonomicon<T extends ContainerThaumonomicon> extends ContainerScreen<T>
{
    private final ResourceLocation texture;

    public ScreenThaumonomicon(T screenContainer, PlayerInventory inv, ITextComponent titleIn, ResourceLocation texture)
    {
        super(screenContainer, inv, titleIn);
        this.xSize = width;
        this.ySize = height;
        this.texture = texture;
    }

    @Override
    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderBackground();
        super.render(p_render_1_, p_render_2_, p_render_3_);
        this.renderHoveredToolTip(p_render_1_, p_render_2_);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        this.minecraft.getTextureManager().bindTexture(texture);
    }
}
