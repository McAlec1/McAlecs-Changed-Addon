
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalecs.mcalecs_changed_addon.init;

import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcalecs.mcalecs_changed_addon.client.model.Modelmodel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class McalecsChangedAddonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmodel.LAYER_LOCATION, Modelmodel::createBodyLayer);
	}
}
