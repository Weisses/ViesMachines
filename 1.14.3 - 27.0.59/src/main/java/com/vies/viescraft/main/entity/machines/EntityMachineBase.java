package com.vies.viescraft.main.entity.machines;

import com.vies.viescraft.api.References;

import net.minecraft.entity.MobEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

public class EntityMachineBase extends MobEntity
//EntityLiving 
{
	
	// Attribute:
	//public static final IAttribute DEFENSE = (new RangedAttribute(null, "generic.defense", 4.0D, 0.0D, 1024.0D)).setShouldWatch(true);
	
	/** Shortcut to References. */
    protected static References rf;
    
	// Data Manager:
    /** Keeps track of a machine's energy value. */
	private static final DataParameter<Integer> ENERGY_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of a machine's durability value. */
	private static final DataParameter<Integer> DURABILITY_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	
	/** Keeps track of the frame tier value. */
	private static final DataParameter<Integer> TIER_FRAME_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of the engine tier value. */
	private static final DataParameter<Integer> TIER_ENGINE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of the component tier value. (Ground = Jump Height / Water = Max Oxygen / Flying = Max Altitude) */
	private static final DataParameter<Integer> TIER_COMPONENT_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
  	
	//** Keeps track of the type value. (Hovercraft, Submarine, Airship, etc.) */
	//private static final DataParameter<Integer> TYPE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of the forward speed value. */
	private static final DataParameter<Float> FORWARD_SPEED_DM = EntityDataManager.<Float>createKey(EntityMachineBase.class, DataSerializers.FLOAT);
	/** Keeps track of the turn speed value. */
	private static final DataParameter<Float> TURN_SPEED_DM = EntityDataManager.<Float>createKey(EntityMachineBase.class, DataSerializers.FLOAT);
	/** Keeps track of the broken toggle. */
	private static final DataParameter<Boolean> BROKEN_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
	/** Keeps track of the powered on toggle. */
	private static final DataParameter<Boolean> POWERED_ON_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
	/** Keeps track of the autorun toggle. */
	private static final DataParameter<Boolean> AUTORUN_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
	
	/** Keeps track of the armed toggle. */
	private static final DataParameter<Boolean> ARMED_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
	/** Keeps track of the ammo amount value. */
	private static final DataParameter<Integer> AMMO_AMOUNT_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of the ammo type value. */
	private static final DataParameter<Integer> AMMO_TYPE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);

	/** Keeps track of the selected record. */
	private static final DataParameter<Integer> SELECTED_RECORD_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of the learned record in slot 1. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_1_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	/** Keeps track of the learned record in slot 2. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_2_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	/** Keeps track of the learned record in slot 3. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_3_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	/** Keeps track of the learned record in slot 4. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_4_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	/** Keeps track of the learned record in slot 5. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_5_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	/** Keeps track of the learned record in slot 6. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_6_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	/** Keeps track of the learned record in slot 7. */
	private static final DataParameter<String> LEARNED_RECORD_SLOT_7_DM = EntityDataManager.<String>createKey(EntityMachineBase.class, DataSerializers.STRING);
	
	/** Keeps track of the primed for lightning strike in ticks. */
	private static final DataParameter<Integer> PRIMED_FOR_LIGHTNING_STRIKE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	/** Keeps track of the machine issue in ticks. */
	private static final DataParameter<Integer> MACHINE_ISSUE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	
	/** Keeps track of the current active machine Enhancement slot 1. */
	private static final DataParameter<Integer> MACHINE_ENHANCEMENT_1_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	
	
	
	/**
	 * Keeps track of the event to be triggered. <br> <br>
	 *
	 *  0 = No event to trigger.<br>
	 *  1 = Trigger fall sound/particles. <br>
	 *  2 = Trigger broken sound/particles. <br>
	 *  3 = Trigger destruction logic. <br>
	 *  4 = Trigger lightning strike sound/particles. <br><br>
	 *  
	 *  11 = Triggers 2 health heal sound/particles. <br>
	 *  12 = Triggers 8 health heal sound/particles. <br>
	 *  13 = Triggers MAX health heal sound/particles. <br><br>
	 *  
	 *  21 = Triggers 25 energy heal sound/particles. <br>
	 *  22 = Triggers 100 energy heal sound/particles. <br>
	 *  23 = Triggers MAX energy heal sound/particles. <br><br>
	 *  
	 *  31 = Triggers 50 durability heal sound/particles. <br>
	 *  32 = Triggers 200 durability heal sound/particles. <br>
	 *  33 = Triggers MAX durability heal sound/particles. <br><br>
	 *  
	 *  41 = Triggers tier 1 upgrade sound/particles. <br>
	 *  42 = Triggers tier 2 upgrade sound/particles. <br>
	 *  43 = Triggers tier 3 upgrade sound/particles. <br><br>
	 */
	private static final DataParameter<Integer> EVENT_TRIGGER_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
	
	
	
	/** Keeps track of the customName color value. */
    protected static final DataParameter<Integer> VISUAL_NAME_COLOR_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    
    /** Keeps track of what machine variant is active. (Spiked, etc) */
    protected static final DataParameter<Integer> VISUAL_MODEL_FRAME_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of what machine variant is active. (Single exhaust, Double exhaust, etc) */
    protected static final DataParameter<Integer> VISUAL_MODEL_ENGINE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of what machine variant is active. (Hindenburg, Dirigible, etc) */
    protected static final DataParameter<Integer> VISUAL_MODEL_COMPONENT_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    
    /** Keeps track of the frame texture. */
    protected static final DataParameter<Integer> VISUAL_FRAME_TEXTURE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the frame texture transparency. */
    protected static final DataParameter<Boolean> VISUAL_FRAME_TRANSPARENT_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
    /** Keeps track of the frame texture color. */
    protected static final DataParameter<Boolean> VISUAL_FRAME_COLOR_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
    /** Keeps track of the frame red color value. */
    protected static final DataParameter<Integer> VISUAL_FRAME_COLOR_RED_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the frame green color value. */
    protected static final DataParameter<Integer> VISUAL_FRAME_COLOR_GREEN_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the frame blue color value. */
    protected static final DataParameter<Integer> VISUAL_FRAME_COLOR_BLUE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    
    /** Keeps track of the display type. <br> <br>
	 *
	 *  0 = Renders Nothing. (Default) <br>
	 *  1 = Renders Block/Item. (Default) <br>
	 *  2 = Renders Head. (Default) <br>
	 *  3 = Renders Supporter Head. (Default) <br>
	 *  10 - 999 = Renders Symbols. (Default) <br>
	 *  1000+ = Renders Holiday Symbols. (Default) <br>
     * 
     * (Block, Item, Head, etc...) */
    protected static final DataParameter<Integer> VISUAL_ENGINE_DISPLAY_TYPE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the display itemstack id. */
    protected static final DataParameter<Integer> VISUAL_ENGINE_DISPLAY_ITEMSTACK_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the display itemstack metadata value. */
    protected static final DataParameter<Integer> VISUAL_ENGINE_DISPLAY_ITEMSTACK_META_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the display head value. */
    protected static final DataParameter<Integer> VISUAL_ENGINE_DISPLAY_HEAD_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the display supporter head value. */
    protected static final DataParameter<Integer> VISUAL_ENGINE_DISPLAY_SUPPORTER_HEAD_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the display holiday value. */
    protected static final DataParameter<Integer> VISUAL_ENGINE_DISPLAY_HOLIDAY_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the particle texture. */
    protected static final DataParameter<Integer> VISUAL_ENGINE_PARTICLE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    
    /** Keeps track of the component texture. */
    protected static final DataParameter<Integer> VISUAL_COMPONENT_TEXTURE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the component texture transparency. */
    protected static final DataParameter<Boolean> VISUAL_COMPONENT_TRANSPARENT_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
    /** Keeps track of the component texture color. */
    protected static final DataParameter<Boolean> VISUAL_COMPONENT_COLOR_DM = EntityDataManager.<Boolean>createKey(EntityMachineBase.class, DataSerializers.BOOLEAN);
    /** Keeps track of the component red color value. */
    protected static final DataParameter<Integer> VISUAL_COMPONENT_COLOR_RED_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the component green color value. */
    protected static final DataParameter<Integer> VISUAL_COMPONENT_COLOR_GREEN_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    /** Keeps track of the component blue color value. */
    protected static final DataParameter<Integer> VISUAL_COMPONENT_COLOR_BLUE_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    
    /** Keeps track of the preview part value. <br> <br>
	 *
	 *  0 = Render whole model. (Default) <br>
	 *  1 = Render Frame only. <br>
	 *  2 = Render Engine only. <br>
	 *  3 = Render Component only. <br>
	 */
    protected static final DataParameter<Integer> PREVIEW_PART_DM = EntityDataManager.<Integer>createKey(EntityMachineBase.class, DataSerializers.VARINT);
    
    //===============================================================
	
    // General:
	/** Stores the entity ID for passing into lightning strikes.  */
	public static int entityID;
	/** Has autorun been triggered? */
    public boolean autorunTrigger;
	/** Keeps count of the firing cooldown. */
	protected int weaponCooldown;
	//** Keeps count of the number of charges before a lightning strike happens. 20 charges equals 1 strike.*/
	//protected int primedForLightningStrike;
    
	// Status:
	/** Current machine status. */
	////public EntityMachineBase.Status status;
	/** Previous machine status. */
    ////protected EntityMachineBase.Status previousStatus;
    
    /** The living update tick. **/
    public long updateTick = 0;
    /** Used to signal a player when enough control is lost. */
    protected float outOfControlTicks;
    
    // Size:
    /** The width of this mob. XZ axis. **/
	public float setWidth;
    /** The height of this mob. Y axis. **/
	public float setHeight;
	
	// Movement:
    /** The left/right turn yaw. */
    protected float deltaRotation;
    /** Uses hitbox to check the water level. */
    protected double waterLevel;
    /** How much of current speed to retain. Value zero to one. */
	protected double momentum;
    /** How much the airship should glide given the slippery blocks it's currently gliding over.
     * Halved every tick. 
     * NOT USED YET THANKS TO TRAVEL() FRICTION!!! */
    private float machineGlide;
    /** Stores previous motion, mainly for momentum.
     * NOT USED YET */
    protected double lastYd;
    
    protected int fallDistancePosY;
	
    // Durability issues:
	protected boolean engineTrouble;
	protected boolean previouslyPoweredOn;
    
	// Inventory:
	/**
	 * SLOTS: <br> <br>
	 *
	 * Slot  0 = Fuel Slot<br>
	 * Slot  1 = Ammo Slot <br>
	 * Slot  2 = Block/Item to Display Slot <br>
	 //* Slot  1 = Upgrade Core <br>
	 //* Slot  2 = Upgrade Frame <br>
	 //* Slot  3 = Upgrade Engine <br>
	 //* Slot  4 = Upgrade Balloon <br>
	 //* Slot 11 = Module Slot1 <br>
	 //* Slot 12 = Module Slot2 <br>
	 //* Slot 16 = Redstone Slot <br>
	 //* Slot 18 = Block/Item to Display <br>
	 * Slot 20-28 = Inventory Small <br>
	 * Slot 20-37 = Inventory Large <br>
	 //* Slot 51 = Bomb Slot1 <br>
	 */
    public ItemStackHandler inventory;
    /** The amount of slots the machine has for storage. */
    protected int size = 64;
    
    // Movement:
    protected boolean leftInputDown;
    protected boolean rightInputDown;
    protected boolean forwardInputDown;
    protected boolean backInputDown;
    protected boolean upInputDown;
    protected boolean downInputDown;
    protected boolean openGuiMenuInputDown;
    protected boolean shootProjectileInputDown;
    protected boolean toggleAbilityInputDown;
    
    // Radio:
    //public ArrayList<ResourceLocation> currentMusicListRecord = new ArrayList<ResourceLocation>();
	
    
    //** Stores the selected song using the int position of the musicListRecord array. */
    //public int selectedSong;
    

    //public float controllingPassengerPitch;
    //public float controllingPassengerYaw;
	
    // To debug and fix...
	private BlockPos homePosition = BlockPos.ZERO;//.ORIGIN;
    /** If -1 there is no maximum distance. */
    private float maximumHomeDistance = -1.0F;
    
    
	
	//==================================================
    // TODO             Constructor
	//==================================================
    
	public EntityMachineBase(World worldIn) 
	{
		super(null //MAY BE WRONG
				
				, worldIn);
		
		// This is a metal machine after all:
		this.isImmuneToFire();//.isImmuneToFire = true;
		this.ignoreFrustumCheck = true;
        this.preventEntitySpawning = true;
        
        // Sets up the inventory:
        this.inventory = new ItemStackHandler(size);
	}

	public EntityMachineBase(World worldIn, double x, double y, double z,
			
			int frameTierIn, int engineTierIn, int componentTierIn, int typeIn, 
			float healthIn, int energyIn, int durabilityIn, 
			boolean brokenIn, int currentFuelIn, int totalFuelIn, 
			int ammoAmountIn, int ammoTypeIn, 
			int machineEnhancement1In, 
			
			int visualModelFrameIn, int visualModelEngineIn, int visualModelComponentIn, 
			
			int visualFrameTextureIn, 
			boolean visualFrameTransparentIn, boolean visualFrameColorIn, 
			int visualFrameColorRedIn, 
			int visualFrameColorGreenIn, 
			int visualFrameColorBlueIn, 
			
			int visualEngineParticleIn, 
			int visualEngineDisplayTypeIn, 
			int visualEngineDisplayItemstackIn, 
			int visualEngineDisplayItemstackMetaIn, 
			int visualEngineDisplayHeadIn, 
			int visualEngineDisplaySupporterHeadIn, 
			int visualEngineDisplayHolidayIn, 
			
			int visualComponentTextureIn, 
			boolean visualComponentTransparentIn, boolean visualComponentColorIn, 
			int visualComponentColorRedIn, 
			int visualComponentColorGreenIn, 
			int visualComponentColorBlueIn, 
			
    		CompoundNBT
			//NBTTagCompound
    		compoundIn, String customNameIn, int customNameColorIn)
	{
		this(worldIn);
        this.setPosition(x, y, z);
        
        //this.motionX = 0.0D;
        //this.motionY = 0.0D;
        //this.motionZ = 0.0D;
        //this.prevPosX = x;
        //this.prevPosY = y;
        //this.prevPosZ = z;
	}
	
	
	
}
