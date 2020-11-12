
package net.mcreator.createcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.createcraft.block.ReinforcedDirtBlockBlock;
import net.mcreator.createcraft.CreatecraftModElements;

@CreatecraftModElements.ModElement.Tag
public class CreateCraftItemGroup extends CreatecraftModElements.ModElement {
	public CreateCraftItemGroup(CreatecraftModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreate_craft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ReinforcedDirtBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
