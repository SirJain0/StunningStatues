package sirjain.stunningstatues.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import sirjain.stunningstatues.block.StunningStatuesBlocks;

public class StunningStatuesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		registerCutoutBlocks(
			StunningStatuesBlocks.BANNER_STATUE,
			StunningStatuesBlocks.COPPER_GOLEM_STATUE,
			StunningStatuesBlocks.ISOPOD_STATUE,
			StunningStatuesBlocks.MANTA_RAY_STATUE,
			StunningStatuesBlocks.PHANTOM_STATUE,
			StunningStatuesBlocks.PIXIE_ORB_STATUE,

			StunningStatuesBlocks.MOSSY_BANNER_STATUE,
			StunningStatuesBlocks.MOSSY_BLAZE_STATUE,
			StunningStatuesBlocks.MOSSY_CREEPER_STATUE,
			StunningStatuesBlocks.MOSSY_COPPER_GOLEM_STATUE,
			StunningStatuesBlocks.MOSSY_DUMBO_BLOB_STATUE,
			StunningStatuesBlocks.MOSSY_ENDERMITE_STATUE,
			StunningStatuesBlocks.MOSSY_GHAST_STATUE,
			StunningStatuesBlocks.MOSSY_ISOPOD_STATUE,
			StunningStatuesBlocks.MOSSY_MANTA_RAY_STATUE,
			StunningStatuesBlocks.MOSSY_PHANTOM_STATUE,
			StunningStatuesBlocks.MOSSY_PIXIE_ORB_STATUE,
			StunningStatuesBlocks.MOSSY_SHIELD_STATUE,
			StunningStatuesBlocks.MOSSY_SPIDER_STATUE,
			StunningStatuesBlocks.MOSSY_SQUID_STATUE,
			StunningStatuesBlocks.MOSSY_SWORD_STATUE,
			StunningStatuesBlocks.MOSSY_TNT_STATUE,
			StunningStatuesBlocks.MOSSY_TURTLE_STATUE
		);
	}

	public static void registerCutoutBlocks(Block... blocks) {
		for (Block block : blocks) {
			BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
		}
	}
}
