
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalecs.changed_addon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcalecs.changed_addon.item.PrideBalloonItem;
import net.mcalecs.changed_addon.item.DevItemItem;
import net.mcalecs.changed_addon.item.BaseballBatToolItem;
import net.mcalecs.changed_addon.item.AddonBookItem;
import net.mcalecs.changed_addon.McalecsChangedAddonMod;

public class McalecsChangedAddonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McalecsChangedAddonMod.MODID);
	public static final RegistryObject<Item> BASEBALL_BAT = REGISTRY.register("baseball_bat", () -> new BaseballBatToolItem());
	public static final RegistryObject<Item> ADDON_BOOK = REGISTRY.register("addon_book", () -> new AddonBookItem());
	public static final RegistryObject<Item> DEV_ITEM = REGISTRY.register("dev_item", () -> new DevItemItem());
	public static final RegistryObject<Item> PRIDE_BALLOON = REGISTRY.register("pride_balloon", () -> new PrideBalloonItem());
	public static final RegistryObject<Item> TESTING_MOB_SPAWN_EGG = REGISTRY.register("testing_mob_spawn_egg", () -> new ForgeSpawnEggItem(McalecsChangedAddonModEntities.TESTING_MOB, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
