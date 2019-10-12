package kineticdevelopment.arcana.init;


import kineticdevelopment.arcana.api.registry.ArcanaItems;
import kineticdevelopment.arcana.common.entities.ManaCreeper;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaItemGroup;
import kineticdevelopment.arcana.core.Arcana;
import kineticdevelopment.arcana.init.item_entities.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class ModMobEntities {


    public static EntityType<?> Mana_Creeper = EntityType.Builder.create(ManaCreeper::new, EntityClassification.CREATURE).build(Arcana.MOD_ID + ":mana_creeper").setRegistryName(ModItems.location("mana_creeper")) ;


    //Spawn Eggs
    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(

                ArcanaItems.mana_creeper_egg = registerEntitySpawnEgg(Mana_Creeper, 0x3bad5f, 0x427387, "mana_creeper_egg")
        );
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int colour1, int colour2, String name) {
        SpawnEggItem item = new SpawnEggItem(type, colour1, colour2, new Item.Properties().group(ArcanaItemGroup.instance));
        item.setRegistryName(ModItems.location(name));
    return item;
    }

    public static void registerEntintySpawns(){
        registerEntintySpawn(Mana_Creeper, Biomes.FOREST, Biomes.FLOWER_FOREST);
    }


    public static void registerEntintySpawn(EntityType<?> entity, Biome...biomes) {

        for(Biome biome : biomes){
            if(biome != null) {
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, 12,1,1));
            }
        }
    }
}


