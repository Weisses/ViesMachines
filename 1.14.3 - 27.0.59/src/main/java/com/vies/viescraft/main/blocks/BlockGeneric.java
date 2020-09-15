package com.vies.viescraft.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class BlockGeneric extends Block {

	private String procName;
	
	public BlockGeneric(String registrynameIn, Properties propertiesIn, SoundType soundtypeIn, float hardnessIn, float resistanceIn, int lightvalueIn, ToolType harvesttoolIn, int harvestlevelIn, ItemGroup itemgroupIn, String procnameIn) 
	{
		super(propertiesIn
				.sound(soundtypeIn)
				.hardnessAndResistance(hardnessIn, resistanceIn)
				.lightValue(lightvalueIn)
				.harvestTool(harvesttoolIn)
				.harvestLevel(harvestlevelIn)
				);
		
		this.setRegistryName(registrynameIn);
		
		this.procName = procnameIn;
	}
	
    /** Return the name for this gem proc. */
	public String getGemProcName()
    {
        return this.procName.toString();
    }
	
	
	
	//================================================================
	
	
	
	
	
	
	//@Override
	////public static boolean isOpaque(VoxelShape shape) 
	//{
	//      return false;
	//}
	
	/*
    public boolean isOpaqueCube(IBlockState state)
    {
    	return false;
    }
	
	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	/*
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
		
    }
	
	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn)
    {
		
    }

	@Override
	public Vec3d modifyAcceleration(World worldIn, BlockPos pos, Entity entityIn, Vec3d motion)
    {
        return motion;
    }
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
		
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 1.0F);
    }
	
	@Override
	public void fillWithRain(World worldIn, BlockPos pos)
    {
		
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced)
    {
		
    }
	*/
}
