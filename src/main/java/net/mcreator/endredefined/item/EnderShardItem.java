package net.mcreator.endredefined.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.endredefined.procedures.TeleportChargeRechargeProcedure;

public class EnderShardItem extends Item {
	public EnderShardItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(4).fireResistant());
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		TeleportChargeRechargeProcedure.execute(world, entity);
		return ar;
	}
}