package pagesCommonComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenu_component {
    //Main Menu Component$
    @FindBy(id = "menu-item-39592")
    private WebElement recipes;

    @FindBy(id = "menu-item-16045")
    private WebElement nutrition;

    @FindBy(id = "menu-item-16046")
    private WebElement weightLoss;

    @FindBy(id = "menu-item-16043")
    private WebElement fitness;

    @FindBy(id = "menu-item-16044")
    private WebElement inspiration;

    @FindBy(xpath = "(//a[@href='https://blog.myfitnesspal.com/essential-guides/'] )[1]")
    private WebElement essentials;

    @FindBy(xpath = "(//a[@href='https://blog.myfitnesspal.com/video/'] )[1]")
    private WebElement video;

    @FindBy(xpath = "https://www.underarmour.com/en-us/?cid=MMF|REF|MFPal|Blog|NavStatic|ShopUA")
    private WebElement shopUa;
}
