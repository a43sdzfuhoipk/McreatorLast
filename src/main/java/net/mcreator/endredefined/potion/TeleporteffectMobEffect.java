package net.mcreator.endredefined.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class TeleporteffectMobEffect extends InstantenousMobEffect {
	public TeleporteffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1048321);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.enderman.teleport")));
	}
}