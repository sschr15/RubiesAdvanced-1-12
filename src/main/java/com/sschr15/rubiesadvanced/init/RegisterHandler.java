package com.sschr15.rubiesadvanced.init;

import com.sschr15.rubiesadvanced.RubiesAdvanced;
import com.sschr15.rubiesadvanced.Tools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = RubiesAdvanced.MODID)
public class RegisterHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                Tools.newItem("ruby", CreativeTabs.MATERIALS)
        };
        final Item[] blockItems = {
                Tools.newItemBlock(Blocks.rubyOre),
                Tools.newItemBlock(Blocks.rubyBlock)
        };

        event.getRegistry().registerAll(items);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                Tools.newBlock(Material.ROCK, "ruby_ore", CreativeTabs.BUILDING_BLOCKS),
                Tools.newBlock(Material.ROCK, "ruby_block", CreativeTabs.BUILDING_BLOCKS)
        };

        event.getRegistry().registerAll(blocks);
    }
}
