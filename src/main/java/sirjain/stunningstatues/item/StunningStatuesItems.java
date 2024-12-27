package sirjain.stunningstatues.item;

import com.sun.source.util.ParameterNameProvider;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import sirjain.stunningstatues.StunningStatues;
import sirjain.stunningstatues.block.StunningStatuesBlocks;

public class StunningStatuesItems {
	public static BlockItem BANNER_STATUE_ITEM;
	public static BlockItem BLAZE_STATUE_ITEM;
	public static BlockItem COPPER_GOLEM_STATUE_ITEM;
	public static BlockItem CREEPER_STATUE_ITEM;
	public static BlockItem DUMBO_BLOB_STATUE_ITEM;
	public static BlockItem ENDERMITE_STATUE_ITEM;
	public static BlockItem GHAST_STATUE_ITEM;
	public static BlockItem ISOPOD_STATUE_ITEM;
	public static BlockItem MANTA_RAY_STATUE_ITEM;
	public static BlockItem PHANTOM_STATUE_ITEM;
	public static BlockItem PIXIE_ORB_STATUE_ITEM;
	public static BlockItem SHIELD_STATUE_ITEM;
	public static BlockItem SPIDER_STATUE_ITEM;
	public static BlockItem SQUID_STATUE_ITEM;
	public static BlockItem SWORD_STATUE_ITEM;
	public static BlockItem TNT_STATUE_ITEM;
	public static BlockItem TURTLE_STATUE_ITEM;

	public static BlockItem MOSSY_BANNER_STATUE_ITEM;
	public static BlockItem MOSSY_BLAZE_STATUE_ITEM;
	public static BlockItem MOSSY_COPPER_GOLEM_STATUE_ITEM;
	public static BlockItem MOSSY_CREEPER_STATUE_ITEM;
	public static BlockItem MOSSY_DUMBO_BLOB_STATUE_ITEM;
	public static BlockItem MOSSY_ENDERMITE_STATUE_ITEM;
	public static BlockItem MOSSY_GHAST_STATUE_ITEM;
	public static BlockItem MOSSY_ISOPOD_STATUE_ITEM;
	public static BlockItem MOSSY_MANTA_RAY_STATUE_ITEM;
	public static BlockItem MOSSY_PHANTOM_STATUE_ITEM;
	public static BlockItem MOSSY_PIXIE_ORB_STATUE_ITEM;
	public static BlockItem MOSSY_SHIELD_STATUE_ITEM;
	public static BlockItem MOSSY_SPIDER_STATUE_ITEM;
	public static BlockItem MOSSY_SQUID_STATUE_ITEM;
	public static BlockItem MOSSY_SWORD_STATUE_ITEM;
	public static BlockItem MOSSY_TNT_STATUE_ITEM;
	public static BlockItem MOSSY_TURTLE_STATUE_ITEM;

	public static void registerNormalStatueBlockItems() {
		BANNER_STATUE_ITEM = registerNormalStatueBlockItem("banner", StunningStatuesBlocks.BANNER_STATUE);
		BLAZE_STATUE_ITEM = registerNormalStatueBlockItem("blaze", StunningStatuesBlocks.BLAZE_STATUE);
		COPPER_GOLEM_STATUE_ITEM = registerUncommonStatueBlockItem("copper_golem", StunningStatuesBlocks.COPPER_GOLEM_STATUE);
		CREEPER_STATUE_ITEM = registerNormalStatueBlockItem("creeper", StunningStatuesBlocks.CREEPER_STATUE);
		DUMBO_BLOB_STATUE_ITEM = registerUncommonStatueBlockItem("dumbo_blob", StunningStatuesBlocks.DUMBO_BLOB_STATUE);
		ENDERMITE_STATUE_ITEM = registerNormalStatueBlockItem("endermite", StunningStatuesBlocks.ENDERMITE_STATUE);
		GHAST_STATUE_ITEM = registerNormalStatueBlockItem("ghast", StunningStatuesBlocks.GHAST_STATUE);
		ISOPOD_STATUE_ITEM = registerUncommonStatueBlockItem("isopod", StunningStatuesBlocks.ISOPOD_STATUE);
		MANTA_RAY_STATUE_ITEM = registerUncommonStatueBlockItem("manta_ray", StunningStatuesBlocks.MANTA_RAY_STATUE);
		PHANTOM_STATUE_ITEM = registerNormalStatueBlockItem("phantom", StunningStatuesBlocks.PHANTOM_STATUE);
		PIXIE_ORB_STATUE_ITEM = registerUncommonStatueBlockItem("pixie_orb", StunningStatuesBlocks.PIXIE_ORB_STATUE);
		SHIELD_STATUE_ITEM= registerNormalStatueBlockItem("shield", StunningStatuesBlocks.SHIELD_STATUE);
		SPIDER_STATUE_ITEM = registerNormalStatueBlockItem("spider", StunningStatuesBlocks.SPIDER_STATUE);
		SQUID_STATUE_ITEM = registerNormalStatueBlockItem("squid", StunningStatuesBlocks.SQUID_STATUE);
		SWORD_STATUE_ITEM = registerNormalStatueBlockItem("sword", StunningStatuesBlocks.SWORD_STATUE);
		TNT_STATUE_ITEM = registerNormalStatueBlockItem("tnt", StunningStatuesBlocks.TNT_STATUE);
		TURTLE_STATUE_ITEM = registerNormalStatueBlockItem("turtle", StunningStatuesBlocks.TURTLE_STATUE);
	}

