package net.kineticdevelopment.arcana.common.init;

import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class ModEntities {
    public static EntityType<?> ARCANA_ENTITY_COW = EntityType.Builder.create(TaintedCow::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_cow").setRegistryName(EventSubscriber.location("tainted_cow"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                ModItems.arcana_entity_egg = registerEntitySpawnEgg(ARCANA_ENTITY_COW, 0x480480, 0x806d04, "tainted_cow_egg")
        );
    }

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(ARCANA_ENTITY_COW, EntityClassification.CREATURE, Biomes.PLAINS, Biomes.TAIGA, Biomes.SWAMP, Biomes.FOREST, Biomes.JUNGLE, Biomes.WOODED_HILLS);
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP));
        item.setRegistryName(EventSubscriber.location(name));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, EntityClassification classification, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                biome.getSpawns(classification).add(new Biome.SpawnListEntry(entity, 10,1, 10));
            }
        }
    }
}
