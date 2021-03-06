
package net.mcreator.createcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.createcraft.itemgroup.CreateCraftItemGroup;
import net.mcreator.createcraft.CreatecraftModElements;

@CreatecraftModElements.ModElement.Tag
public class ReinforcedDirtPickItem extends CreatecraftModElements.ModElement {
	@ObjectHolder("createcraft:reinforced_dirt_pick")
	public static final Item block = null;
	public ReinforcedDirtPickItem(CreatecraftModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 175;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(CreateCraftItemGroup.tab)) {
		}.setRegistryName("reinforced_dirt_pick"));
	}
}
