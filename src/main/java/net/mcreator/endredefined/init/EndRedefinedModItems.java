/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endredefined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.endredefined.item.*;
import net.mcreator.endredefined.EndRedefinedMod;

import java.util.function.Function;

public class EndRedefinedModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EndRedefinedMod.MODID);
	public static final DeferredItem<Item> ENDERITE;
	public static final DeferredItem<Item> ENDERITE_ORE;
	public static final DeferredItem<Item> ENDERITE_BLOCK;
	public static final DeferredItem<Item> ENDGRASS;
	public static final DeferredItem<Item> CHORUSBLOCK;
	public static final DeferredItem<Item> CHORUSFLOWERBLOCK;
	public static final DeferredItem<Item> CHORUSFRUITBLOCK;
	public static final DeferredItem<Item> ENDER_ARMOR_HELMET;
	public static final DeferredItem<Item> ENDER_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> ENDER_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> ENDER_ARMOR_BOOTS;
	public static final DeferredItem<Item> ENDER_SHARD;
	public static final DeferredItem<Item> ENDGRASS_WILD;
	public static final DeferredItem<Item> WILDENDERWOOD_LOG;
	public static final DeferredItem<Item> WILDENDERWOOD_WOOD;
	public static final DeferredItem<Item> STRIPPED_WILDENDERWOOD_LOG;
	public static final DeferredItem<Item> STRIPPED_WILDENDERWOOD_WOOD;
	public static final DeferredItem<Item> WILDENDERWOOD_PLANKS;
	public static final DeferredItem<Item> WILDENDERWOOD_LEAVES;
	public static final DeferredItem<Item> WILDENDERWOOD_STAIRS;
	public static final DeferredItem<Item> WILDENDERWOOD_SLAB;
	public static final DeferredItem<Item> WILDENDERWOOD_FENCE;
	public static final DeferredItem<Item> WILDENDERWOOD_FENCE_GATE;
	public static final DeferredItem<Item> WILDENDERWOOD_DOOR;
	public static final DeferredItem<Item> WILDENDERWOOD_TRAPDOOR;
	public static final DeferredItem<Item> WILDENDERWOOD_PRESSURE_PLATE;
	public static final DeferredItem<Item> WILDENDERWOOD_BUTTON;
	public static final DeferredItem<Item> WILDGRASS;
	public static final DeferredItem<Item> FIREOFENDER;
	public static final DeferredItem<Item> PIECE_OF_COAL;
	public static final DeferredItem<Item> ENDERITED_PICKAXE;
	public static final DeferredItem<Item> ENDERITED_AXE;
	public static final DeferredItem<Item> ENDERITED_SWORD;
	public static final DeferredItem<Item> ENDERITED_SHOVEL;
	public static final DeferredItem<Item> ENDERITED_HOE;
	public static final DeferredItem<Item> ENDERITE_UPGRADE_TEMPLATE;
	static {
		ENDERITE = register("enderite", EnderiteItem::new);
		ENDERITE_ORE = block(EndRedefinedModBlocks.ENDERITE_ORE);
		ENDERITE_BLOCK = block(EndRedefinedModBlocks.ENDERITE_BLOCK);
		ENDGRASS = block(EndRedefinedModBlocks.ENDGRASS, new Item.Properties().stacksTo(32).rarity(Rarity.UNCOMMON).fireResistant());
		CHORUSBLOCK = block(EndRedefinedModBlocks.CHORUSBLOCK);
		CHORUSFLOWERBLOCK = block(EndRedefinedModBlocks.CHORUSFLOWERBLOCK);
		CHORUSFRUITBLOCK = block(EndRedefinedModBlocks.CHORUSFRUITBLOCK);
		ENDER_ARMOR_HELMET = register("ender_armor_helmet", EnderArmorItem.Helmet::new);
		ENDER_ARMOR_CHESTPLATE = register("ender_armor_chestplate", EnderArmorItem.Chestplate::new);
		ENDER_ARMOR_LEGGINGS = register("ender_armor_leggings", EnderArmorItem.Leggings::new);
		ENDER_ARMOR_BOOTS = register("ender_armor_boots", EnderArmorItem.Boots::new);
		ENDER_SHARD = register("ender_shard", EnderShardItem::new);
		ENDGRASS_WILD = block(EndRedefinedModBlocks.ENDGRASS_WILD, new Item.Properties().stacksTo(32).rarity(Rarity.UNCOMMON).fireResistant());
		WILDENDERWOOD_LOG = block(EndRedefinedModBlocks.WILDENDERWOOD_LOG);
		WILDENDERWOOD_WOOD = block(EndRedefinedModBlocks.WILDENDERWOOD_WOOD);
		STRIPPED_WILDENDERWOOD_LOG = block(EndRedefinedModBlocks.STRIPPED_WILDENDERWOOD_LOG);
		STRIPPED_WILDENDERWOOD_WOOD = block(EndRedefinedModBlocks.STRIPPED_WILDENDERWOOD_WOOD);
		WILDENDERWOOD_PLANKS = block(EndRedefinedModBlocks.WILDENDERWOOD_PLANKS);
		WILDENDERWOOD_LEAVES = block(EndRedefinedModBlocks.WILDENDERWOOD_LEAVES);
		WILDENDERWOOD_STAIRS = block(EndRedefinedModBlocks.WILDENDERWOOD_STAIRS);
		WILDENDERWOOD_SLAB = block(EndRedefinedModBlocks.WILDENDERWOOD_SLAB);
		WILDENDERWOOD_FENCE = block(EndRedefinedModBlocks.WILDENDERWOOD_FENCE);
		WILDENDERWOOD_FENCE_GATE = block(EndRedefinedModBlocks.WILDENDERWOOD_FENCE_GATE);
		WILDENDERWOOD_DOOR = doubleBlock(EndRedefinedModBlocks.WILDENDERWOOD_DOOR);
		WILDENDERWOOD_TRAPDOOR = block(EndRedefinedModBlocks.WILDENDERWOOD_TRAPDOOR);
		WILDENDERWOOD_PRESSURE_PLATE = block(EndRedefinedModBlocks.WILDENDERWOOD_PRESSURE_PLATE);
		WILDENDERWOOD_BUTTON = block(EndRedefinedModBlocks.WILDENDERWOOD_BUTTON);
		WILDGRASS = block(EndRedefinedModBlocks.WILDGRASS);
		FIREOFENDER = register("fireofender", FireofenderItem::new);
		PIECE_OF_COAL = register("piece_of_coal", PieceOfCoalItem::new);
		ENDERITED_PICKAXE = register("enderited_pickaxe", EnderitedPickaxeItem::new);
		ENDERITED_AXE = register("enderited_axe", EnderitedAxeItem::new);
		ENDERITED_SWORD = register("enderited_sword", EnderitedSwordItem::new);
		ENDERITED_SHOVEL = register("enderited_shovel", EnderitedShovelItem::new);
		ENDERITED_HOE = register("enderited_hoe", EnderitedHoeItem::new);
		ENDERITE_UPGRADE_TEMPLATE = register("enderite_upgrade_template", EnderiteUpgradeTemplateItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}
}