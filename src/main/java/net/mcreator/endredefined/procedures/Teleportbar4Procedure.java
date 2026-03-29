package net.mcreator.endredefined.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.endredefined.network.EndRedefinedModVariables;

public class Teleportbar4Procedure {
	public static boolean execute(LevelAccessor world) {
		return EndRedefinedModVariables.MapVariables.get(world).TeleportCharge == 3;
	}
}