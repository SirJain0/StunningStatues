package sirjain.stunningstatues.block;

import net.minecraft.block.Block;
import net.minecraft.client.render.entity.feature.EnergySwirlOverlayFeatureRenderer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sirjain.stunningstatues.StunningStatues;

public class StunningStatuesBlocks {
	public static Block BANNER_STATUE;
	public static Block BLAZE_STATUE;
	public static Block COPPER_GOLEM_STATUE;
	public static Block CREEPER_STATUE;
	public static Block DUMBO_BLOB_STATUE;
	public static Block ENDERMITE_STATUE;
	public static Block GHAST_STATUE;
	public static Block ISOPOD_STATUE;
	public static Block MANTA_RAY_STATUE;
	public static Block PHANTOM_STATUE;
	public static Block PIXIE_ORB_STATUE;
	public static Block SHIELD_STATUE;
	public static Block SPIDER_STATUE;
	public static Block SQUID_STATUE;
	public static Block SWORD_STATUE;
	public static Block TNT_STATUE;
	public static Block TURTLE_STATUE;

	public static Block MOSSY_BANNER_STATUE;
	public static Block MOSSY_BLAZE_STATUE;
	public static Block MOSSY_COPPER_GOLEM_STATUE;
	public static Block MOSSY_CREEPER_STATUE;
	public static Block MOSSY_DUMBO_BLOB_STATUE;
	public static Block MOSSY_ENDERMITE_STATUE;
	public static Block MOSSY_GHAST_STATUE;
	public static Block MOSSY_ISOPOD_STATUE;
	public static Block MOSSY_MANTA_RAY_STATUE;
	public static Block MOSSY_PHANTOM_STATUE;
	public static Block MOSSY_PIXIE_ORB_STATUE;
	public static Block MOSSY_SHIELD_STATUE;
	public static Block MOSSY_SPIDER_STATUE;
	public static Block MOSSY_SQUID_STATUE;
	public static Block MOSSY_SWORD_STATUE;
	public static Block MOSSY_TNT_STATUE;
	public static Block MOSSY_TURTLE_STATUE;

	public static void registerNormalStatues() {
		BANNER_STATUE = registerNormalStatue("banner");
		BLAZE_STATUE = registerNormalStatue("blaze");
		COPPER_GOLEM_STATUE = registerNormalStatue("copper_golem");
		CREEPER_STATUE = registerNormalStatue("creeper");
		DUMBO_BLOB_STATUE = registerNormalStatue("dumbo_blob");
		ENDERMITE_STATUE = registerNormalStatue("endermite");
		GHAST_STATUE = registerNormalStatue("ghast");
		ISOPOD_STATUE = registerNormalStatue("isopod");
		MANTA_RAY_STATUE = registerNormalStatue("manta_ray");
		PHANTOM_STATUE = registerNormalStatue("phantom");
		PIXIE_ORB_STATUE = registerNormalStatue("pixie_orb");
		SHIELD_STATUE = registerNormalStatue("shield");
		SPIDER_STATUE = registerNormalStatue("spider");
		SQUID_STATUE = registerNormalStatue("squid");
		SWORD_STATUE = registerNormalStatue("sword");
		TNT_STATUE = registerNormalStatue("tnt");
		TURTLE_STATUE = registerNormalStatue("turtle");
	}

	public static void registerMossyStatues() {
		MOSSY_BANNER_STATUE = registerMossyStatue("banner");
		MOSSY_BLAZE_STATUE = registerMossyStatue("blaze");
		MOSSY_COPPER_GOLEM_STATUE = registerMossyStatue("copper_golem");
		MOSSY_CREEPER_STATUE = registerMossyStatue("creeper");
		MOSSY_DUMBO_BLOB_STATUE = registerMossyStatue("dumbo_blob");
		MOSSY_ENDERMITE_STATUE = registerMossyStatue("endermite");
		MOSSY_GHAST_STATUE = registerMossyStatue("ghast");
		MOSSY_ISOPOD_STATUE = registerMossyStatue("isopod");
		MOSSY_MANTA_RAY_STATUE = registerMossyStatue("manta_ray");
		MOSSY_PHANTOM_STATUE = registerMossyStatue("phantom");
		MOSSY_PIXIE_ORB_STATUE = registerMossyStatue("pixie_orb");
		MOSSY_SHIELD_STATUE = registerMossyStatue("shield");
		MOSSY_SPIDER_STATUE = registerMossyStatue("spider");
		MOSSY_SQUID_STATUE = registerMossyStatue("squid");
		MOSSY_SWORD_STATUE = registerMossyStatue("sword");
		MOSSY_TNT_STATUE = registerMossyStatue("tnt");
		MOSSY_TURTLE_STATUE = registerMossyStatue("turtle");
	}

	// Helper method to register normal statue
	public static Block registerNormalStatue(String identifier) {
		return Registry.register(
			Registries.BLOCK,
			new Identifier(StunningStatues.MOD_ID, identifier + "_statue"),
			new StatueBlock()
		);
	}

	// Helper method to register mossy statue
	public static Block registerMossyStatue(String identifier) {
		return Registry.register(
			Registries.BLOCK,
			new Identifier(StunningStatues.MOD_ID, "mossy_" + identifier + "_statue"),
			new MossyStatueBlock()
		);
	}
}
