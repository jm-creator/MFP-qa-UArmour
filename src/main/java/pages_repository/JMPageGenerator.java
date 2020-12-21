package pages_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class
JMPageGenerator {


    public WebDriver jmDriver;

    public JMPageGenerator(WebDriver driver) {
        jmDriver = driver;
    }

    public <TPage extends BasePage> TPage getInstance (Class<TPage> pageClass) {
        return PageFactory.initElements(jmDriver, pageClass);
    }
}
