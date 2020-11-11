
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class ReinforcedCobblePlateItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:reinforced_cobble_plate")
	public static final Item block = null;

	public ReinforcedCobblePlateItem(CreatecraftModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(CreateCraftItemGroup.tab).maxStackSize(64));
			setRegistryName("reinforced_cobble_plate");
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
