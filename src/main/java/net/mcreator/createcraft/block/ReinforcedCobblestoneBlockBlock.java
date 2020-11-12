
package net.mcreator.createcraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.createcraft.itemgroup.CreateCraftItemGroup;
import net.mcreator.createcraft.CreatecraftModElements;

import java.util.List;
import java.util.Collections;

@CreatecraftModElements.ModElement.Tag
public class ReinforcedCobblestoneBlockBlock extends CreatecraftModElements.ModElement {
	@ObjectHolder("createcraft:reinforced_cobblestone_block")
	public static final Block block = null;
	public ReinforcedCobblestoneBlockBlock(CreatecraftModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CreateCraftItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(7f, 20f).lightValue(0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("reinforced_cobblestone_block");
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
