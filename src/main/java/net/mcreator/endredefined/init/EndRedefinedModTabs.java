/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endredefined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.endredefined.EndRedefinedMod;

@EventBusSubscriber
public class EndRedefinedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndRedefinedMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> END_UPDATE = REGISTRY.register("end_update",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.end_redefined.end_update")).icon(() -> new ItemStack(EndRedefinedModItems.ENDERITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndRedefinedModItems.ENDERITE.get());
				tabData.accept(EndRedefinedModBlocks.ENDGRASS.get().asItem());
				tabData.accept(EndRedefinedModItems.ENDER_ARMOR_HELMET.get());
				tabData.accept(EndRedefinedModItems.ENDER_ARMOR_CHESTPLATE.get());
				tabData.accept(EndRedefinedModItems.ENDER_ARMOR_LEGGINGS.get());
				tabData.accept(EndRedefinedModItems.ENDER_ARMOR_BOOTS.get());
				tabData.accept(EndRedefinedModItems.ENDER_SHARD.get());
				tabData.accept(EndRedefinedModBlocks.ENDGRASS_WILD.get().asItem());
				tabData.accept(EndRedefinedModItems.FIREOFENDER.get());
				tabData.accept(EndRedefinedModItems.PIECE_OF_COAL.get());
				tabData.accept(EndRedefinedModItems.ENDERITED_PICKAXE.get());
				tabData.accept(EndRedefinedModItems.ENDERITED_AXE.get());
				tabData.accept(EndRedefinedModItems.ENDERITED_SWORD.get());
				tabData.accept(EndRedefinedModItems.ENDERITE_UPGRADE_TEMPLATE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EndRedefinedModItems.ENDERITE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(EndRedefinedModBlocks.ENDERITE_ORE.get().asItem());
			tabData.accept(EndRedefinedModBlocks.ENDERITE_BLOCK.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_LOG.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_WOOD.get().asItem());
			tabData.accept(EndRedefinedModBlocks.STRIPPED_WILDENDERWOOD_LOG.get().asItem());
			tabData.accept(EndRedefinedModBlocks.STRIPPED_WILDENDERWOOD_WOOD.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_PLANKS.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_STAIRS.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_SLAB.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_FENCE.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_FENCE_GATE.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_DOOR.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_TRAPDOOR.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EndRedefinedModItems.ENDER_ARMOR_HELMET.get());
			tabData.accept(EndRedefinedModItems.ENDER_ARMOR_CHESTPLATE.get());
			tabData.accept(EndRedefinedModItems.ENDER_ARMOR_LEGGINGS.get());
			tabData.accept(EndRedefinedModItems.ENDER_ARMOR_BOOTS.get());
			tabData.accept(EndRedefinedModItems.ENDERITED_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EndRedefinedModBlocks.WILDENDERWOOD_LEAVES.get().asItem());
			tabData.accept(EndRedefinedModBlocks.WILDGRASS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EndRedefinedModItems.ENDERITED_PICKAXE.get());
			tabData.accept(EndRedefinedModItems.ENDERITED_AXE.get());
			tabData.accept(EndRedefinedModItems.ENDERITED_SHOVEL.get());
			tabData.accept(EndRedefinedModItems.ENDERITED_HOE.get());
		}
	}
}