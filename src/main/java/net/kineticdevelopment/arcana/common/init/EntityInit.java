package net.kineticdevelopment.arcana.common.init;


import net.kineticdevelopment.arcana.RegistryHandler;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.entities.Koala;
import net.kineticdevelopment.arcana.common.entities.TaintedChicken;
import net.kineticdevelopment.arcana.common.entities.TaintedCow;
import net.kineticdevelopment.arcana.common.entities.TaintedCreeper;
import net.kineticdevelopment.arcana.common.entities.TaintedPig;
import net.kineticdevelopment.arcana.common.entities.TaintedSlime;
import net.kineticdevelopment.arcana.common.entities.TaintedSpider;
import net.kineticdevelopment.arcana.common.entities.TaintedZombie;
import net.kineticdevelopment.arcana.common.entities.WizardVillager;
import net.kineticdevelopment.arcana.common.entities.sins.EnvyDemon;
import net.kineticdevelopment.arcana.common.entities.sins.GluttonyDemon;
import net.kineticdevelopment.arcana.common.entities.sins.GreedDemon;
import net.kineticdevelopment.arcana.common.entities.sins.LustDemon;
import net.kineticdevelopment.arcana.common.entities.sins.PrideDemon;
import net.kineticdevelopment.arcana.common.entities.sins.SlothDemon;
import net.kineticdevelopment.arcana.common.entities.sins.WrathDemon;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class EntityInit {
    public static EntityType<?> ARCANA_TAINTED_COW = EntityType.Builder.create(TaintedCow::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_cow").setRegistryName(RegistryHandler.location("tainted_cow"));
    public static EntityType<?> ARCANA_TAINTED_ZOMBIE = EntityType.Builder.create(TaintedZombie::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_zombie").setRegistryName(RegistryHandler.location("tainted_zombie"));
    public static EntityType<?> ARCANA_TAINTED_PIG = EntityType.Builder.create(TaintedPig::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_pig").setRegistryName(RegistryHandler.location("tainted_pig"));
    public static EntityType<?> ARCANA_TAINTED_CHICKEN = EntityType.Builder.create(TaintedChicken::new, EntityClassification.CREATURE).build(Constants.MODID + ":tainted_chicken").setRegistryName(RegistryHandler.location("tainted_chicken"));
    public static EntityType<?> ARCANA_TAINTED_CREEPER = EntityType.Builder.create(TaintedCreeper::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_creeper").setRegistryName(RegistryHandler.location("tainted_creeper"));
    public static EntityType<?> ARCANA_TAINTED_SPIDER = EntityType.Builder.create(TaintedSpider::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_spider").setRegistryName(RegistryHandler.location("tainted_spider"));
    public static EntityType<?> ARCANA_TAINTED_SLIME = EntityType.Builder.create(TaintedSlime::new, EntityClassification.MONSTER).build(Constants.MODID + ":tainted_slime").setRegistryName(RegistryHandler.location("tainted_slime"));
    public static EntityType<?> KOALA = EntityType.Builder.create(Koala::new, EntityClassification.MISC).build(Constants.MODID + ":koala").setRegistryName(RegistryHandler.location("koala"));
    
    //Sin Demons
    public static EntityType<?> PRIDEDEMON = EntityType.Builder.create(PrideDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":pridedemon").setRegistryName(RegistryHandler.location("pridedemon"));
    public static EntityType<?> GREEDDEMON = EntityType.Builder.create(GreedDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":greeddemon").setRegistryName(RegistryHandler.location("greeddemon"));
    public static EntityType<?> LUSTDEMON = EntityType.Builder.create(LustDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":lustdemon").setRegistryName(RegistryHandler.location("lustdemon"));
    public static EntityType<?> ENVYDEMON = EntityType.Builder.create(EnvyDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":envydemon").setRegistryName(RegistryHandler.location("envydemon"));
    public static EntityType<?> GLUTTONYDEMON = EntityType.Builder.create(GluttonyDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":gluttonydemon").setRegistryName(RegistryHandler.location("gluttonydemon"));
    public static EntityType<?> SLOTHDEMON = EntityType.Builder.create(SlothDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":slothdemon").setRegistryName(RegistryHandler.location("slothdemon"));
    public static EntityType<?> WRATHDEMON = EntityType.Builder.create(WrathDemon::new, EntityClassification.MONSTER).build(Constants.MODID + ":wrathdemon").setRegistryName(RegistryHandler.location("wrathdemon"));

    public static EntityType<?> ARCANA_WIZARD_VILLAGER = EntityType.Builder.create(WizardVillager::new, EntityClassification.MISC).build(Constants.MODID + ":wizard_villager").setRegistryName(RegistryHandler.location("wizard_villager"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ItemInit.arcana_tainted_cow_egg = registerEntitySpawnEgg(ARCANA_TAINTED_COW, 0x6d24ad, 0x6c801f, "tainted_cow_egg"),
                ItemInit.arcana_tainted_zombie_egg = registerEntitySpawnEgg(ARCANA_TAINTED_ZOMBIE, 0x6d24ad, 0x236620, "tainted_zombie_egg"),
                ItemInit.arcana_tainted_pig_egg = registerEntitySpawnEgg(ARCANA_TAINTED_PIG, 0x6d24ad,0x750867, "tainted_pig_egg"),
                ItemInit.arcana_tainted_chicken_egg = registerEntitySpawnEgg(ARCANA_TAINTED_CHICKEN, 0x6d24ad, 0xa89b32, "tainted_chicken_egg"),
                ItemInit.arcana_tainted_creeper_egg = registerEntitySpawnEgg(ARCANA_TAINTED_CREEPER, 0x6d24ad, 0x2aa823, "tainted_creeper_egg"),
                ItemInit.arcana_tainted_spider_egg = registerEntitySpawnEgg(ARCANA_TAINTED_SPIDER, 0x6d24ad, 0x09040d, "tainted_spider_egg"),
                ItemInit.arcana_tainted_slime_egg = registerEntitySpawnEgg(ARCANA_TAINTED_SLIME, 0x6d24ad, 0x04ba1c, "tainted_slime_egg"),
                ItemInit.arcana_wizard_villager_egg = registerEntitySpawnEgg(ARCANA_WIZARD_VILLAGER, 0x6b10c7, 0xc78d10, "wizard_villager_egg")
        );
    }

    public static void registerEntityWorldSpawns() {
        registerEntityWorldSpawn(ARCANA_TAINTED_COW, Biomes.PLAINS, Biomes.TAIGA, Biomes.SWAMP);
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP));
        item.setRegistryName(RegistryHandler.location(name));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes) {
        for(Biome biome : biomes) {
            if(biome != null) {
                biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 10));
            }
        }
    }

}
