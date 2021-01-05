package config;


import org.aeonbits.owner.ConfigCache;
import services.IAppConfig;


public class ConfigurationManager {

    private ConfigurationManager() {
    }

    public static IAppConfig getConfiguration() {
        return ConfigCache.getOrCreate(IAppConfig.class);
    }
}
