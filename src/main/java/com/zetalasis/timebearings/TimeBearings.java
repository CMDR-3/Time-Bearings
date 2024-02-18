package com.zetalasis.timebearings;

import com.zetalasis.timebearings.blocks.TBBlocks;
import com.zetalasis.timebearings.items.TBItemGroups;
import com.zetalasis.timebearings.items.TBItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeBearings implements ModInitializer {
	public static final String MOD_ID = "time-bearings";
    public static final Logger LOGGER = LoggerFactory.getLogger("time-bearings");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		TBItemGroups.RegisterItemGroups();
		TBBlocks.RegisterBlocks();
		TBItems.RegisterItems();
	}
}