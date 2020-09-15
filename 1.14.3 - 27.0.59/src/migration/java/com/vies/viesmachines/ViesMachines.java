package com.vies.viesmachines;

import com.vies.viesmachines.api.BlocksVM;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("viesmachines")
public class ViesMachines
{

    //public static ViesMachines instance;
    //public static final String modid = "viesmachines";
    
    
    // Directly reference a log4j logger.
    //private static final Logger LOGGER = LogManager.getLogger(modid);
    
    // Main mod constructor backbone.
    public ViesMachines() 
    {
    	//instance = this;
    	
        // Register the setup method for modloading.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading.
        ////FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading.
        ////FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        // Register ourselves for server and other game events we are interested in.
        //MinecraftForge.EVENT_BUS.register(this);
    }

    // This use to be the pre-init.
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        ///LOGGER.info("HELLO FROM PREINIT");
        //LOGGER.info("TESTVC DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
		
		//LOGGER.info("<<==============================>>");
		//LOGGER.info("   Enforcing Brannigan's Law...   ");
		//LOGGER.info("<<==============================>>");
    }

    // Client side only things like models.
    private void clientRegistries(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        //LOGGER.info("TESTVC Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
        
        
    }

    /*
    // Inter Mod Communication
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    
    
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        ////LOGGER.info("HELLO from server starting");
    }
*/
    
    
    
    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(BlocksVM.XEGONITE_BASIC);
        }
        
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BlockItem(BlocksVM.XEGONITE_BASIC, new Item.Properties()).setRegistryName("test block"));
        }
    }
    
    
}
