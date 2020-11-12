
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class ReinforcedDirtShovelItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:reinforced_dirt_shovel")
	public static final Item block = null;

	public ReinforcedDirtShovelItem(CreatecraftModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
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

		}.setRegistryName("reinforced_dirt_shovel"));
	}

}
