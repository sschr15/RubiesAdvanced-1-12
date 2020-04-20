package com.sschr15.rubiesadvanced.init;

import com.sschr15.rubiesadvanced.RubiesAdvanced;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.sschr15.rubiesadvanced.Tools.newBlock;

@GameRegistry.ObjectHolder(RubiesAdvanced.MODID)
public class Blocks {
    public static final Block rubyOre = newBlock(Material.ROCK, "ruby_ore", CreativeTabs.BUILDING_BLOCKS);
    public static final Block rubyBlock = newBlock(Material.ROCK, "ruby_block", CreativeTabs.BUILDING_BLOCKS);
}
