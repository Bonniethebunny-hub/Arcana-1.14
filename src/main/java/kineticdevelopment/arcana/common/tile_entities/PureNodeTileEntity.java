package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.pure_node_entity;

public class PureNodeTileEntity extends NodeTileEntity {

    protected PureNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public PureNodeTileEntity() {
        this(pure_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Pure Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.PURE_NODE_PARTICLE;
    }
}
