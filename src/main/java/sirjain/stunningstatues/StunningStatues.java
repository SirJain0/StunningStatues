package sirjain.stunningstatues;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.stunningstatues.block.StunningStatuesBlocks;
import sirjain.stunningstatues.item.StunningStatuesItems;

public class StunningStatues implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("stunningstatues");
	public static final String MOD_ID = "stunningstatues";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Stunning Statues!");

		StunningStatuesBlocks.registerNormalStatues();
		StunningStatuesBlocks.registerMossyStatues();
		StunningStatuesItems.registerNormalStatueBlockItems();
		StunningStatuesItems.registerMossyStatueBlockItems();
		StunningStatuesItems.addItemsToTabs();
	}
}