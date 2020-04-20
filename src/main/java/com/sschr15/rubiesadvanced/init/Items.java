package com.sschr15.rubiesadvanced.init;

import com.sschr15.rubiesadvanced.RubiesAdvanced;
import com.sschr15.rubiesadvanced.Tools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(RubiesAdvanced.MODID)
public class Items {
    public static final Item ruby = Tools.newItem("ruby", CreativeTabs.MATERIALS);
}
