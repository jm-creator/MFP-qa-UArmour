package pages_common_components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages_repository.BasePageJM;

import java.util.List;
import java.util.Random;

public class FurtherInspiration_module extends BasePageJM {

    private final boolean MODULE_EXISTENCE = false;

    public FurtherInspiration_module(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "( //div[contains(concat(' ', @class, ' '), ' slick-track ')] ) [1]")
    private static List<WebElement> furtherInspirationModuleList;

    public boolean checkFurtherInspirationModuleExistence() {
        final boolean b;
        if (furtherInspirationModuleList == null) {
            b = false == MODULE_EXISTENCE;
            System.out.println("\n" + "  /* error current page does not have further module \n   */");
        }else b = MODULE_EXISTENCE;
            System.out.println("\n" + "   List of FURTHER_INSPIRATION MODULES == /*" + "\n" + furtherInspirationModuleList + "\n   */");
            return b;
    }

    public List<WebElement> getFurtherInspirationModuleList() {
        if (checkFurtherInspirationModuleExistence())
            return furtherInspirationModuleList;
        System.out.println("\n  /* error current page does not have further module \n   /");
        return furtherInspirationModuleList;
    }


    public WebElement getRandomElementFlow() {
        Random random = new Random();
        WebElement randomFurtherInspiration =
                furtherInspirationModuleList.get(random.nextInt(furtherInspirationModuleList.size()));
        System.out.println("\n  /* random element selected = " + randomFurtherInspiration + "\n  */");
        return randomFurtherInspiration;
    }
}