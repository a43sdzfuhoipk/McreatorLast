package net.mcreator.endredefined.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.endredefined.network.EndRedefinedModVariables;

public class TeleportChargeRechargeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDoubleOr("TimePassed", 0) > 10) {
			if (EndRedefinedModVariables.MapVariables.get(world).TeleportCharge < 4) {
				EndRedefinedModVariables.MapVariables.get(world).TeleportCharge = EndRedefinedModVariables.MapVariables.get(world).TeleportCharge + 1;
				EndRedefinedModVariables.MapVariables.get(world).markSyncDirty();
			}
		} else {
			entity.getPersistentData().putDouble("TimePassed", (entity.getPersistentData().getDoubleOr("TimePassed", 0) + 1));
		}
	}
}