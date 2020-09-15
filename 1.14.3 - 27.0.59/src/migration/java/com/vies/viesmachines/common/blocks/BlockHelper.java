package com.vies.viesmachines.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockHelper extends Block {
	
	public BlockHelper(Properties materialIn, String blockNameIn) 
	{
		super(materialIn);
		this.setBlockName(this, blockNameIn);
	}
	
	
	/** Set the registry name of {@code block} to {@code blockName} and the unlocalized name to the full registry name. */
	public static void setBlockName(Block block, String blockName) 
	{
		block.setRegistryName(blockName);
		//block.set.setUnlocalizedName(block.getRegistryName().toString());
	}
}
