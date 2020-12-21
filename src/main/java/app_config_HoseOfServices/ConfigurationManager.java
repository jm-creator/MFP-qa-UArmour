package app_config_HoseOfServices;


import org.aeonbits.owner.ConfigCache;


public class ConfigurationManager {

    private ConfigurationManager() {
    }

    public static AppConfig getConfiguration() {
        return ConfigCache.getOrCreate(AppConfig.class);
    }
}
