package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.common.nodes.Node;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;

import java.util.ArrayList;

public interface INodeTileEntity {

    default int getParticleHorizontalLimit() {
        return 5;
    }

    default BasicParticleType getParticle() {
        return ParticleTypes.BARRIER;
    }

    Node getNode();

    double getParticleOffset();

    void showNodes();

    void showAspects();
}
