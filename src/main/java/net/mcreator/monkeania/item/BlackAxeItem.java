
package net.mcreator.monkeania.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.monkeania.init.MonkeaniaModItems;

public class BlackAxeItem extends AxeItem {
	public BlackAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MonkeaniaModItems.BLACK_BONE.get()));
			}
		}, 1, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
