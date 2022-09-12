
package net.mcreator.monkeania.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.monkeania.init.MonkeaniaModItems;

public class PlasticSwordItem extends SwordItem {
	public PlasticSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 220;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MonkeaniaModItems.PLASTIC_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
