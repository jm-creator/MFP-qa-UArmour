package pagesCommonComponents;
/* first need to find all href links on module -> list
*  next need to click one randomly
*  how i give human random flow to my client (tests)?  */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePageJM;

import java.util.List;
import java.util.Random;

//generic Trending articles

public class TrendingArticles_module extends BasePageJM {
    private boolean FURTHER_INSPIRATION = false; //true if exist

    public TrendingArticles_module(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "( //div[contains(concat(' ', @class, ' '), ' slick-track ')] )[1]")
    private static List<WebElement> trendingArticlesModuleList;

    @FindBy(xpath = "( //div[contains(concat(' ', @class, ' '), ' slick-track ')] )[2]")
    private static List<WebElement> furtherArticlesModuleList;

    public List<WebElement> getTrendingArticlesModuleList() {
        return trendingArticlesModuleList;
    }

    public WebElement getRandomFromList() {
        Random random = new Random();
        WebElement randomTrendingArticle =
                trendingArticlesModuleList.get(random.nextInt(trendingArticlesModuleList.size()));
        System.out.println(
                "random element selected = /*\n"+randomTrendingArticle.toString()+"\n*/");
      return randomTrendingArticle;
    }

    public  boolean checkForTrendingArticlesListOnActualPage() {
        if (trendingArticlesModuleList.size() == 1 && furtherArticlesModuleList != null) {
            this.FURTHER_INSPIRATION = true;
            return true;
        }
        return false;
    }
}
