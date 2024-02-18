package com.zetalasis.timebearings;

import net.fabricmc.api.ClientModInitializer;

public class TimeBearingsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TimeBearings.LOGGER.info("Hello Client!");
    }
}
