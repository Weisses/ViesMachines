package com.vies.viesmachines.network;

import com.vies.viesmachines.api.ItemsVM;
import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMain;
import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMainSelectMusic;
import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMainSelectName;
import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMainSelectProjectile;
import com.vies.viesmachines.client.gui.machines.stats.GuiMachineMenuStats;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomize;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomizeActiveModels;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomizeDisplayBanner;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomizePrimarySkinColor;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomizePrimarySkinTexture;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomizeSecondarySkinColor;
import com.vies.viesmachines.client.gui.machines.visual.GuiMachineMenuCustomizeSecondarySkinTexture;
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplayBlockItemPg1;
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplayEntityHeadPg1;
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplaySupporterHeadPg1;
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplaySymbolPg1;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1Holiday;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayCreative;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHoliday;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayCreative;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHoliday;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayCreative;
import com.vies.viesmachines.client.gui.misc.GuiRadioExpansionSelectMusic;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityExtractor;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityKitFabricator;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityMachineBeacon;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityMachineTransmogrifier;
import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineMenuCustomizeDisplayBanner;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineMenuMain;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineMenuMainSelectProjectile;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineNoSlots;
import com.vies.viesmachines.common.items.tools.ContainerToolNoSlots;
import com.vies.viesmachines.common.tileentity.TileEntityExtractor;
import com.vies.viesmachines.common.tileentity.TileEntityKitFabricator;
import com.vies.viesmachines.common.tileentity.TileEntityMachineBeacon;
import com.vies.viesmachines.common.tileentity.TileEntityMachineTransmogrifier;
import com.vies.viesmachines.common.tileentity.containers.ContainerExtractor;
import com.vies.viesmachines.common.tileentity.containers.ContainerKitFabricator;
import com.vies.viesmachines.common.tileentity.containers.ContainerMachineBeacon;
import com.vies.viesmachines.common.tileentity.containers.ContainerMachineTransmogrifier;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static GuiHandler instance;
	
	public static final int GUI_MACHINE_MENU_MAIN = 11;
	public static final int GUI_MACHINE_MENU_MAIN_SELECT_MUSIC = 12;
	public static final int GUI_MACHINE_MENU_MAIN_CHANGE_NAME = 13;
	public static final int GUI_MACHINE_MENU_MAIN_SELECT_PROJECTILE = 14;
	
	public static final int GUI_MACHINE_MENU_STATS = 15;
	
	public static final int GUI_MACHINE_MENU_CUSTOMIZE = 16;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_ACTIVE_MODELS = 17;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_BANNER = 18;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE = 19;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_COLOR = 20;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE = 21;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_COLOR = 22;
	
	
	
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1 = 23;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_BLOCKITEM_PG1 = 24;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_HEAD_PG1 = 25;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SUPPORTERHEAD_PG1 = 26;
	

	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY = 27;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_CREATIVE = 28;
	
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY = 29;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_CREATIVE = 30;
	
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY = 31;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_CREATIVE = 32;
	
	
	public static final int GUI_APPLIANCE_EXTRACTOR= 33;
	public static final int GUI_APPLIANCE_KIT_FABRICATOR= 34;
	public static final int GUI_APPLIANCE_MACHINE_TRANSMOGRIFIER= 35;
	public static final int GUI_APPLIANCE_MACHINE_BEACON= 36;
	
	public static final int GUI_TOOL_RADIO_EXPANSION = 37;
	
	public GuiHandler() 
	{
    	instance = this;
    }
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		// Machine container:
		if (ID == GUI_MACHINE_MENU_MAIN)
		{
			return new ContainerMachineMenuMain(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container with no slots:
		if (ID == GUI_MACHINE_MENU_MAIN_SELECT_MUSIC)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container with no slots:
		if (ID == GUI_MACHINE_MENU_MAIN_CHANGE_NAME)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container with no slots:
		if (ID == GUI_MACHINE_MENU_MAIN_SELECT_PROJECTILE)
		{
			return new ContainerMachineMenuMainSelectProjectile(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_STATS)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_ACTIVE_MODELS)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_BANNER)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_BLOCKITEM_PG1)
		{
			return new ContainerMachineMenuCustomizeDisplayBanner(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_HEAD_PG1)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SUPPORTERHEAD_PG1)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_COLOR)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_COLOR)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		

		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_CREATIVE)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_CREATIVE)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_CREATIVE)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		
		// Extractor Container
		if (ID == GUI_APPLIANCE_EXTRACTOR)
		{
			return new ContainerExtractor(player.inventory, world, (TileEntityExtractor)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		// Kit Fabricator Container
		if (ID == GUI_APPLIANCE_KIT_FABRICATOR)
		{
			return new ContainerKitFabricator(player.inventory, world, (TileEntityKitFabricator)world.getTileEntity(new BlockPos(x, y, z)));
		}
		

		
		// Kit Fabricator Container
		if (ID == GUI_TOOL_RADIO_EXPANSION)
		{
			return new ContainerToolNoSlots(player.inventory);
		}
		
		
		
		// Machine Transmogrifier Container
		if (ID == GUI_APPLIANCE_MACHINE_TRANSMOGRIFIER)
		{
			return new ContainerMachineTransmogrifier(player.inventory, world, (TileEntityMachineTransmogrifier)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		// Machine Beacon Container
		if (ID == GUI_APPLIANCE_MACHINE_BEACON)
		{
			return new ContainerMachineBeacon(player.inventory, world, (TileEntityMachineBeacon)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		// Machine gui for the main menu:
		if (ID == GUI_MACHINE_MENU_MAIN)
		{
			return new GuiMachineMenuMain(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for selecting music:
		if (ID == GUI_MACHINE_MENU_MAIN_SELECT_MUSIC)
		{
			return new GuiMachineMenuMainSelectMusic(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for selecting names:
		if (ID == GUI_MACHINE_MENU_MAIN_CHANGE_NAME)
		{
			return new GuiMachineMenuMainSelectName(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for selecting projectiles:
		if (ID == GUI_MACHINE_MENU_MAIN_SELECT_PROJECTILE)
		{
			return new GuiMachineMenuMainSelectProjectile(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine gui for the stats menu:
		if (ID == GUI_MACHINE_MENU_STATS)
		{
			return new GuiMachineMenuStats(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE)
		{
			return new GuiMachineMenuCustomize(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_ACTIVE_MODELS)
		{
			return new GuiMachineMenuCustomizeActiveModels(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_BANNER)
		{
			return new GuiMachineMenuCustomizeDisplayBanner(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_BLOCKITEM_PG1)
		{
			return new GuiMachineMenuCustomizeDisplayBlockItemPg1(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_HEAD_PG1)
		{
			return new GuiMachineMenuCustomizeDisplayEntityHeadPg1(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SUPPORTERHEAD_PG1)
		{
			return new GuiMachineMenuCustomizeDisplaySupporterHeadPg1(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		

		
		
		
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE)
		{
			return new GuiMachineMenuCustomizePrimarySkinTexture(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_COLOR)
		{
			return new GuiMachineMenuCustomizePrimarySkinColor(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTexture(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine gui for the customize menu:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_COLOR)
		{
			return new GuiMachineMenuCustomizeSecondarySkinColor(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		

		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1Holiday(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_CREATIVE)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayCreative(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHoliday(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_CREATIVE)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayCreative(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHoliday(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_CREATIVE)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayCreative(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		
		// Extractor GUI
		if (ID == GUI_APPLIANCE_EXTRACTOR)
		{
			return new GuiTileEntityExtractor(player.inventory, world, (TileEntityExtractor)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		// Kit Fabricator GUI
		if (ID == GUI_APPLIANCE_KIT_FABRICATOR)
		{
			return new GuiTileEntityKitFabricator(player.inventory, world, (TileEntityKitFabricator)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		// Kit Fabricator GUI
		if (ID == GUI_APPLIANCE_MACHINE_TRANSMOGRIFIER)
		{
			return new GuiTileEntityMachineTransmogrifier(player.inventory, world, (TileEntityMachineTransmogrifier)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		// Kit Fabricator GUI
		if (ID == GUI_APPLIANCE_MACHINE_BEACON)
		{
			return new GuiTileEntityMachineBeacon(player.inventory, world, (TileEntityMachineBeacon)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		
		// Kit Fabricator Container
		if (ID == GUI_TOOL_RADIO_EXPANSION)
		{
			return new GuiRadioExpansionSelectMusic(player, new ItemStack(ItemsVM.TOOL_RADIO_EXPANSION));
		}
		
		return null;
	}
}
