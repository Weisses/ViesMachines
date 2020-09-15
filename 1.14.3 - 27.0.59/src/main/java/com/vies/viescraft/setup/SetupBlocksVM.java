package com.vies.viescraft.setup;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.vies.viescraft.ViesCraft;
import com.vies.viescraft.api.References;
import com.vies.viescraft.main.blocks.BlockGeneric;
import com.vies.viescraft.main.blocks.tileentity.BlockExtractor;
import com.vies.viescraft.main.tileentity.TileEntityExtractor;
import com.vies.viescraft.main.tileentity.containers.ExtractorContainer;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

public class SetupBlocksVM {
	
	private static Properties propertiesRock = Properties.create(Material.ROCK);
	private static Properties propertiesIron = Properties.create(Material.IRON);
	
	public static final Set<Block> BLOCKS = new HashSet<>();
	public static final Set<Item> BLOCK_ITEMS = new HashSet<>();
	
	
	
	public static Block XEGONITE_BLOCK = new BlockGeneric("xegonite_block", propertiesRock, SoundType.STONE, 2.0F, 15.0F, 0, ToolType.PICKAXE, 0, ViesCraft.setup.itemGroupBlocks, "vc.block");
	
	@ObjectHolder(References.MOD_ID + ":" + "extractor_block")
	public static Block EXTRACTOR_BLOCK = new BlockExtractor("extractor_block", propertiesIron, SoundType.ANVIL, 2.0F, 15.0F, 0, ToolType.PICKAXE, 0, ViesCraft.setup.itemGroupBlocks, "vc.block");
	
	
	//==================================================
    // TODO             Appliances
	//==================================================
    
	@ObjectHolder(References.MOD_ID + ":" + "extractor_block")
	public static TileEntityType<TileEntityExtractor> EXTRACTOR;// = _null(); // = new BlockExtractor("appliance/extractor", propertiesIron, SoundType.ANVIL, 2.0F, 15.0F, 0, ToolType.PICKAXE, 0, ViesCraft.setup.itemGroupBlocks, "vc.block");
	//public static final Block KIT_FABRICATOR = new BlockKitFabricator("appliance/kit_fabricator", Material.GLASS, SoundType.STONE);
	//public static final Block MACHINE_TRANSMOGRIFIER = new BlockMachineTransmogrifier("appliance/machine_transmogrifier", Material.GLASS, SoundType.STONE);
	//public static final Block MACHINE_BEACON = new BlockMachineBeacon("appliance/machine_beacon", Material.GLASS, SoundType.STONE);
	
	
	@ObjectHolder(References.MOD_ID + ":" + "extractor_block")
	public static ContainerType<ExtractorContainer> EXTRACTOR_CONTAINER;
	
