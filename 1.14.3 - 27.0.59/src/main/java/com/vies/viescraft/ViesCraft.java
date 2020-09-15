package com.vies.viescraft;

import com.vies.viescraft.api.References;
import com.vies.viescraft.api.utils.LogHelper;
import com.vies.viescraft.main.tileentity.containers.ExtractorContainer;
import com.vies.viescraft.proxy.ClientProxy;
import com.vies.viescraft.proxy.IProxy;
import com.vies.viescraft.proxy.ServerProxy;
import com.vies.viescraft.setup.ModSetup;
import com.vies.viescraft.setup.SetupBlocksVM;
import com.vies.viescraft.setup.SetupItemsVM;

import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(References.MOD_ID)
public class ViesCraft
{
	// This will run code depending on the side you are on. Uses a double lambda for each to make sure we are actually in the right side.
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

	public static ModSetup setup = new ModSetup();
	
    // Main mod constructor backbone.
    public ViesCraft() 
    {
    	//instance = this;
    	
        // Register the setup method for modloading.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        // Register the enqueueIMC method for modloading.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        
        // Register the processIMC method for modloading.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        
        // Register the doClientStuff method for modloading.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        // Register ourselves for server and other game events we are interested in.
        MinecraftForge.EVENT_BUS.register(this);
    }

    // This use to be the pre-init.
    private void setup(final FMLCommonSetupEvent event)
    {
    	setup.init();
    	proxy.init();
    	
    	// Creative.
    	
    	
        // some preinit code
        ///LOGGER.info("HELLO FROM PREINIT");
        //LOGGER.info("TESTVC DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
		
    	LogHelper.info("<<==============================>>");
    	LogHelper.info("   Enforcing Brannigan's Law...   ");
    	LogHelper.info("<<==============================>>");
    }

    // Client side only things like models.
    private void clientRegistries(final FMLClientSetupEvent event) 
    {
        // do something that can only be done on the client
        //LOGGER.info("TESTVC Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
        
        
    }

    // Inter Mod Communication
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        //InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        //LOGGER.info("Got IMC {}", event.getIMCStream().
        //        map(m->m.getMessageSupplier().get()).
        //        collect(Collectors.toList()));
    }
    
    
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
        // do something when the server starts
        ////LOGGER.info("HELLO from server starting");
    }
    
    //--------//--------//--------//--------//--------//--------//--------//--------//
    
    // You can use EventBusSubscriber to automatically subscribe events on the contained class.
    // This is subscribing to the MOD Event bus for receiving Registry Events.
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents 
    {
    	@SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) 
        {
            SetupBlocksVM.registerBlocks(event);
        }
        
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) 
        {
        	SetupBlocksVM.registerBlockItems(event);
            
        	SetupItemsVM.registerItems(event);
        }
        
        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) 
        {
        	SetupBlocksVM.registerTileEntities(event);
        	
        	//event.getRegistry().register(TileEntityType.Builder.create(TileEntityExtractor::new, SetupBlocksVM.EXTRACTOR_BLOCK).build(null).setRegistryName(References.MOD_ID, "extractor_block"));
        }
        
        @SubscribeEvent
        public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) 
        {
        	event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
        		BlockPos pos = data.readBlockPos();
        		return new ExtractorContainer(windowId, ViesCraft.proxy.getClientWorld(), pos, inv, ViesCraft.proxy.getClientPlayer());
        	}).setRegistryName("extractor_block"));
        }
        
        
    }
}
