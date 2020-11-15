
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class TiramisuItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:tiramisu")
	public static final Item block = null;

	public TiramisuItem(CreatecraftModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(12).saturation(1f).setAlwaysEdible()

					.build()));
			setRegistryName("tiramisu");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 38;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
