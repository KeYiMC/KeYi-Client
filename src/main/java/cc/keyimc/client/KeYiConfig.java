package cc.keyimc.client;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "keyiclient")
public class KeYiConfig implements ConfigData {

    @ConfigEntry.Category("example") // Set the category of the config data
    public boolean shouldStart = false; // Add a config data

}
