package driver;


import config.ConfigurationManager;
import driver.local.LocalDriverManager;
import enums.Target;
import exceptions.TargetNotValidException;
import org.openqa.selenium.WebDriver;
import services.IAppConfig;
import services.IDriver;

import java.io.IOException;

public class DriverFactory implements IDriver {
    @Override
    public WebDriver createInstance(String browser) {
        WebDriver webDriver;
        IAppConfig config = ConfigurationManager.getConfiguration();
        Target target = Target.valueOf(config.target().toUpperCase());

        switch (target) {
            case LOCAL:
                webDriver = new LocalDriverManager().createInstance(config.browser());
                break;
            case GRID:
                webDriver = new LocalDriverManager().createInstance(config.browser());
                break;
            default:
                throw new TargetNotValidException(target.toString());

        }
    return webDriver;
    }

}
