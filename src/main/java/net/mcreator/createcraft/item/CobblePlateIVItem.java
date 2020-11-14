
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class CobblePlateIVItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:cobble_plate_iv")
	public static final Item block = null;

	public CobblePlateIVItem(CreatecraftModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("cobble_plate_iv");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("A blue cobblestone plate."));
		}

	}

}
