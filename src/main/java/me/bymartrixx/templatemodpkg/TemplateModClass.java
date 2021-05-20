package me.bymartrixx.templatemodpkg;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemplateModClass implements ModInitializer {
	public static final String MOD_ID = "template_mod";
	public static final String MOD_NAME = "Template_Mod_Name";
	private static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).isPresent() ? FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().toString() : "template-mod-ver";

	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		// TODO: Mod Initializer
	}
}
