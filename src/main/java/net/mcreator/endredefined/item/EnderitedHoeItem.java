package net.mcreator.endredefined.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitedHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1024, 20f, 0, 50, TagKey.create(Registries.ITEM, ResourceLocation.parse("end_redefined:enderited_hoe_repair_items")));

	public EnderitedHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, -1f, properties.fireResistant());
	}
}