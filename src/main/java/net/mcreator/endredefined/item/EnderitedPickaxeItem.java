package net.mcreator.endredefined.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitedPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 432, 6f, 0, 32, TagKey.create(Registries.ITEM, ResourceLocation.parse("end_redefined:enderited_pickaxe_repair_items")));

	public EnderitedPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 6f, -3f).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}