	//@Nonnull
	// Get rid of "Returning null from Nonnull method" warnings
	//@SuppressWarnings("ConstantConditions")
	//public static <T> T _null() {
	//	return null;
	//}
/*
	public static final Block XEGONITE_BASIC = new BlockGeneric("block_xegonite_basic", Material.ROCK, SoundType.STONE);
	public static final Block XEGONITE_STAIRS = new BlockStairsVM("block_xegonite_stairs", Material.ROCK, SoundType.STONE, XEGONITE_BASIC);
	public static final Block XEGONITE_FENCE = new BlockFenceVM("block_xegonite_fence", Material.ROCK, SoundType.STONE);
	public static final Block XEGONITE_GATE = new BlockGateVM("block_xegonite_gate", Material.ROCK, SoundType.STONE);
	public static final Block XEGONITE_WALL = new BlockWallVM("block_xegonite_wall", Material.ROCK, SoundType.STONE, XEGONITE_BASIC);
	public static final Block XEGONITE_TORCH = new BlockTorchVM("block_xegonite_torch", Material.ROCK, SoundType.STONE);
	public static final Block XEGONITE_LADDER = new BlockLadderVM("block_xegonite_ladder", Material.ROCK, SoundType.STONE);
	public static final Block XEGONITE_PILLAR = new BlockPillarVM("block_xegonite_pillar", Material.ROCK, SoundType.STONE);
	public static final Block XEGONITE_CHISELED = new BlockGeneric("block_xegonite_chiseled", Material.ROCK, SoundType.STONE);
	
	public static final Block WATER_BASIC = new BlockGeneric("block_water_basic", Material.ROCK, SoundType.STONE);
	public static final Block WATER_STAIRS = new BlockStairsVM("block_water_stairs", Material.ROCK, SoundType.STONE, WATER_BASIC);
	public static final Block WATER_FENCE = new BlockFenceVM("block_water_fence", Material.ROCK, SoundType.STONE);
	public static final Block WATER_GATE = new BlockGateVM("block_water_gate", Material.ROCK, SoundType.STONE);
	public static final Block WATER_WALL = new BlockWallVM("block_water_wall", Material.ROCK, SoundType.STONE, WATER_BASIC);
	public static final Block WATER_TORCH = new BlockTorchVM("block_water_torch", Material.ROCK, SoundType.STONE);
	public static final Block WATER_LADDER = new BlockLadderVM("block_water_ladder", Material.ROCK, SoundType.STONE);
	public static final Block WATER_PILLAR = new BlockPillarVM("block_water_pillar", Material.ROCK, SoundType.STONE);
	public static final Block WATER_CHISELED = new BlockGeneric("block_water_chiseled", Material.ROCK, SoundType.STONE);
	
	public static final Block LAVA_BASIC = new BlockGeneric("block_lava_basic", Material.ROCK, SoundType.STONE);
	public static final Block LAVA_STAIRS = new BlockStairsVM("block_lava_stairs", Material.ROCK, SoundType.STONE, LAVA_BASIC);
	public static final Block LAVA_FENCE = new BlockFenceVM("block_lava_fence", Material.ROCK, SoundType.STONE);
	public static final Block LAVA_GATE = new BlockGateVM("block_lava_gate", Material.ROCK, SoundType.STONE);
	public static final Block LAVA_WALL = new BlockWallVM("block_lava_wall", Material.ROCK, SoundType.STONE, LAVA_BASIC);
	public static final Block LAVA_TORCH = new BlockTorchVM("block_lava_torch", Material.ROCK, SoundType.STONE);
	public static final Block LAVA_LADDER = new BlockLadderVM("block_lava_ladder", Material.ROCK, SoundType.STONE);
	public static final Block LAVA_PILLAR = new BlockPillarVM("block_lava_pillar", Material.ROCK, SoundType.STONE);
	public static final Block LAVA_CHISELED = new BlockGeneric("block_lava_chiseled", Material.ROCK, SoundType.STONE);
	
	public static final Block ENDER_BASIC = new BlockGeneric("block_ender_basic", Material.ROCK, SoundType.STONE);
	public static final Block ENDER_STAIRS = new BlockStairsVM("block_ender_stairs", Material.ROCK, SoundType.STONE, ENDER_BASIC);
	public static final Block ENDER_FENCE = new BlockFenceVM("block_ender_fence", Material.ROCK, SoundType.STONE);
	public static final Block ENDER_GATE = new BlockGateVM("block_ender_gate", Material.ROCK, SoundType.STONE);
	public static final Block ENDER_WALL = new BlockWallVM("block_ender_wall", Material.ROCK, SoundType.STONE, ENDER_BASIC);
	public static final Block ENDER_TORCH = new BlockTorchVM("block_ender_torch", Material.ROCK, SoundType.STONE);
	public static final Block ENDER_LADDER = new BlockLadderVM("block_ender_ladder", Material.ROCK, SoundType.STONE);
	public static final Block ENDER_PILLAR = new BlockPillarVM("block_ender_pillar", Material.ROCK, SoundType.STONE);
	public static final Block ENDER_CHISELED = new BlockGeneric("block_ender_chiseled", Material.ROCK, SoundType.STONE);
	
	
	
	//==================================================
    // TODO             Appliances
	//==================================================
    
	public static final Block EXTRACTOR = new BlockExtractor("appliance/extractor", Material.GLASS, SoundType.STONE);
	public static final Block KIT_FABRICATOR = new BlockKitFabricator("appliance/kit_fabricator", Material.GLASS, SoundType.STONE);
	public static final Block MACHINE_TRANSMOGRIFIER = new BlockMachineTransmogrifier("appliance/machine_transmogrifier", Material.GLASS, SoundType.STONE);
	public static final Block MACHINE_BEACON = new BlockMachineBeacon("appliance/machine_beacon", Material.GLASS, SoundType.STONE);
	
	
	
	//==================================================
    // TODO             Decorations
	//==================================================
    
	public static final Block ITEM_DISPLAY = new BlockGeneric("decoration/item_display", Material.ROCK, SoundType.STONE);
	
	
	
	//--------------------------------------------------
	*/
	// Unused:
	//public static Block onyxius_ore;
	//public static Block carnelian_ore;
	//public static Block velium_ore;
	//public static Block amplimet_ore;
	//public static Block enstatite_ore;
	//public static Block velium_ore;
	//public static Block infernus_ore;
	//public static Block norn_stone;
	//public static Block mystalite_ore;
	
