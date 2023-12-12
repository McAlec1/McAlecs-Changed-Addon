
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalecs.mcalecs_changed_addon.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcalecs.mcalecs_changed_addon.client.gui.AddonBookGUIScreen;
import net.mcalecs.mcalecs_changed_addon.client.gui.AddonBookGUIPage1Screen;
import net.mcalecs.mcalecs_changed_addon.client.gui.AddonBookGUIDevTestScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class McalecsChangedAddonModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(McalecsChangedAddonModMenus.ADDON_BOOK_GUI_PAGE_1, AddonBookGUIPage1Screen::new);
			MenuScreens.register(McalecsChangedAddonModMenus.ADDON_BOOK_GUI, AddonBookGUIScreen::new);
			MenuScreens.register(McalecsChangedAddonModMenus.ADDON_BOOK_GUI_DEV_TEST, AddonBookGUIDevTestScreen::new);
		});
	}
}
