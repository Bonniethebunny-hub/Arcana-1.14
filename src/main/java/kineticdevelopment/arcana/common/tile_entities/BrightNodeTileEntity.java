package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.bright_node_entity;

public class BrightNodeTileEntity extends NodeTileEntity {


    protected BrightNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public BrightNodeTileEntity() {
        this(bright_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Bright Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.BRIGHT_NODE_PARTICLE;
    }
}
