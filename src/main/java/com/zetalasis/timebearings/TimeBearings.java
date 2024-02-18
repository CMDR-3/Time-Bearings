package com.zetalasis.timebearings;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeBearings implements ModInitializer {
	public static final String MOD_ID = "time-bearings";
    public static final Logger LOGGER = LoggerFactory.getLogger("time-bearings");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}