	/////public static Block airship_workbench;
	/////public static Block battery_charger;
	
	//public static final BlockDoubleSlabVM XEGONITE_SLAB_DOUBLE = new BlockDoubleSlabVM("block_xegonite_slab_double", Material.ROCK, SoundType.STONE);
	//public static final BlockHalfSlabVM XEGONITE_SLAB_HALF = new BlockHalfSlabVM("block_xegonite_slab_half", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_BRICK = new BlockGeneric("block_xegonite_brick", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_CHISELED = new BlockGeneric("block_xegonite_chiseled", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_BARS = new BlockGeneric("block_xegonite_bars", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_ROAD = new BlockGeneric("block_xegonite_road", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_TRAPDOOR = new BlockGeneric("block_xegonite_trapdoor", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_DOOR = new BlockGeneric("block_xegonite_door", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_GLASS = new BlockGeneric("block_xegonite_glass", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_GLASS_PANE = new BlockGeneric("block_xegonite_glass_pane", Material.ROCK, SoundType.STONE);
	//public static final BlockGeneric XEGONITE_CRAFTING_TABLE = new BlockGeneric("block_xegonite_crafting_table", Material.ROCK, SoundType.STONE);

	
	
	/**
	 * Registers all Blocks.
	 */
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		final IForgeRegistry<Block> registry = event.getRegistry();
		
		final Block[] general = {
				XEGONITE_BLOCK,
		};
		
		final Block[] appliances = {
				EXTRACTOR_BLOCK,
		};
		
		final Block[] decorations = {
				//XEGONITE_BLOCK,
		};
		
		//--------------------------------

		for (final Block block : general) 
		{
			registry.register(block);
			BLOCKS.add(block);
		}
		
		for (final Block block : appliances) 
		{
			registry.register(block);
			BLOCKS.add(block);
		}
		
		for (final Block block : decorations) 
		{
			registry.register(block);
			BLOCKS.add(block);
		}
	}
	
	/**
	 * Registers all BlockItems associated with Blocks.
	 */
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		Item.Properties properties = new Item.Properties().group(ViesCraft.setup.itemGroupBlocks);
    	
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		final BlockItem[] general = {
				new BlockItem(XEGONITE_BLOCK, properties),
		};
		
		final BlockItem[] appliances = {
				new BlockItem(EXTRACTOR_BLOCK, properties),
		};
		
		final BlockItem[] decorations = {
				//new BlockItem(XEGONITE_BLOCK, properties),
		};
		
		//--------------------------------
		
		for (final BlockItem item : general) 
		{
			final Block block = item.getBlock();
			final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
			registry.register(item.setRegistryName(registryName));
			BLOCK_ITEMS.add(item);
		}
		
		for (final BlockItem item : appliances) 
		{
			final Block block = item.getBlock();
			final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
			registry.register(item.setRegistryName(registryName));
			BLOCK_ITEMS.add(item);
		}
		
		for (final BlockItem item : decorations) 
		{
			final Block block = item.getBlock();
			final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
			registry.register(item.setRegistryName(registryName));
			BLOCK_ITEMS.add(item);
		}
	}
	
	/**
	 * Registers all Tile Entites associated with Blocks.
	 */
	public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event)
	{
		final IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();
		
		registry.register(TileEntityType.Builder.create(TileEntityExtractor::new, SetupBlocksVM.EXTRACTOR_BLOCK).build(null)
				.setRegistryName(References.MOD_ID, "extractor_block")
				);
		
		
		
	}
}
