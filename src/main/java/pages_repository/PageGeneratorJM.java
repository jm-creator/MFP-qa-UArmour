package pages_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class
PageGeneratorJM {


    public WebDriver jmDriver;

    public PageGeneratorJM(WebDriver driver) {
        jmDriver = driver;
    }

    public <TPage extends BasePageJM> TPage getInstance (Class<TPage> pageClass) {
        return PageFactory.initElements(jmDriver, pageClass);
    }
}
