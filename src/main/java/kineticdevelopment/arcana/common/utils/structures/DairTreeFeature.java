package kineticdevelopment.arcana.common.utils.structures;

import com.mojang.datafixers.Dynamic;
import kineticdevelopment.arcana.common.utils.Constants;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class DairTreeFeature extends Feature<NoFeatureConfig> {
    public DairTreeFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(this, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(0, 0.1F, 1)));
    }

    @Override
    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random random, BlockPos spawnPos, NoFeatureConfig config) {
        ServerWorld worldserver = (ServerWorld) world.getWorld();
        TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        Template template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwoodtree"));
        int h = ThreadLocalRandom.current().nextInt(0, 4);
        switch(h) {
            case 1: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/dair/dair_small_0")); break;
            case 2: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/dair/dair_small_1")); break;
            case 3: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/dair/dair_small_2")); break;
            case 4: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/dair/dair_small_3")); break;
//            case 5: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood5")); break;
//            case 6: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood6")); break;
//            case 7: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood7")); break;
        }

        if(template == null) {
            Constants.LOGGER.error("Could not find structure at " + new ResourceLocation("arcana:structures/trees/greatwood"));
            return false;
        }

        PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
                .setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk(world.getChunk(spawnPos).getPos());

        template.addBlocksToWorld(world, world.getChunk(spawnPos).getPos().getBlock(8, world.getChunk(spawnPos).getTopBlockY(Heightmap.Type.WORLD_SURFACE, world.getChunk(spawnPos).getPos().getBlock(8, 8, 8 ).getX(), world.getChunk(spawnPos).getPos().getBlock(8, 8, 8 ).getX()) - 1, 8), placementsettings);
        return true;
    }
}