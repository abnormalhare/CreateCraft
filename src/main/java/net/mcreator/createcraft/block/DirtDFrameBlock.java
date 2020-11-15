
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

		public static final DirectionProperty FACING = DirectionalBlock.FACING;

		public CustomBlock() {
			super(

					Block.Properties.create(Material.EARTH).sound(SoundType.GROUND).hardnessAndResistance(1f, 999f).lightValue(0).harvestLevel(1)
							.harvestTool(ToolType.SHOVEL));

			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));

			setRegistryName("dirt_d_frame");
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
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
