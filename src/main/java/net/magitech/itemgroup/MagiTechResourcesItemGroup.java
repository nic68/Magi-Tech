
package net.magitech.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.magitech.item.ManaSteelIngotItem;
import net.magitech.MagiTechElements;

@MagiTechElements.ModElement.Tag
public class MagiTechResourcesItemGroup extends MagiTechElements.ModElement {
	public MagiTechResourcesItemGroup(MagiTechElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmagitechresources") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ManaSteelIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
