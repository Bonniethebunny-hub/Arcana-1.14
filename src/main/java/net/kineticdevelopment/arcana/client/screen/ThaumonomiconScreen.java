package net.kineticdevelopment.arcana.client.screen;

import com.mojang.blaze3d.platform.GlStateManager;
import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.FakePlayerFactory;

public class ThaumonomiconScreen extends ContainerScreen<ThaumonomiconContainer> {
    private static final ResourceLocation THAUMONOMICON_GUI_TEXTURE = new ResourceLocation(Constants.MODID, "textures/gui/container/gui_researchbook.png");
    private static final ResourceLocation THAUMONOMICON_RESEARCH_ONE_TAB = new ResourceLocation(Constants.MODID, "textures/gui/container/research_one_tab.png");

    public ThaumonomiconScreen(ThaumonomiconContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.font.drawString(this.title.getFormattedText(), 30.0F, -25.0F, 4610752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(THAUMONOMICON_GUI_TEXTURE);
        int i = (this.width - this.xSize) / 3 + 3;
        int j = (this.height - this.ySize) / 3;
        this.blit(i, j, 0, 0, 255, 182);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return true;
    }
}
