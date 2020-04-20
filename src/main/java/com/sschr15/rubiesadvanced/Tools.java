package com.sschr15.rubiesadvanced;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public class Tools {
    public static Item newItem(String regName, String translationKey, CreativeTabs creativeTab) {
        return new Item()
                .setRegistryName(RubiesAdvanced.MODID + regName)
                .setTranslationKey(RubiesAdvanced.MODID + "." + translationKey)
                .setCreativeTab(creativeTab);
    }

    public static Item newItem(String regName, CreativeTabs creativeTab) {
        return new Item()
                .setRegistryName(RubiesAdvanced.MODID + regName)
                .setTranslationKey(RubiesAdvanced.MODID + "." + regName)
                .setCreativeTab(creativeTab);
    }

    public static Item newItemBlock(Block block) {
        return new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName()));
    }

    public static Block newBlock(Material material, String regName, CreativeTabs creativeTab) {
        return new Block(material)
                .setRegistryName(regName)
                .setTranslationKey(regName)
                .setCreativeTab(creativeTab);
    }
}
