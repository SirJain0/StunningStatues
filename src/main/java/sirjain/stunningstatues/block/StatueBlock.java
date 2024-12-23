package sirjain.stunningstatues.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class StatueBlock extends Block {
	public StatueBlock() {
		super(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS));
	}
}