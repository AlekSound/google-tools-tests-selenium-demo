package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ToolTranslate extends BasePage {
    public ToolTranslate(WebDriver driver) {
        super(driver);
    }

    public static final String TITLE = "translate - Google Search";
    public static final String BUTTON_SELECT_LANGUAGE = "//div[@id=\"tw-sl\"]";
    public static final String FIELD_LIST_LANGUAGES = "//input[@id=\"sl_list-search-box\"]";
    public static final String LIST_SELECT_LANGUAGE = "//b[text()=\"Italian\"]";
    public static final String FIELD_TRANSLATE = "//textarea[@id=\"tw-source-text-ta\"]";
    public static final String ENGLISH_HELLO_PROPERTIES = "//span [@class=\"Y2IQFc\"] [text()=\"Hello\"]";
    public static final String ITALIAN_LANGUAGE_NAME = "Italian";
    public static final String ITALIAN_HELLO = "Ciao";
    public static final String ENGLISH_HELLO = "Hello";


    //check that it is the google translate page by title
    public void checkTranslatePage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, TITLE);
    }

    //select Italian language
    public void selectItalianLanguage() {
        clickOn(By.xpath(BUTTON_SELECT_LANGUAGE));
        write(By.xpath(FIELD_LIST_LANGUAGES), ITALIAN_LANGUAGE_NAME);
        clickOn(By.xpath(LIST_SELECT_LANGUAGE));
    }

    //translate Hello from Italian to English
    public void translateItalianEnglish() throws InterruptedException {
        write(By.xpath(FIELD_TRANSLATE), ITALIAN_HELLO);
        Thread.sleep(2000);
        String checkTranslate = driver.findElement(By.xpath(ENGLISH_HELLO_PROPERTIES)).getAttribute("textContent");
        Assert.assertEquals(checkTranslate, ENGLISH_HELLO);
        Thread.sleep(1000);
    }
}
