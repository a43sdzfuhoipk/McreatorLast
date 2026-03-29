package net.mcreator.endredefined.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.Minecraft;

import net.mcreator.endredefined.procedures.*;

@EventBusSubscriber(Dist.CLIENT)
public class TeleportbarOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (TeleportbarDisplayOverlayIngameProcedure.execute(entity)) {
			if (Teleportbar5Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("end_redefined:textures/screens/teleport5.png"), w - 34, 8, 0, 0, 29, 5, 29, 5);
			}
			if (Teleportbar4Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("end_redefined:textures/screens/teleport4.png"), w / 2 + 180, h / 2 + -112, 0, 0, 29, 5, 29, 5);
			}
			if (Teleportbar3Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("end_redefined:textures/screens/teleport3.png"), w / 2 + 180, h / 2 + -112, 0, 0, 29, 5, 29, 5);
			}
			if (Teleportbar2Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("end_redefined:textures/screens/teleport2.png"), w / 2 + 180, h / 2 + -112, 0, 0, 29, 5, 29, 5);
			}
			if (Teleportbar1Procedure.execute(world)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("end_redefined:textures/screens/teleport1.png"), w / 2 + 180, h / 2 + -112, 0, 0, 29, 5, 29, 5);
			}
		}
	}
}