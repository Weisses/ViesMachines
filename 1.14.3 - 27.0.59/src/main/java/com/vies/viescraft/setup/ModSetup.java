package com.vies.viescraft.setup;

import com.vies.viescraft.api.References;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	
	public ItemGroup itemGroupBlocks = new ItemGroup(References.MOD_ID + ".blocks") 
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(SetupBlocksVM.XEGONITE_BLOCK);
		}
	};
	
	public ItemGroup itemGroupItems = new ItemGroup(References.MOD_ID + ".items") 
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(SetupItemsVM.XEGONITE);
		}
	};
	
	public ItemGroup itemGroupAirships = new ItemGroup(References.MOD_ID + ".airships") 
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(SetupItemsVM.XEGONITE);
		}
	};
	
	
	
	
	public void init() 
	{
		
	}
}
