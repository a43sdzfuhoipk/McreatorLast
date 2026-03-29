package net.mcreator.endredefined.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.endredefined.init.EndRedefinedModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements EndRedefinedModBiomes.EndRedefinedModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> end_redefined_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.end_redefined_dimensionTypeReference != null) {
			retval = EndRedefinedModBiomes.adaptSurfaceRule(retval, this.end_redefined_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setend_redefinedDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.end_redefined_dimensionTypeReference = dimensionType;
	}
}