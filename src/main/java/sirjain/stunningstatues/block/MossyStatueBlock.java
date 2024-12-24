package sirjain.stunningstatues.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;

public class MossyStatueBlock extends StatueBlock {
	public MossyStatueBlock() {
		FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).nonOpaque();
	}
}
