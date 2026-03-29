/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endredefined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.endredefined.block.*;
import net.mcreator.endredefined.EndRedefinedMod;

import java.util.function.Function;

public class EndRedefinedModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EndRedefinedMod.MODID);
	public static final DeferredBlock<Block> ENDERITE_ORE;
	public static final DeferredBlock<Block> ENDERITE_BLOCK;
	public static final DeferredBlock<Block> ENDGRASS;
	public static final DeferredBlock<Block> CHORUSBLOCK;
	public static final DeferredBlock<Block> CHORUSFLOWERBLOCK;
	public static final DeferredBlock<Block> CHORUSFRUITBLOCK;
	public static final DeferredBlock<Block> ENDGRASS_WILD;
	public static final DeferredBlock<Block> WILDENDERWOOD_LOG;
	public static final DeferredBlock<Block> WILDENDERWOOD_WOOD;
	public static final DeferredBlock<Block> STRIPPED_WILDENDERWOOD_LOG;
	public static final DeferredBlock<Block> STRIPPED_WILDENDERWOOD_WOOD;
	public static final DeferredBlock<Block> WILDENDERWOOD_PLANKS;
	public static final DeferredBlock<Block> WILDENDERWOOD_LEAVES;
	public static final DeferredBlock<Block> WILDENDERWOOD_STAIRS;
	public static final DeferredBlock<Block> WILDENDERWOOD_SLAB;
	public static final DeferredBlock<Block> WILDENDERWOOD_FENCE;
	public static final DeferredBlock<Block> WILDENDERWOOD_FENCE_GATE;
	public static final DeferredBlock<Block> WILDENDERWOOD_DOOR;
	public static final DeferredBlock<Block> WILDENDERWOOD_TRAPDOOR;
	public static final DeferredBlock<Block> WILDENDERWOOD_PRESSURE_PLATE;
	public static final DeferredBlock<Block> WILDENDERWOOD_BUTTON;
	public static final DeferredBlock<Block> WILDGRASS;
	static {
		ENDERITE_ORE = register("enderite_ore", EnderiteOreBlock::new);
		ENDERITE_BLOCK = register("enderite_block", EnderiteBlockBlock::new);
		ENDGRASS = register("endgrass", EndgrassBlock::new);
		CHORUSBLOCK = register("chorusblock", ChorusblockBlock::new);
		CHORUSFLOWERBLOCK = register("chorusflowerblock", ChorusflowerblockBlock::new);
		CHORUSFRUITBLOCK = register("chorusfruitblock", ChorusfruitblockBlock::new);
		ENDGRASS_WILD = register("endgrass_wild", EndgrassWildBlock::new);
		WILDENDERWOOD_LOG = register("wildenderwood_log", WildenderwoodLogBlock::new);
		WILDENDERWOOD_WOOD = register("wildenderwood_wood", WildenderwoodWoodBlock::new);
		STRIPPED_WILDENDERWOOD_LOG = register("stripped_wildenderwood_log", StrippedWildenderwoodLogBlock::new);
		STRIPPED_WILDENDERWOOD_WOOD = register("stripped_wildenderwood_wood", StrippedWildenderwoodWoodBlock::new);
		WILDENDERWOOD_PLANKS = register("wildenderwood_planks", WildenderwoodPlanksBlock::new);
		WILDENDERWOOD_LEAVES = register("wildenderwood_leaves", WildenderwoodLeavesBlock::new);
		WILDENDERWOOD_STAIRS = register("wildenderwood_stairs", WildenderwoodStairsBlock::new);
		WILDENDERWOOD_SLAB = register("wildenderwood_slab", WildenderwoodSlabBlock::new);
		WILDENDERWOOD_FENCE = register("wildenderwood_fence", WildenderwoodFenceBlock::new);
		WILDENDERWOOD_FENCE_GATE = register("wildenderwood_fence_gate", WildenderwoodFenceGateBlock::new);
		WILDENDERWOOD_DOOR = register("wildenderwood_door", WildenderwoodDoorBlock::new);
		WILDENDERWOOD_TRAPDOOR = register("wildenderwood_trapdoor", WildenderwoodTrapdoorBlock::new);
		WILDENDERWOOD_PRESSURE_PLATE = register("wildenderwood_pressure_plate", WildenderwoodPressurePlateBlock::new);
		WILDENDERWOOD_BUTTON = register("wildenderwood_button", WildenderwoodButtonBlock::new);
		WILDGRASS = register("wildgrass", WildgrassBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}