package com.vies.viescraft.main.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGeneric extends Item {
	
	private Rarity itemRarity;
	private String procName;
	
	public ItemGeneric(String registrynameIn, Properties propertiesIn, int stacksizeIn, Rarity rarityIn, ItemGroup itemgroupIn, String procnameIn) 
	{
		super(propertiesIn
				.group(itemgroupIn)
				.maxStackSize(stacksizeIn)
				.rarity(rarityIn)
				);
		
		this.setRegistryName(registrynameIn);
		
		this.itemRarity = rarityIn;
		this.procName = procnameIn;
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
	{
		TextFormatting textColor = TextFormatting.GRAY;
		
		if (this.itemRarity == Rarity.UNCOMMON)
		{
			textColor = TextFormatting.GOLD;
		}
		
		if (this.itemRarity == Rarity.RARE)
		{
			textColor = TextFormatting.DARK_AQUA;
		}
		
		if (this.itemRarity == Rarity.EPIC)
		{
			textColor = TextFormatting.DARK_PURPLE;
		}
		
		// Sets the tooltips
		tooltip.add(new TranslationTextComponent(this.getRegistryName() + ".tt.1.desc").applyTextStyle(textColor));
		tooltip.add(new TranslationTextComponent(this.getRegistryName() + ".tt.2.desc").applyTextStyle(textColor));
	}
	
    /** Return the name for this gem proc. */
	public String getGemProcName()
    {
        return this.procName.toString();
    }
}
