package net.mcreator.endredefined.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.endredefined.network.EndRedefinedModVariables;
import net.mcreator.endredefined.init.EndRedefinedModItems;
import net.mcreator.endredefined.init.EndRedefinedModGameRules;

public class TeleportOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean SafeSpot = false;
		boolean found = false;
		double Raytrace = 0;
		double DistancePercurred = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		SafeSpot = false;
		while (SafeSpot == false) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == EndRedefinedModItems.ENDER_ARMOR_HELMET.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == EndRedefinedModItems.ENDER_ARMOR_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == EndRedefinedModItems.ENDER_ARMOR_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == EndRedefinedModItems.ENDER_ARMOR_BOOTS.get()) {
				EndRedefinedModVariables.MapVariables.get(world).TeleportCharge = 0;
				EndRedefinedModVariables.MapVariables.get(world).markSyncDirty();
				sx = -2;
				found = false;
				Raytrace = (world instanceof ServerLevel _serverLevelGR8 ? _serverLevelGR8.getGameRules().getInt(EndRedefinedModGameRules.MAX_TELEPORT_RANGE) : 0);
				if (EndRedefinedModVariables.MapVariables.get(world).TeleportCharge == 4) {
					for (int index1 = 0; index1 < 2; index1++) {
						sy = -1;
						for (int index2 = 0; index2 < 2; index2++) {
							sz = -1;
							for (int index3 = 0; index3 < 2; index3++) {
								if ((world
										.getBlockState(
												BlockPos.containing(
														entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																		entity))
																.getBlockPos().getX() + sx,
														entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																		entity))
																.getBlockPos().getY() + sy,
														entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																		entity))
																.getBlockPos().getZ() + sz)))
										.getBlock() == Blocks.AIR && world
												.getBlockState(
														BlockPos.containing(
																entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE,
																				ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX() + sx,
																entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE,
																				ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getY() - 1 + sy,
																entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE,
																		ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() + sz))
												.canOcclude()) {
									{
										Entity _ent = entity;
										_ent.teleportTo(
												(entity.level()
														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX() + sx),
												(entity.level()
														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY() + sy),
												(entity.level()
														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ() + sz));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection
													.teleport(
															(entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getX() + sx),
															(entity.level()
																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																			entity))
																	.getBlockPos().getY() + sy),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(DistancePercurred)), ClipContext.Block.OUTLINE,
																	ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() + sz),
															_ent.getYRot(), _ent.getXRot());
									}
									SafeSpot = true;
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
					DistancePercurred = DistancePercurred - 1;
				}
			}
		}
	}
}