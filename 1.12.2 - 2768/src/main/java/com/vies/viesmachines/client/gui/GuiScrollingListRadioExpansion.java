package com.vies.viesmachines.client.gui;

import java.util.ArrayList;

import com.vies.viesmachines.api.References;
import com.vies.viesmachines.client.gui.misc.GuiRadioExpansionSelectMusic;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraftforge.fml.client.GuiScrollingList;

public class GuiScrollingListRadioExpansion extends GuiScrollingList {
    
    private GuiRadioExpansionSelectMusic parent;
    private ArrayList<ResourceLocation> songs;

    public GuiScrollingListRadioExpansion(GuiRadioExpansionSelectMusic parent, ArrayList<ResourceLocation> songsIn, int listWidth, int slotHeight)
    {
        super(parent.getMinecraftInstance(), 
        		
        		listWidth+2, parent.height, 
        		
        		parent.getGuiTop() + 44, parent.getGuiTop() + parent.height - 53, 
        		
        		parent.getGuiLeft() + 42, 
        		slotHeight, parent.width, parent.height);
        
        this.parent = parent;
        this.songs = songsIn;
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
        return (this.getSize()) * 35  + 1;
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
        
        font.drawString(version, this.left + 3 , top + 12, 0xCCCCCC);
    }
}
