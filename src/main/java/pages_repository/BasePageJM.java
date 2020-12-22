package pages_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageJM extends PageGeneratorJM {

    public BasePageJM(WebDriver driver) {
        super(driver);
    }

    public <T> void click (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            jmDriver.findElement((By) elementAttr).click();
        } else { ((WebElement) elementAttr).click();}
    }

    public<T> String readText (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) { return jmDriver.findElement((By) elementAttr).getText(); }
        else { return ((WebElement) elementAttr).getText(); }
    }

    //Close popups if exits :)
    public void handlePopUp(By by) throws InterruptedException {
        List<WebElement> popUp = jmDriver.findElements(by);
        if (!popUp.isEmpty()) {
            popUp.get(0).click();
            Thread.sleep(200);
        }
    }

    //JM WebDrivers Waits
  public static boolean waitUntilClickableOfElement(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element)) != null;
  }

  public static boolean waitUntilVisibilityOfElement(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element)) != null;
  }

  public static boolean waitUntilVisibilityOfAllElements(WebDriver driver, List<WebElement> elements){
        return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(elements)) != null;
  }
}
