package net.mcreator.endredefined.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitedAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 432, 6f, 0, 32, TagKey.create(Registries.ITEM, ResourceLocation.parse("end_redefined:enderited_axe_repair_items")));

	public EnderitedAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, -3f, properties.fireResistant());
	}
}