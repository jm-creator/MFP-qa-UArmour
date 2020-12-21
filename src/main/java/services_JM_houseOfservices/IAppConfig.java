package services_JM_houseOfservices;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;


@LoadPolicy(LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:general.properties",
        "classpath:driver_JM.local.properties",
        "classpath:grid.properties" })
public interface IAppConfig extends Config{

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
