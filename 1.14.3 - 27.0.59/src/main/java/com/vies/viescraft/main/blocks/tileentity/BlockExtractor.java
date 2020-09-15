package com.vies.viescraft.main.blocks.tileentity;

import javax.annotation.Nullable;

import com.vies.viescraft.main.tileentity.TileEntityExtractor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlockExtractor extends Block {

	private String procName;
	
	public BlockExtractor(String registrynameIn, Properties propertiesIn, SoundType soundtypeIn, float hardnessIn, float resistanceIn, int lightvalueIn, ToolType harvesttoolIn, int harvestlevelIn, ItemGroup itemgroupIn, String procnameIn) 
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
		
		//this.setLightOpacity(255);
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) 
	{
		return true;
	}
	
	@Nullable
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
    	return new TileEntityExtractor();
	}



	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) 
	{
		if (placer != null)
		{
			worldIn.setBlockState(pos, state.with(BlockStateProperties.FACING, getFacingFromEntity(pos, placer)), 2);
		}
	}
	
	public static Direction getFacingFromEntity(BlockPos clickedBox, LivingEntity entity)
	{
		return Direction.getFacingFromVector((float) (entity.posX - clickedBox.getX()), (float) (entity.posY - clickedBox.getY()), (float) (entity.posZ - clickedBox.getZ()));
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) 
	{
		super.fillStateContainer(builder);
		builder.add(BlockStateProperties.FACING);
	}
	
	
	
	
	
	
	
    @Override
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		// TODO Auto-generated method stub
    	if (!worldIn.isRemote)
    	{
    		TileEntity tileEntity = worldIn.getTileEntity(pos);
    		
    		if (tileEntity instanceof INamedContainerProvider) 
			{
    			NetworkHooks.openGui((ServerPlayerEntity)player, (INamedContainerProvider) tileEntity, tileEntity.getPos());
			}
    	}
    	
		return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
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
