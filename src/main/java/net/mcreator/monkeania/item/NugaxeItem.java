
package net.mcreator.monkeania.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.monkeania.init.MonkeaniaModItems;

public class NugaxeItem extends PickaxeItem {
	public NugaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1600;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MonkeaniaModItems.CHICKEN_NUGGET.get()));
			}
		}, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
