package com.vies.viescraft.main.tileentity;

import java.util.Random;

import com.vies.viescraft.setup.SetupItemsVM;

import net.minecraft.item.ItemStack;

public class ExtractorRecipes {
	
    private static final ExtractorRecipes CUTTING_BASE = new ExtractorRecipes();
    
    /** Returns an instance of GemRecipes. */
    public static ExtractorRecipes instance()
    {
        return CUTTING_BASE;
    }
    
    public final static ItemStack[] CUT_GEM_OUTPUT = new ItemStack[] 
	{
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1),
		new ItemStack(SetupItemsVM.XEGONITE, 1)
	};
    
    /** Returns a random gem from the gem array. */
    public static ItemStack getRandomGem(ItemStack[] array) 
    {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
