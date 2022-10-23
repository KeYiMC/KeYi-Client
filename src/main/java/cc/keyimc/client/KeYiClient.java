package cc.keyimc.client;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeYiClient implements ClientModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("keyiclient");

	private static KeYiConfig config;

	@Override
	public void onInitializeClient() {
		AutoConfig.register(KeYiConfig.class, GsonConfigSerializer::new); // register as Json config
		config = AutoConfig.getConfigHolder(KeYiConfig.class).getConfig(); // Get config
	}

	public static KeYiConfig getConfig() {
		return config;
	}

}
