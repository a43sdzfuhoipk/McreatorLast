package net.mcreator.endredefined.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PieceOfCoalItem extends Item {
	public PieceOfCoalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}