package net.mcreator.endredefined.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ChorusblockBlock extends Block {
	public ChorusblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(0.5f, 10f).lightLevel(s -> 4));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}