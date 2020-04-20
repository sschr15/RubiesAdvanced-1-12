package com.sschr15.rubiesadvanced.init;

import com.sschr15.rubiesadvanced.RubiesAdvanced;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = RubiesAdvanced.MODID)
public class ModelRegisterHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(Items.ruby, 0);
        registerModel(Item.getItemFromBlock(Blocks.rubyBlock), 0);
        registerModel(Item.getItemFromBlock(Blocks.rubyOre), 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
