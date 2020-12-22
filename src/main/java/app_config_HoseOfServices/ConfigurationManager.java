package app_config_HoseOfServices;


import org.aeonbits.owner.ConfigCache;
import services_JM_houseOfservices.IAppConfig;


public class ConfigurationManager {

    private ConfigurationManager() {
    }

    public static IAppConfig getConfiguration() {
        return ConfigCache.getOrCreate(IAppConfig.class);
    }
}
