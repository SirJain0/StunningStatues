package sirjain.stunningstatues.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class StatueBlock extends Block {
	public static final VoxelShape HITBOX = Block.createCuboidShape(1, 0, 1, 15, 2, 15);

	public StatueBlock(boolean isUncommon) {
		super(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).nonOpaque().requiresTool().luminance((isUncommon ? 5 : 0)));
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return HITBOX;
	}
}