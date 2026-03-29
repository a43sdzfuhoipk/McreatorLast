package net.mcreator.endredefined.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.endredefined.endbiomes.TheEndBiomes;

@EventBusSubscriber
public class EndRedefinedModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("end_redefined:endbiome_01")), 1d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("end_redefined:biome")), 100d);
		});
	}
}