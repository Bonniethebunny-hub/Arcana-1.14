package net.kineticdevelopment.arcana.common.init;


import net.kineticdevelopment.arcana.EventSubscriber;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.kineticdevelopment.arcana.common.entities.TaintedPig;
import net.kineticdevelopment.arcana.common.entities.TaintedZombie;
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


    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                ModItems.arcana_tainted_cow_egg = registerEntitySpawnEgg(ARCANA_TAINTED_COW, 0x6d24ad, 0x6c801f, "tainted_cow_egg"),
                ModItems.arcana_tainted_zombie_egg = registerEntitySpawnEgg(ARCANA_TAINTED_ZOMBIE, 0x6d24ad, 0x236620, "tainted_zombie_egg"),
                ModItems.arcana_tainted_pig_egg = registerEntitySpawnEgg(ARCANA_TAINTED_PIG, 0x6d24ad,0x750867, "tainted_pig_egg")
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
