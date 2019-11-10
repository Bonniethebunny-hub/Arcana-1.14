package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.eldritch_node_entity;

public class EldritchNodeTileEntity extends NodeTileEntity {

    protected EldritchNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public EldritchNodeTileEntity() {
        this(eldritch_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Eldritch Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.ELDRITCH_NODE_PARTICLE;
    }
}
