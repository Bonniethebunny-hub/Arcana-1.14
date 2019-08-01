package net.kineticdevelopment.arcana.common.init;


import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.entities.*;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class ModEntities
{
    public static EntityType<?> ARCANA_TAINTED_COW = EntityType.Builder.create(TaintedCow::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_cow").setRegistryName(EventSubscriber.location("tainted_cow"));
    public static EntityType<?> ARCANA_TAINTED_ZOMBIE = EntityType.Builder.create(TaintedZombie::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_zombie").setRegistryName(EventSubscriber.location("tainted_zombie"));
    public static EntityType<?> ARCANA_TAINTED_PIG = EntityType.Builder.create(TaintedPig::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_pig").setRegistryName(EventSubscriber.location("tainted_pig"));
    public static EntityType<?> ARCANA_TAINTED_CHICKEN = EntityType.Builder.create(TaintedChicken::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_chicken").setRegistryName(EventSubscriber.location("tainted_chicken"));
    public static EntityType<?> ARCANA_TAINTED_CREEPER = EntityType.Builder.create(TaintedCreeper::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_creeper").setRegistryName(EventSubscriber.location("tainted_creeper"));
    public static EntityType<?> ARCANA_TAINTED_SPIDER = EntityType.Builder.create(TaintedSpider::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_spider").setRegistryName(EventSubscriber.location("tainted_spider"));


    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                ModItems.arcana_tainted_cow_egg = registerEntitySpawnEgg(ARCANA_TAINTED_COW, 0x6d24ad, 0x6c801f, "tainted_cow_egg"),
                ModItems.arcana_tainted_zombie_egg = registerEntitySpawnEgg(ARCANA_TAINTED_ZOMBIE, 0x6d24ad, 0x236620, "tainted_zombie_egg"),
                ModItems.arcana_tainted_pig_egg = registerEntitySpawnEgg(ARCANA_TAINTED_PIG, 0x6d24ad,0x750867, "tainted_pig_egg"),
                ModItems.arcana_tainted_chicken_egg = registerEntitySpawnEgg(ARCANA_TAINTED_CHICKEN, 0x6d24ad, 0xa89b32, "tainted_chicken_egg"),
                ModItems.arcana_tainted_creeper_egg = registerEntitySpawnEgg(ARCANA_TAINTED_CREEPER, 0x6d24ad, 0x2aa823, "tainted_creeper_egg"),
                ModItems.arcana_tainted_spider_egg = registerEntitySpawnEgg(ARCANA_TAINTED_SPIDER, 0x6d24ad, 0x09040d, "tainted_spider_egg")
        );
    }

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(ARCANA_TAINTED_COW, Biomes.PLAINS, Biomes.TAIGA, Biomes.SWAMP);
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP));
        item.setRegistryName(EventSubscriber.location(name));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 10));
            }
        }
    }

}
