package app_config_HoseOfServices;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;


@LoadPolicy(LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:general.properties",
        "classpath:local.properties",
        "classpath:grid.properties" })
public interface AppConfig extends Config{

    @Key("target")
    String target();

    @Key("browser")
    String browser();

    @Key("headless")
    Boolean headless();

    @Key("url.base")
    String url();

    @Key("timeout")
    String timeout();

    @Key("grid.url")
    String gridUrl();

    @Key("grid.prot")
    String gridPort();

    @Key("faker.locale")
    String faker();

}
