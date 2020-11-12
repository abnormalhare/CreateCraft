
package net.mcreator.createcraft.block;

import net.minecraft.block.material.Material;

@CreatecraftModElements.ModElement.Tag
public class DirtDFrameBlock extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:dirt_d_frame")
	public static final Block block = null;

	public DirtDFrameBlock(CreatecraftModElements instance) {
		super(instance, 54);

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

					Block.Properties.create(Material.EARTH).sound(SoundType.GROUND).hardnessAndResistance(1f, 999f).lightValue(0).harvestLevel(1)
							.harvestTool(ToolType.SHOVEL));

			setRegistryName("dirt_d_frame");
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
