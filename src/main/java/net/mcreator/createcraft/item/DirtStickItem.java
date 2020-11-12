
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class DirtStickItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:dirt_stick")
	public static final Item block = null;

	public DirtStickItem(CreatecraftModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(CreateCraftItemGroup.tab).maxStackSize(64));
			setRegistryName("dirt_stick");
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
