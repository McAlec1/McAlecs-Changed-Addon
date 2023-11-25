
package net.mcalecs.mcalecs_changed_addon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcalecs.mcalecs_changed_addon.init.McalecsChangedAddonModTabs;

public class BaseballBatToolItem extends SwordItem {
	public BaseballBatToolItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties().tab(McalecsChangedAddonModTabs.TAB_MCALECS_CHANGED_TAB));
	}
}
