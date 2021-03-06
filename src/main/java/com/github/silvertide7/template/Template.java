package com.github.silvertide7.template;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Template implements ModInitializer {

	public static final Item CREEPER_HEART = new CreeperHeartItem(
			new Item.Settings().group(ItemGroup.MATERIALS).maxCount(32));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("template", "creeper_heart"), CREEPER_HEART);

		System.out.println("Loaded Template Mod.");
	}
}
