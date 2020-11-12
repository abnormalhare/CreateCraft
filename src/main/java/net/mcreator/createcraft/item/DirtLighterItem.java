
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class DirtLighterItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:dirt_lighter")
	public static final Item block = null;

	public DirtLighterItem(CreatecraftModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(CreateCraftItemGroup.tab).maxStackSize(1));
			setRegistryName("dirt_lighter");
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
			list.add(new StringTextComponent("Could light a kind of portal...?"));
		}

	}

}
