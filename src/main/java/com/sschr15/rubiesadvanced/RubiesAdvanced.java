package com.sschr15.rubiesadvanced;

import com.sschr15.rubiesadvanced.init.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;
import net.minecraftforge.fml.common.Mod.*;

@Mod(modid = RubiesAdvanced.MODID, name = RubiesAdvanced.NAME, version = RubiesAdvanced.VERSION)
public class RubiesAdvanced {
    public static final String MODID = "rubiesadvanced";
    public static final String NAME = "Rubies Advanced";
    public static final String VERSION = "0.1";

    public static Logger LOG;

    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOG = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
