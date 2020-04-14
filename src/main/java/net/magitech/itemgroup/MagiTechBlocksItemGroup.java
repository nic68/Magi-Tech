
package net.magitech.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.magitech.block.ManaInfusionAltarBlock;
import net.magitech.MagiTechElements;

@MagiTechElements.ModElement.Tag
public class MagiTechBlocksItemGroup extends MagiTechElements.ModElement {
	public MagiTechBlocksItemGroup(MagiTechElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmagitechblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ManaInfusionAltarBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