	public static void registerMossyStatueBlockItems() {
		MOSSY_BANNER_STATUE_ITEM = registerMossyStatueBlockItem("banner", StunningStatuesBlocks.MOSSY_BANNER_STATUE);
		MOSSY_BLAZE_STATUE_ITEM = registerMossyStatueBlockItem("blaze", StunningStatuesBlocks.MOSSY_BLAZE_STATUE);
		MOSSY_COPPER_GOLEM_STATUE_ITEM = registerUncommonMossyStatueBlockItem("copper_golem", StunningStatuesBlocks.MOSSY_COPPER_GOLEM_STATUE);
		MOSSY_CREEPER_STATUE_ITEM = registerMossyStatueBlockItem("creeper", StunningStatuesBlocks.MOSSY_CREEPER_STATUE);
		MOSSY_DUMBO_BLOB_STATUE_ITEM = registerUncommonMossyStatueBlockItem("dumbo_blob", StunningStatuesBlocks.MOSSY_DUMBO_BLOB_STATUE);
		MOSSY_ENDERMITE_STATUE_ITEM = registerMossyStatueBlockItem("endermite", StunningStatuesBlocks.MOSSY_ENDERMITE_STATUE);
		MOSSY_GHAST_STATUE_ITEM = registerMossyStatueBlockItem("ghast", StunningStatuesBlocks.MOSSY_GHAST_STATUE);
		MOSSY_ISOPOD_STATUE_ITEM = registerUncommonMossyStatueBlockItem("isopod", StunningStatuesBlocks.MOSSY_ISOPOD_STATUE);
		MOSSY_MANTA_RAY_STATUE_ITEM = registerUncommonMossyStatueBlockItem("manta_ray", StunningStatuesBlocks.MOSSY_MANTA_RAY_STATUE);
		MOSSY_PHANTOM_STATUE_ITEM = registerMossyStatueBlockItem("phantom", StunningStatuesBlocks.MOSSY_PHANTOM_STATUE);
		MOSSY_PIXIE_ORB_STATUE_ITEM = registerUncommonMossyStatueBlockItem("pixie_orb", StunningStatuesBlocks.MOSSY_PIXIE_ORB_STATUE);
		MOSSY_SHIELD_STATUE_ITEM= registerMossyStatueBlockItem("shield", StunningStatuesBlocks.MOSSY_SHIELD_STATUE);
		MOSSY_SPIDER_STATUE_ITEM = registerMossyStatueBlockItem("spider", StunningStatuesBlocks.MOSSY_SPIDER_STATUE);
		MOSSY_SQUID_STATUE_ITEM = registerMossyStatueBlockItem("squid", StunningStatuesBlocks.MOSSY_SQUID_STATUE);
		MOSSY_SWORD_STATUE_ITEM = registerMossyStatueBlockItem("sword", StunningStatuesBlocks.MOSSY_SWORD_STATUE);
		MOSSY_TNT_STATUE_ITEM = registerMossyStatueBlockItem("tnt", StunningStatuesBlocks.MOSSY_TNT_STATUE);
		MOSSY_TURTLE_STATUE_ITEM = registerMossyStatueBlockItem("turtle", StunningStatuesBlocks.MOSSY_TURTLE_STATUE);
	}

