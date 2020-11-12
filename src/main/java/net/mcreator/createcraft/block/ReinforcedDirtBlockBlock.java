
package net.mcreator.createcraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.createcraft.itemgroup.CreateCraftItemGroup;
import net.mcreator.createcraft.item.DirPlateIItem;
import net.mcreator.createcraft.CreatecraftModElements;

import java.util.List;
import java.util.Collections;

@CreatecraftModElements.ModElement.Tag
public class ReinforcedDirtBlockBlock extends CreatecraftModElements.ModElement {
	@ObjectHolder("createcraft:reinforced_dirt_block")
	public static final Block block = null;
	public ReinforcedDirtBlockBlock(CreatecraftModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CreateCraftItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(5f, 25f).lightValue(0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).slipperiness(0.3f));
			setRegistryName("reinforced_dirt_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DirPlateIItem.block, (int) (4)));
		}
	}
}
