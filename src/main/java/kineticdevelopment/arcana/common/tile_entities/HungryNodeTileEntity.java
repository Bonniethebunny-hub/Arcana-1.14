package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.hungry_node_entity;

public class HungryNodeTileEntity extends NodeTileEntity {

    protected HungryNodeTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public HungryNodeTileEntity() {
        this(hungry_node_entity);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("Hungry Node");
    }

    @Override
    public BasicParticleType getParticle() {
        return ArcanaParticles.HUNGRY_NODE_PARTICLE;
    }
}
