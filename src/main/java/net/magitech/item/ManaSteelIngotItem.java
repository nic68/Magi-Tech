
package net.magitech.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.magitech.itemgroup.MagiTechResourcesItemGroup;
import net.magitech.MagiTechElements;

import java.util.List;

@MagiTechElements.ModElement.Tag
public class ManaSteelIngotItem extends MagiTechElements.ModElement {
	@ObjectHolder("magitech:manasteelingot")
	public static final Item block = null;
	public ManaSteelIngotItem(MagiTechElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MagiTechResourcesItemGroup.tab).maxStackSize(64));
			setRegistryName("manasteelingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Iron infused with mana extracted from carbon based lifeforms"));
			list.add(new StringTextComponent("Has higher enchantability than gold"));
		}
	}
}