	public static BlockItem registerNormalStatueBlockItem(String identifier, Block block) {
		return Registry.register(
			Registries.ITEM,
			Identifier.of(StunningStatues.MOD_ID, identifier + "_statue"),
			new BlockItem(block, new Item.Settings())
		);
	}

	public static BlockItem registerMossyStatueBlockItem(String identifier, Block block) {
		return Registry.register(
			Registries.ITEM,
			Identifier.of(StunningStatues.MOD_ID, "mossy_" + identifier + "_statue"),
			new BlockItem(block, new Item.Settings())
		);
	}

	public static BlockItem registerUncommonStatueBlockItem(String identifier, Block block) {
		return Registry.register(
			Registries.ITEM,
			Identifier.of(StunningStatues.MOD_ID, identifier + "_statue"),
			new BlockItem(block, new Item.Settings().rarity(Rarity.UNCOMMON))
		);
	}

	public static BlockItem registerUncommonMossyStatueBlockItem(String identifier, Block block) {
		return Registry.register(
			Registries.ITEM,
			Identifier.of(StunningStatues.MOD_ID, "mossy_" + identifier + "_statue"),
			new BlockItem(block, new Item.Settings().rarity(Rarity.UNCOMMON))
		);
	}

	public static void addItemsToTabs() {
		addItemToTab(MOSSY_TURTLE_STATUE_ITEM);
		addItemToTab(MOSSY_TNT_STATUE_ITEM);
		addItemToTab(MOSSY_SWORD_STATUE_ITEM);
		addItemToTab(MOSSY_SQUID_STATUE_ITEM);
		addItemToTab(MOSSY_SPIDER_STATUE_ITEM);
		addItemToTab(MOSSY_SHIELD_STATUE_ITEM);
		addItemToTab(MOSSY_PIXIE_ORB_STATUE_ITEM);
		addItemToTab(MOSSY_PHANTOM_STATUE_ITEM);
		addItemToTab(MOSSY_MANTA_RAY_STATUE_ITEM);
		addItemToTab(MOSSY_ISOPOD_STATUE_ITEM);
		addItemToTab(MOSSY_GHAST_STATUE_ITEM);
		addItemToTab(MOSSY_ENDERMITE_STATUE_ITEM);
		addItemToTab(MOSSY_DUMBO_BLOB_STATUE_ITEM);
		addItemToTab(MOSSY_CREEPER_STATUE_ITEM);
		addItemToTab(MOSSY_COPPER_GOLEM_STATUE_ITEM);
		addItemToTab(MOSSY_BLAZE_STATUE_ITEM);
		addItemToTab(MOSSY_BANNER_STATUE_ITEM);

		addItemToTab(TURTLE_STATUE_ITEM);
		addItemToTab(TNT_STATUE_ITEM);
		addItemToTab(SWORD_STATUE_ITEM);
		addItemToTab(SQUID_STATUE_ITEM);
		addItemToTab(SPIDER_STATUE_ITEM);
		addItemToTab(SHIELD_STATUE_ITEM);
		addItemToTab(PIXIE_ORB_STATUE_ITEM);
		addItemToTab(PHANTOM_STATUE_ITEM);
		addItemToTab(MANTA_RAY_STATUE_ITEM);
		addItemToTab(ISOPOD_STATUE_ITEM);
		addItemToTab(GHAST_STATUE_ITEM);
		addItemToTab(ENDERMITE_STATUE_ITEM);
		addItemToTab(DUMBO_BLOB_STATUE_ITEM);
		addItemToTab(CREEPER_STATUE_ITEM);
		addItemToTab(COPPER_GOLEM_STATUE_ITEM);
		addItemToTab(BLAZE_STATUE_ITEM);
		addItemToTab(BANNER_STATUE_ITEM);
	}

	public static void addItemToTab(Item item) {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.addAfter(Items.INFESTED_MOSSY_STONE_BRICKS, item));
	}
}
