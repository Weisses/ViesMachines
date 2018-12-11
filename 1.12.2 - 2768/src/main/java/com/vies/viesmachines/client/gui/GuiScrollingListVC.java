package com.vies.viesmachines.client.gui;

import java.util.ArrayList;

import com.vies.viesmachines.api.References;
import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMainSelectMusic;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraftforge.fml.client.GuiScrollingList;

public class GuiScrollingListVC extends GuiScrollingList {
    
    private GuiMachineMenuMainSelectMusic parent;
    private ArrayList<ResourceLocation> songs;
    private int slotHeight;

    public GuiScrollingListVC(GuiMachineMenuMainSelectMusic parent, ArrayList<ResourceLocation> songsIn, int listWidth, int slotHeightIn)
    {
        super(parent.getMinecraftInstance(), 
        		listWidth+2, parent.height, 
        		parent.getGuiTop()+16+28, parent.getGuiTop() + parent.height-80+28, 
        		parent.getGuiLeft() + 42, 
        		slotHeightIn, parent.width, parent.height);
        
        this.parent = parent;
        this.songs = songsIn;
        this.slotHeight = slotHeightIn;
    }

    @Override
    protected int getSize()
    {
        return songs.size();
    }

    @Override
    protected void elementClicked(int index, boolean doubleClick)
    {
        this.parent.selectModIndex(index);
    }

    @Override
    protected boolean isSelected(int index)
    {
        return this.parent.modIndexSelected(index);
    }

    @Override
    protected void drawBackground()
    {
        this.parent.drawDefaultBackground();
    }

    @Override
    protected int getContentHeight()
    {
        return (this.getSize()) * this.slotHeight  + 1;
    }

    public ArrayList<ResourceLocation> getSongs()
    {
        return songs;
    }
    
    @Override
    protected void drawSlot(int idx, int right, int top, int height, Tessellator tess)
    {
        ResourceLocation mc       = songs.get(idx);
        String           version  = StringUtils.stripControlCodes(References.localNameVC("item." + mc.getResourcePath() + ".desc"));
        FontRenderer     font     = this.parent.getFontRenderer();
        
        font.drawString(version, this.left + 3 , top + 2, 0xCCCCCC);
    }
}
