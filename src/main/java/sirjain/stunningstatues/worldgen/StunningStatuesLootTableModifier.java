package sirjain.stunningstatues.worldgen;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import sirjain.stunningstatues.item.StunningStatuesItems;

import java.util.Arrays;
import java.util.List;

public class StunningStatuesLootTableModifier {
	public static final List<RegistryKey<LootTable>> VILLAGE_VARIANTS = Arrays.asList(
		LootTables.VILLAGE_ARMORER_CHEST,
		LootTables.VILLAGE_BUTCHER_CHEST,
		LootTables.VILLAGE_CARTOGRAPHER_CHEST,
		LootTables.VILLAGE_DESERT_HOUSE_CHEST,
		LootTables.VILLAGE_FISHER_CHEST,
		LootTables.VILLAGE_FLETCHER_CHEST,
		LootTables.VILLAGE_MASON_CHEST,
		LootTables.VILLAGE_PLAINS_CHEST,
		LootTables.VILLAGE_SAVANNA_HOUSE_CHEST,
		LootTables.VILLAGE_SHEPARD_CHEST,
		LootTables.VILLAGE_SNOWY_HOUSE_CHEST,
		LootTables.VILLAGE_TAIGA_HOUSE_CHEST,
		LootTables.VILLAGE_TANNERY_CHEST,
		LootTables.VILLAGE_TEMPLE_CHEST,
		LootTables.VILLAGE_TOOLSMITH_CHEST,
		LootTables.VILLAGE_WEAPONSMITH_CHEST
	);

	public static final Item[] STATUES = new Item[] {
		StunningStatuesItems.TURTLE_STATUE_ITEM,
		StunningStatuesItems.TNT_STATUE_ITEM,
		StunningStatuesItems.SWORD_STATUE_ITEM,
		StunningStatuesItems.SQUID_STATUE_ITEM,
		StunningStatuesItems.PHANTOM_STATUE_ITEM,
		StunningStatuesItems.SPIDER_STATUE_ITEM,
		StunningStatuesItems.SHIELD_STATUE_ITEM,
		StunningStatuesItems.GHAST_STATUE_ITEM,
		StunningStatuesItems.ENDERMITE_STATUE_ITEM,
		StunningStatuesItems.PIXIE_ORB_STATUE_ITEM,
		StunningStatuesItems.CREEPER_STATUE_ITEM,
		StunningStatuesItems.BANNER_STATUE_ITEM,
		StunningStatuesItems.BLAZE_STATUE_ITEM,
	};

	public static List<RegistryKey<LootTable>> BURIED_VARIANTS = Arrays.asList(
		LootTables.BURIED_TREASURE_CHEST,
		LootTables.SHIPWRECK_TREASURE_CHEST,
		LootTables.SIMPLE_DUNGEON_CHEST,
		LootTables.UNDERWATER_RUIN_BIG_CHEST,
		LootTables.UNDERWATER_RUIN_SMALL_CHEST
	);

	public static final Item[] UNCOMMON_STATUES = new Item[] {
		StunningStatuesItems.ISOPOD_STATUE_ITEM,
		StunningStatuesItems.MANTA_RAY_STATUE_ITEM,
		StunningStatuesItems.COPPER_GOLEM_STATUE_ITEM,
		StunningStatuesItems.DUMBO_BLOB_STATUE_ITEM
	};

	public static void registerLootTableModifiers() {
		LootTableEvents.MODIFY.register((key, tableBuilder, source, wrapperLookup) -> {
			for (RegistryKey<LootTable> villageIteration : VILLAGE_VARIANTS) {
				for (Item statue : STATUES) {
					if (key != villageIteration) continue;
					appendItemToLootTable(statue, 0.01f, tableBuilder);
				}
			}

			for (RegistryKey<LootTable> villageIteration : BURIED_VARIANTS) {
				for (Item statue : UNCOMMON_STATUES) {
					if (key != villageIteration) continue;
					appendItemToLootTable(statue, 0.08f, tableBuilder);
				}
			}
		});
	}

	public static void appendItemToLootTable(Item item, float chance, LootTable.Builder tableBuilder) {
		LootPool.Builder poolBuilder = new LootPool.Builder()
			.rolls(ConstantLootNumberProvider.create(1))
			.conditionally(RandomChanceLootCondition.builder(chance))
			.with(ItemEntry.builder(item))
			.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

		tableBuilder.pool(poolBuilder);
	}
}
