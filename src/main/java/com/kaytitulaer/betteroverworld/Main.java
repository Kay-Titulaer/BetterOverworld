package com.kaytitulaer.betteroverworld;

import com.kaytitulaer.betteroverworld.item.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MODID = "better_overworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading " + MODID);
		Items.registerItems();
	}
}
