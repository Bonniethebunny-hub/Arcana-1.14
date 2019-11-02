package kineticdevelopment.arcana.common.tile_entities;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.client.helpers.ArcanaHelper;
import kineticdevelopment.arcana.common.armour.AspectGogglesHelmet;
import kineticdevelopment.arcana.common.armour.GogglesPriority;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.Vec3d;

public interface NodeTileEntity {
    default GogglesPriority getGogglePriority() {
        ClientPlayerEntity player = Minecraft.getInstance().player;
        return !player.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()
                ? ((AspectGogglesHelmet)player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem()).getPriority()
                : GogglesPriority.SHOW_NODE;
    }

    default void showNode(BasicParticleType particle) {
        Vec3d particleLocation = ArcanaHelper.getTileEntityCenteredParticle((TileEntity) this);
        Minecraft.getInstance().player.getEntityWorld().addParticle(particle, true, particleLocation.getX(), particleLocation.getY(), particleLocation.getZ(), 0, 0, 0);
    }

    default void showNodeAndAspects(BasicParticleType particle) {
        Vec3d particleLocation = ArcanaHelper.getTileEntityCenteredParticle((TileEntity) this);
        Minecraft.getInstance().player.getEntityWorld().addParticle(particle, true, particleLocation.getX(), particleLocation.getY(), particleLocation.getZ(), 0, 0, 0);
        if(ArcanaHelper.isBlockOnCursor(((TileEntity)(this)).getBlockState())) {
            Minecraft.getInstance().player.getEntityWorld().addParticle(ArcanaParticles.ASPECT_ELDRITCH_PARTICLE, true, particleLocation.getX(), particleLocation.getY() + 1, particleLocation.getZ(), 0, 0, 0);
        }
    }
}
