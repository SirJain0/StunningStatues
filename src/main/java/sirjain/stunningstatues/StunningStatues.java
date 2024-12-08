package sirjain.stunningstatues;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StunningStatues implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("stunningstatues");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Stunning Statues!");
	}
}