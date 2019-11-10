package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.normal_node_entity;

public class NormalNodeTileEntity extends NodeTileEntity {

    protected NormalNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public NormalNodeTileEntity() {
        this(normal_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Normal Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.NORMAL_NODE_PARTICLE;
    }
}
