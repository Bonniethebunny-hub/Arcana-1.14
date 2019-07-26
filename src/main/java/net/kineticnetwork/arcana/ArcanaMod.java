package net.kineticnetwork.arcana;

import net.kineticnetwork.arcana.client.ClientProxy;
import net.kineticnetwork.arcana.common.IProxy;
import net.kineticnetwork.arcana.common.ServerProxy;
import net.kineticnetwork.arcana.utilities.Constants;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MODID)
public class ArcanaMod
{
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public ArcanaMod()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        Constants.LOGGER.info(Constants.MODID + event + " is now loaded!");
    }
}
