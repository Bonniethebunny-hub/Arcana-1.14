package kineticdevelopment.arcana.client.screen;

import com.mojang.blaze3d.platform.GlStateManager;
import kineticdevelopment.arcana.client.container.FociForgeContainer;
import kineticdevelopment.arcana.common.utils.Constants;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class FForgeScreen extends ContainerScreen<FociForgeContainer> {

    private static final ResourceLocation FOCIFORGE_GUI_TEXTURE = new ResourceLocation(Constants.MOD_ID, "textures/gui/container/gui_fociforge.png");

    public FForgeScreen(FociForgeContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected void init() {

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(FOCIFORGE_GUI_TEXTURE);
        int i = (this.width - this.xSize) / 3 + 3;
        int j = (this.height - this.ySize) / 3;
        this.blit(i, j, 0, 0, 255, 182);
    }



    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
