package sirjain.stunningstatues.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class StatueBlock extends Block {
	public static final VoxelShape HITBOX = Block.createCuboidShape(1, 0, 1, 15, 2, 15);

	public StatueBlock(boolean isUncommon) {
		super(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).nonOpaque().requiresTool().luminance((isUncommon ? 5 : 0)));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(HorizontalFacingBlock.FACING);
	}

	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(HorizontalFacingBlock.FACING, ctx.getHorizontalPlayerFacing());
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return HITBOX;
	}
}