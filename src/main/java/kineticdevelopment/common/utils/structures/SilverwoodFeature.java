package kineticdevelopment.common.utils.structures;

import com.mojang.datafixers.Dynamic;
import kineticdevelopment.common.utils.Constants;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class SilverwoodFeature extends Feature<NoFeatureConfig> {
    public SilverwoodFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }

    @Override
    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random random, BlockPos spawnPos, NoFeatureConfig config) {
        ServerWorld worldserver = (ServerWorld) world;
        TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        Template template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwoodtree"));
        int h = ThreadLocalRandom.current().nextInt(0, 7);
        switch(h) {
            case 1: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood1")); break;
            case 2: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood2")); break;
            case 3: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood3")); break;
            case 4: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood4")); break;
            case 5: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood5")); break;
            case 6: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood6")); break;
            case 7: template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood7")); break;
        }

        if(random.nextInt(1) != 0 || world.getBiome(spawnPos) != Biomes.PLAINS) {
            return false;
        }

        if(template == null) {
            Constants.LOGGER.error("Could not find structure at " + new ResourceLocation("arcana:trees/greatwood"));
            return false;
        }
        PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
                .setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk(world.getChunk(spawnPos).getPos());

        template.addBlocksToWorld(world, spawnPos.add(-4, 0, -4), placementsettings);
        return true;
    }
}