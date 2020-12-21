package MFP_UI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(@Optional(value = "CHROME") String browser) {

    }
}
