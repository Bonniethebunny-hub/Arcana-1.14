package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.tainted_node_entity;

public class TaintedNodeTileEntity extends NodeTileEntity {

    protected TaintedNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public TaintedNodeTileEntity() {
        this(tainted_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Tainted Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.TAINTED_NODE_PARTICLE;
    }
}
