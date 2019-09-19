package kineticdevelopment.init;


import kineticdevelopment.common.utils.effect.TaintedEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

//import static kineticdevelopment.api.effects.ArcanaEffects.*;



public class ModEffects {

    @SubscribeEvent
    public static void onEffectRegistry(final RegistryEvent.Register<Effect> event) {
        event.getRegistry().register(new TaintedEffect(EffectType.HARMFUL, 10494192).setRegistryName("tainted"));
        System.out.println("Potions Registered!");
    }

}
