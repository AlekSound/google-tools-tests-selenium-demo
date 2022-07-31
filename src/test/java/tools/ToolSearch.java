package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ToolSearch extends BasePage{
    public ToolSearch(WebDriver driver) {
        super(driver);
    }

    public static final String SEARCH_PAGE = "https://www.google.com/?hl=en";
    public static final String FIELD_SEARCH = "//input[@name=\"q\"]";
    public static final String TITLE = "Google";

    public static String translate = "translate";
    public static String calculator = "calculator";
    public static String tipCalculator = "tip calculator";


    //check that it is the google search page by title
    public void checkGooglePage() throws InterruptedException {
        driver.get(SEARCH_PAGE);
        String title = driver.getTitle();
        Assert.assertEquals(title, TITLE);
        Thread.sleep(1000);
    }
    // move to translate
    public void goToTranslate() throws InterruptedException {
        driver.get(SEARCH_PAGE);
        write(By.xpath(FIELD_SEARCH), translate);
        tapOnENTER(By.xpath(FIELD_SEARCH));
        Thread.sleep(1000);
    }

    // move to calculator
    public void goToCalculator() throws InterruptedException {
        driver.get(SEARCH_PAGE);
        write(By.xpath(FIELD_SEARCH), calculator);
        tapOnENTER(By.xpath(FIELD_SEARCH));
        Thread.sleep(1000);
    }

    //move to tip calculator
    public void goToTipCalculator() throws InterruptedException {
        driver.get(SEARCH_PAGE);
        write(By.xpath(FIELD_SEARCH), tipCalculator);
        tapOnENTER(By.xpath(FIELD_SEARCH));
        Thread.sleep(1000);
    }
}
