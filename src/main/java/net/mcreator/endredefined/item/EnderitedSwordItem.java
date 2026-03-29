package net.mcreator.endredefined.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitedSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 250, 8f, 0, 32, TagKey.create(Registries.ITEM, ResourceLocation.parse("end_redefined:enderited_sword_repair_items")));

	public EnderitedSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9f, -1f).fireResistant());
	}
}