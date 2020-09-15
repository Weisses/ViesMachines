package com.vies.viescraft.main.tileentity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.vies.viescraft.main.tileentity.containers.ExtractorContainer;
import com.vies.viescraft.setup.SetupBlocksVM;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityExtractor extends TileEntity implements ITickableTileEntity, INamedContainerProvider { //ITickable //This is totally different in 1.14

	//private ItemStackHandler handler;
	private LazyOptional<IItemHandler> handler = LazyOptional.of(this::createHandler);
	private int size = 2; // Range = 0-1;
	
    public TileEntityExtractor() 
    {
    	super(SetupBlocksVM.EXTRACTOR);
    	//this.inventory = new ItemStackHandler(size);
    }

    //--------------------------------------------

	@Override
	public void tick() 
	{
		
		
		
		
	}

	
	
	
	
	@Override
	public void read(CompoundNBT compound) 
	{
		super.read(compound);
		
		CompoundNBT invTag = compound.getCompound("invvc");
		
		handler.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(invTag));
		
		
		
		//handler.ifPresent(h -> ((INBTSerializable<CompoundNBT>)h).deserializeNBT(invTag));
		
		
		
		//this.createHandler().deserializeNBT(invtag);
		
		
	}
	
	@Override
	public CompoundNBT write(CompoundNBT tag) 
	{
		return super.write(tag);
		
		handler.ifPresent(h -> {
            CompoundNBT compound = ((INBTSerializable<CompoundNBT>) h).serializeNBT();
            tag.put("inv", compound);
        });
		
		//handler.ifPresent(h -> 
		//{
		//	CompoundNBT fulltag = ((INBTSerializable<CompoundNBT>)h).serializeNBT();
		//	fulltag.put("invvc", fulltag);
		
		//});
		
		//CompoundNBT fulltag = this.createHandler().serializeNBT();
		
		//fulltag.put("invvc", compound);
		
		
	}
	
	


	@Override
	@Nonnull
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
    {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return handler.cast();
		}
		
		return super.getCapability(cap, side);
	}
	
	private ItemStackHandler createHandler()
	{
		return new ItemStackHandler(size)
		{
			// This allows only diamonds into the te inventory.
			@Override
			public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) 
			{
				if (stack.getItem() != Items.DIAMOND)
				{
					return stack;
				}
				return super.insertItem(slot, stack, simulate);
			}
			
		};
	}

	@Override
	public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
		// TODO Auto-generated method stub
		return new ExtractorContainer(p_createMenu_1_, world, pos, p_createMenu_2_, p_createMenu_3_);
	}

	@Override
	public ITextComponent getDisplayName() {
		// TODO Auto-generated method stub
		return new StringTextComponent(getType().getRegistryName().getPath());
	}
	
	
	
}
