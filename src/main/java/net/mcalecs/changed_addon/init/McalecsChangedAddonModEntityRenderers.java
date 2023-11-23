
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalecs.changed_addon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcalecs.changed_addon.client.renderer.TestingMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class McalecsChangedAddonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(McalecsChangedAddonModEntities.TESTING_MOB.get(), TestingMobRenderer::new);
	}
}
