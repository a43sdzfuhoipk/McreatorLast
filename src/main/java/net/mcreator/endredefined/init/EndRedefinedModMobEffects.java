/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endredefined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.endredefined.potion.TeleporteffectMobEffect;
import net.mcreator.endredefined.EndRedefinedMod;

public class EndRedefinedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, EndRedefinedMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> TELEPORTEFFECT = REGISTRY.register("teleporteffect", () -> new TeleporteffectMobEffect());
}