
package net.mcreator.createcraft.block;

import net.minecraft.block.material.Material;

@CreatecraftModElements.ModElement.Tag
public class ChocolateBlockBlock extends CreatecraftModElements.ModElement {

	@ObjectHolder("createcraft:chocolate_block")
	public static final Block block = null;

	public ChocolateBlockBlock(CreatecraftModElements instance) {
		super(instance, 23);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.CAKE).sound(SoundType.STONE).hardnessAndResistance(0.7f, 2f).lightValue(0));

			setRegistryName("chocolate_block");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void addInformation(ItemStack itemstack, IBlockReader world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Yummy!"));
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 3;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 9));
		}

	}

}
