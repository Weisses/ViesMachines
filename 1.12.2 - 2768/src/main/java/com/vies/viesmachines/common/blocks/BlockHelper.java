package com.vies.viesmachines.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockHelper extends Block {
	
	public BlockHelper(Material material, MapColor mapColor, String blockName) 
	{
		super(material, mapColor);
		setBlockName(this, blockName);
	}
	
	public BlockHelper(Material materialIn, String blockName) 
	{
		this(materialIn, materialIn.getMaterialMapColor(), blockName);
	}
	
	/** Set the registry name of {@code block} to {@code blockName} 
	and the unlocalized name to the full registry name.
	 * 
	 * @param block
	 * @param blockName
	 */
	public static void setBlockName(Block block, String blockName) 
	{
		block.setRegistryName(blockName);
		block.setUnlocalizedName(block.getRegistryName().toString());
	}
}
