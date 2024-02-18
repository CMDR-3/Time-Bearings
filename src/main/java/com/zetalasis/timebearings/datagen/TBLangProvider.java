package com.zetalasis.timebearings.datagen;

import com.zetalasis.timebearings.blocks.TBBlocks;
import com.zetalasis.timebearings.items.TBItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class TBLangProvider extends FabricLanguageProvider {

    protected TBLangProvider(FabricDataOutput generator) {
        super(generator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(TBItems.CLOCKWORK_UTILITIES, "Clockwork Utilities");
        translationBuilder.add(TBItems.DEBUG_WAND, "Debug Wand");
        translationBuilder.add(TBBlocks.CLOCKWORK_TABLE, "Clockwork Table");
        translationBuilder.add(TBBlocks.TARDIS_EXTERIOR, "Tardis Exterior");
        translationBuilder.add("itemgroup.tools", "Time Bearings Tools");
        translationBuilder.add("itemgroup.exteriors", "Time Bearings Exteriors");
    }
}
