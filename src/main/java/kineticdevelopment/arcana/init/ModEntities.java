/**
 * All items should be listed here.
 */

package kineticdevelopment.arcana.init;


import kineticdevelopment.arcana.common.entities.SpellEntity;
import kineticdevelopment.arcana.core.Arcana;
import kineticdevelopment.arcana.init.item_entities.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {

    public static EntityType<?> spellProjectile = EntityType.Builder.<SpellEntity>create(SpellEntity::new, EntityClassification.MISC).build(Arcana.MOD_ID + ":spell_projectile").setRegistryName(ModItems.location("spell_projectile")) ;

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll(
                ModMobEntities.Mana_Creeper,
                spellProjectile
        );
        ModMobEntities.registerEntintySpawns();

    }

    public static <T extends Entity> EntityType<T> createEntity(EntityType.IFactory<T> factory, EntityClassification classification, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
    {
        ResourceLocation location = new ResourceLocation("arcana", name);
        EntityType<T> type = EntityType.Builder.<T>create(factory, classification).setTrackingRange(trackingRange).setUpdateInterval(updateFrequency).setShouldReceiveVelocityUpdates(sendsVelocityUpdates).build(location.toString());
        type.setRegistryName(name);
        ForgeRegistries.ENTITIES.register(type);
        return type;
    }


}


