package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.fading_node_entity;

public class FadingNodeTileEntity extends NodeTileEntity {

    protected FadingNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public FadingNodeTileEntity() {
        this(fading_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Fading Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.FADING_NODE_PARTICLE;
    }
}
