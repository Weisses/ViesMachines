package com.vies.viescraft.main.tileentity.containers;

import com.mojang.blaze3d.platform.GlStateManager;
import com.vies.viescraft.api.References;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class ScreenExtractor extends ContainerScreen<ExtractorContainer> {
	
	private ResourceLocation GUI = new ResourceLocation(References.MOD_ID, "textures/gui/container_gui_appliance_extractor.png");
	
	public ScreenExtractor(ExtractorContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        //drawString(Minecraft.getInstance().fontRenderer, "Energy: " + container.getEnergy(), 10, 10, 0xffffff);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);
    }
	
	



/*
	private final World world;
    private final TileEntityExtractor appliance;
    
    private int cutTime;
    private int totalCutTime;
    private int procChance;
    private boolean isOn;
    
    public ContainerExtractor(InventoryPlayer playerInventory, World worldIn, TileEntityExtractor applianceIn)
    {
    	this.world = worldIn;
        this.appliance = applianceIn;

        // Item Input slot:
        this.addSlotToContainer(new SlotInputExtractor(this.appliance.inventory, 0, 80, 53));
        
        // Shard output slot:
        this.addSlotToContainer(new SlotOutputVM(this.appliance.inventory, 1, 134, 35));
        
        // Player Hotbar, Slot 0-8, Slot IDs 36-44:
        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
        
        // Player Inventory, Slot 9-35, Slot IDs 9-35:
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }
    
    @Override
    public void onContainerClosed(EntityPlayer playerIn)
    {
        super.onContainerClosed(playerIn);
        
        this.saveCraftingMatrix();
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
    	this.saveCraftingMatrix();
    	
        return this.world.getBlockState(this.appliance.getPos()).getBlock() != SetupBlocksVM.EXTRACTOR ? false : playerIn.getDistanceSq((double)this.appliance.getPos().getX() + 0.5D, (double)this.appliance.getPos().getY() + 0.5D, (double)this.appliance.getPos().getZ() + 0.5D) <= 64.0D;
    }
    
    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
        
        this.saveCraftingMatrix();
        
        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = (IContainerListener)this.listeners.get(i);
            
            if (this.cutTime != this.appliance.getField(0))
            {
                icontainerlistener.sendWindowProperty(this, 0, this.appliance.getField(0));
            }
            
            if (this.totalCutTime != this.appliance.getField(1))
            {
                icontainerlistener.sendWindowProperty(this, 1, this.appliance.getField(1));
            }
            
            if (this.procChance != this.appliance.getField(2))
            {
                icontainerlistener.sendWindowProperty(this, 2, this.appliance.getField(2));
            }
        }

        this.cutTime = this.appliance.getField(0);
        this.totalCutTime = this.appliance.getField(1);
        this.procChance = this.appliance.getField(2);
        this.isOn = this.appliance.isOn;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.appliance.setField(id, data);
    }
    
    /** Saves the items to the appliance inventory. *
    private void saveCraftingMatrix()
    {
	  	for (int i = 0; i < this.appliance.inventory.getSlots(); i++) 
    	{
    		this.appliance.inventory.setStackInSlot(i, this.appliance.inventory.getStackInSlot(i));
    	}
    }
    */
}
