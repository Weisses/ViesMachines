package com.vies.viesmachines.network;

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
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplayHeadPg1;
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplaySupporterHeadPg1;
import com.vies.viesmachines.client.gui.machines.visual.display.GuiMachineMenuCustomizeDisplaySymbolPg1;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1Holiday4thofJuly;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayChristmas;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayEaster;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayHalloween;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayNewYears;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayThanksgiving;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeDisplaySymbolPg1HolidayValentinesDay;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHoliday4thofJuly;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayChristmas;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayEaster;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayHalloween;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayNewYears;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayThanksgiving;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizePrimarySkinTextureHolidayValentinesDay;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHoliday4thofJuly;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayChristmas;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayEaster;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayHalloween;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayNewYears;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayThanksgiving;
import com.vies.viesmachines.client.gui.machines.visual.holiday.GuiMachineMenuCustomizeSecondarySkinTextureHolidayValentinesDay;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityExtractor;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityKitFabricator;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityMachineBeacon;
import com.vies.viesmachines.client.gui.tileentity.GuiTileEntityMachineTransmogrifier;
import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineMenuCustomizeDisplayBanner;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineMenuMain;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineMenuMainSelectProjectile;
import com.vies.viesmachines.common.entity.machines.containers.ContainerMachineNoSlots;
import com.vies.viesmachines.common.tileentity.TileEntityExtractor;
import com.vies.viesmachines.common.tileentity.TileEntityKitFabricator;
import com.vies.viesmachines.common.tileentity.TileEntityMachineBeacon;
import com.vies.viesmachines.common.tileentity.TileEntityMachineTransmogrifier;
import com.vies.viesmachines.common.tileentity.containers.ContainerExtractor;
import com.vies.viesmachines.common.tileentity.containers.ContainerKitFabricator;
import com.vies.viesmachines.common.tileentity.containers.ContainerMachineBeacon;
import com.vies.viesmachines.common.tileentity.containers.ContainerMachineTransmogrifier;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static GuiHandler instance;
	
	public static final int GUI_MACHINE_MENU_MAIN = 11;
	public static final int GUI_MACHINE_MENU_MAIN_SELECT_MUSIC = 12;
	public static final int GUI_MACHINE_MENU_MAIN_CHANGE_NAME = 14;
	public static final int GUI_MACHINE_MENU_MAIN_SELECT_PROJECTILE = 15;
	
	public static final int GUI_MACHINE_MENU_STATS = 13;
	
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
	

	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_NEWYEARS = 101;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_VALENTINESDAY = 102;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_EASTER = 103;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_4THOFJULY = 104;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_HALLOWEEN = 105;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_THANKSGIVING = 106;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_CHRISTMAS = 107;
	
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_NEWYEARS = 111;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_VALENTINESDAY = 112;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_EASTER = 113;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_4THOFJULY = 114;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_HALLOWEEN = 115;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_THANKSGIVING = 116;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_CHRISTMAS = 117;
	
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_NEWYEARS = 121;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_VALENTINESDAY = 122;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_EASTER = 123;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_4THOFJULY = 124;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_HALLOWEEN = 125;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_THANKSGIVING = 126;
	public static final int GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_CHRISTMAS = 127;
	
	
	public static final int GUI_APPLIANCE_EXTRACTOR= 32;
	public static final int GUI_APPLIANCE_KIT_FABRICATOR= 33;
	public static final int GUI_APPLIANCE_MACHINE_TRANSMOGRIFIER= 34;
	public static final int GUI_APPLIANCE_MACHINE_BEACON= 35;
	
	
	
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
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_NEWYEARS
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_VALENTINESDAY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_EASTER
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_4THOFJULY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_HALLOWEEN
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_THANKSGIVING
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_CHRISTMAS)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_NEWYEARS
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_VALENTINESDAY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_EASTER
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_4THOFJULY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_HALLOWEEN
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_THANKSGIVING
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_CHRISTMAS)
		{
			return new ContainerMachineNoSlots(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_NEWYEARS
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_VALENTINESDAY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_EASTER
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_4THOFJULY
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_HALLOWEEN
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_THANKSGIVING
		|| ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_CHRISTMAS)
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
			return new GuiMachineMenuCustomizeDisplayHeadPg1(player.inventory, (EntityMachineBase)player.getRidingEntity());
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
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_NEWYEARS)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayNewYears(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_VALENTINESDAY)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayValentinesDay(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_EASTER)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayEaster(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_4THOFJULY)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1Holiday4thofJuly(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_HALLOWEEN)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayHalloween(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_THANKSGIVING)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayThanksgiving(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SYMBOL_PG1_HOLIDAY_CHRISTMAS)
		{
			return new GuiMachineMenuCustomizeDisplaySymbolPg1HolidayChristmas(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_NEWYEARS)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayNewYears(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_VALENTINESDAY)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayValentinesDay(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_EASTER)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayEaster(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_4THOFJULY)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHoliday4thofJuly(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_HALLOWEEN)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayHalloween(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_THANKSGIVING)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayThanksgiving(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_PRIMARY_SKIN_TEXTURE_HOLIDAY_CHRISTMAS)
		{
			return new GuiMachineMenuCustomizePrimarySkinTextureHolidayChristmas(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_NEWYEARS)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayNewYears(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_VALENTINESDAY)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayValentinesDay(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_EASTER)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayEaster(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_4THOFJULY)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHoliday4thofJuly(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_HALLOWEEN)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayHalloween(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_THANKSGIVING)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayThanksgiving(player.inventory, (EntityMachineBase)player.getRidingEntity());
		}
		// Machine container:
		if (ID == GUI_MACHINE_MENU_CUSTOMIZE_SECONDARY_SKIN_TEXTURE_HOLIDAY_CHRISTMAS)
		{
			return new GuiMachineMenuCustomizeSecondarySkinTextureHolidayChristmas(player.inventory, (EntityMachineBase)player.getRidingEntity());
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
		
		return null;
	}
}
