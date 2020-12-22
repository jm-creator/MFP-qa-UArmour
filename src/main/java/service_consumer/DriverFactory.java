package service_consumer;

import services_JM_houseOfservices.IAppConfig;
import app_config_HoseOfServices.ConfigurationManager;
import driver_JM.local.LocalDriverManagerJM;
import enums.Target;
import org.openqa.selenium.WebDriver;
import services_JM_houseOfservices.IDriver;



public class DriverFactory implements IDriver {

    @Override
    public WebDriver createInstance(String browser) {
        IAppConfig configuration = ConfigurationManager.getConfiguration();
        Target target = Target.valueOf(configuration.target().toUpperCase());
        WebDriver webDriver;
        switch (target){

            case LOCAL: //override the browser value from @Optional on BaseWeb
                webDriver = new LocalDriverManagerJM().

        }
    }
}
