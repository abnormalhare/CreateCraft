
package net.mcreator.createcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.createcraft.itemgroup.CreateCraftItemGroup;
import net.mcreator.createcraft.CreatecraftModElements;

@CreatecraftModElements.ModElement.Tag
public class HardenedDirtPlateItem extends CreatecraftModElements.ModElement {
	@ObjectHolder("createcraft:hardened_dirt_plate")
	public static final Item block = null;
	public HardenedDirtPlateItem(CreatecraftModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreateCraftItemGroup.tab).maxStackSize(64));
			setRegistryName("hardened_dirt_plate");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
