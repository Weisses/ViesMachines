package com.vies.viesmachines.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class BlockGeneric extends Block {
	
	public BlockGeneric(String unlocalizedNameIn, Properties propertiesIn, SoundType soundTypeIn) 
	{
		super(propertiesIn);
		BlockHelper.setBlockName(this, unlocalizedNameIn);

		propertiesIn.harvestTool(ToolType.PICKAXE);
		propertiesIn.harvestLevel(1);
		propertiesIn.hardnessAndResistance(15.0F, 50.0F);
		propertiesIn.sound(soundTypeIn);
		
		//materialIn
		
		
		//materialIn.setHarvestLevel("pickaxe", 1);
		//this.setHardness(15.0F);
		//this.setResistance(50.0F);
		//this.setSoundType(soundTypeIn);
		
		
		//this.setCreativeTab(ViesMachines.tabBlocks);
		//this.setLightOpacity(255);
	}
	
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
