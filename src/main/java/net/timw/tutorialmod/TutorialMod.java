package net.timw.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.timw.tutorialmod.creativemodetab.ModCreativeModeTabs;
import net.timw.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
	}
}
