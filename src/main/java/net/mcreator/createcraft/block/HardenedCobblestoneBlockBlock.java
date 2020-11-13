
package net.mcreator.createcraft.block;

import net.minecraft.block.material.Material;

@CreatecraftModElements.ModElement.Tag
public class HardenedCobblestoneBlockBlock extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:hardened_cobblestone_block")
	public static final Block block = null;

	public HardenedCobblestoneBlockBlock(CreatecraftModElements instance) {
		super(instance, 55);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CreateCraftItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(28f, 35f).lightValue(0));

			setRegistryName("hardened_cobblestone_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
