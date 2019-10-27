package kineticdevelopment.arcana.common.items;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.api.spells.Spell;
import kineticdevelopment.arcana.api.spells.SpellEffect;
import kineticdevelopment.arcana.api.spells.SpellEffectHandler;
import kineticdevelopment.arcana.api.spells.effects.SpellEffectEarth;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.StringTextComponent;

public class ItemWand extends Item {
    public ItemWand(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
//        ItemStack itemStack = context.getItem();
//        assert itemStack.getTag() != null;
//        CompoundNBT spell = itemStack.getTag().getCompound("arcana").getCompound("spell");
//        Spell spellObj = Spell.fromNBT(spell);
        Spell spellObj = new Spell(new SpellEffect[] {SpellEffectHandler.getEffect("EARTH")}, Aspect.AspectType.EARTH, "MerlinsHeal", 10);

        spellObj.cast(player);
        player.sendMessage(new StringTextComponent("Casted spell"));

        return ActionResultType.PASS;
    }
}
