package kineticdevelopment.arcana.client.render.tile_entities;

import com.mojang.blaze3d.platform.GlStateManager;
import kineticdevelopment.arcana.common.tile_entities.NormalNodeTileEntity;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NormalNodeTileEntityRenderer extends TileEntityRenderer<NormalNodeTileEntity> {

    @Override
    public void render(NormalNodeTileEntity node, double x, double y, double z, float partialTicks, int destroyStage) {
        super.render(node, x, y, z, partialTicks, destroyStage);
    }

}
