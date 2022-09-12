
package net.mcreator.monkeania.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.monkeania.init.MonkeaniaModItems;

public class PlasticPickaxeItem extends PickaxeItem {
	public PlasticPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 220;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MonkeaniaModItems.PLASTIC_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
