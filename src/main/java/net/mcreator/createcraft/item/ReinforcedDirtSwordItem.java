
package net.mcreator.createcraft.item;

@CreatecraftModElements.ModElement.Tag
public class ReinforcedDirtSwordItem extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:reinforced_dirt_sword")
	public static final Item block = null;

	public ReinforcedDirtSwordItem(CreatecraftModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 204;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(CreateCraftItemGroup.tab)) {

		}.setRegistryName("reinforced_dirt_sword"));
	}

}
