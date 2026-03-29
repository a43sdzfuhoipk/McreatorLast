/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endredefined.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber
public class EndRedefinedModGameRules {
	public static GameRules.Key<GameRules.IntegerValue> MAX_TELEPORT_RANGE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		MAX_TELEPORT_RANGE = GameRules.register("maxTeleportRange", GameRules.Category.PLAYER, GameRules.IntegerValue.create(50));
	}
}