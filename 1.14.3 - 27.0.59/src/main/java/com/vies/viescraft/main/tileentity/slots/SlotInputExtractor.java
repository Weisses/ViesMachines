package com.vies.viescraft.main.tileentity.slots;

import com.vies.viescraft.setup.SetupItemsVM;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotInputExtractor  extends SlotItemHandler {
	
	public SlotInputExtractor(IItemHandler inventoryIn, int index, int xPosition, int yPosition) 
	{
		super(inventoryIn, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
    {
		Item item = stack.getItem();
		
		if(item == SetupItemsVM.XEGONITE) return false;
        
		return true;
    }
}
