package com.gud.guns;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;

public class GudGuns implements ModInitializer {

    public static final String MOD_ID = "gudguns";
    public static final String MOD_NAME = "Gud Guns";

    public static final Item REVOLVER_ITEM = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PISTOL_ITEM = new Item(new Item.Settings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gudguns", "revolver"), REVOLVER_ITEM);
        Registry.register(Registry.ITEM, new Identifier("gudguns", "pistol"), PISTOL_ITEM);
    }


}