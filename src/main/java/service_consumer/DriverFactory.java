package service_consumer;

import org.openqa.selenium.WebDriver;
import services_JM_houseOfservices.IDriver;



public class DriverFactory implements IDriver {

    @Override
    public WebDriver createInstance(String browser) {
        WebDriver webDriver = null;
        return webDriver;
    }
}
