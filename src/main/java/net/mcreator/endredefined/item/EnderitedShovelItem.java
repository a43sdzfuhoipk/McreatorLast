package net.mcreator.endredefined.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitedShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 432, 8f, 0, 32, TagKey.create(Registries.ITEM, ResourceLocation.parse("end_redefined:enderited_shovel_repair_items")));

	public EnderitedShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -3f, properties.fireResistant());
	}
}