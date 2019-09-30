package kineticdevelopment.arcana.common.utils.structures;

import com.mojang.datafixers.Dynamic;
import kineticdevelopment.arcana.common.utils.Constants;
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

public class GreatwoodFeature extends Feature<NoFeatureConfig> {
    public GreatwoodFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }

    @Override
    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random random, BlockPos spawnPos, NoFeatureConfig config) {
        ServerWorld worldserver = (ServerWorld) world;
        TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        Template greatwoodTree;
        int h = ThreadLocalRandom.current().nextInt(2, 7);
        switch(h) {
            default: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood1")); break;
            case 2: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood2")); break;
            case 3: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood3")); break;
            case 4: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood4")); break;
        }

        if(random.nextInt(1) != 0 || world.getBiome(spawnPos) != Biomes.PLAINS) {
            return false;
        }

        if(greatwoodTree == null) {
            Constants.LOGGER.error("Could not find structure at " + new ResourceLocation("arcana:structures/trees/greatwood"));
            return false;
        }
        PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
                .setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk(world.getChunk(spawnPos).getPos());

        greatwoodTree.addBlocksToWorld(world, spawnPos.add(-4, 0, -4), placementsettings);
        return true;
    }
}