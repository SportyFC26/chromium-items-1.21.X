package net.sportyfc26.chromiumitems;

import net.fabricmc.api.ModInitializer;

import net.sportyfc26.chromiumitems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment Hi
public class ChromiumItems implements ModInitializer {
	public static final String MOD_ID = "chromiumitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}