package kineticdevelopment.arcana.common.items;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.api.spells.Spell;
import kineticdevelopment.arcana.api.spells.SpellEffect;
import kineticdevelopment.arcana.api.spells.SpellEffectHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class ItemWand extends Item {
    public ItemWand(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity player, Hand handIn) {
        if(worldIn.isRemote) {
            return ActionResult.newResult(ActionResultType.PASS, player.getHeldItem(handIn));
        }
        if(handIn == Hand.MAIN_HAND) {
            Spell spellObj = new Spell(new SpellEffect[]{SpellEffectHandler.getEffect("EARTH")}, Aspect.AspectType.AIR, "MerlinsHeal", 10);

            spellObj.cast(player);
            player.sendMessage(new StringTextComponent("Casted spell"));
        }

        return ActionResult.newResult(ActionResultType.PASS, player.getHeldItem(handIn));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {

        if(context.getWorld().isRemote) {
            return ActionResultType.PASS;
        }

//        if (context.getHand() == Hand.MAIN_HAND) {
//            PlayerEntity player = context.getPlayer();
////        ItemStack itemStack = context.getItem();
////        assert itemStack.getTag() != null;
////        CompoundNBT spell = itemStack.getTag().getCompound("arcana").getCompound("spell");
////        Spell spellObj = Spell.fromNBT(spell);
//            Spell spellObj = new Spell(new SpellEffect[]{SpellEffectHandler.getEffect("EARTH")}, Aspect.AspectType.AIR, "MerlinsHeal", 10);
//
//            spellObj.cast(player);
//            player.sendMessage(new StringTextComponent("Casted spell"));
//
//        }
           return ActionResultType.PASS;
   }
}
