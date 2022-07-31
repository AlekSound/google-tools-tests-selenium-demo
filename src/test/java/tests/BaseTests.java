package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import tools.ToolCalculator;
import tools.ToolSearch;
import tools.ToolTipCalculator;
import tools.ToolTranslate;

public class BaseTests {
    public ToolSearch toolSearch;
    public ToolTranslate toolTranslate;
    public ToolCalculator toolCalculator;
    public ToolTipCalculator toolTipCalculator;

    WebDriver driver;

    @BeforeTest
    public void prestart() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        toolSearch = PageFactory.initElements(driver, ToolSearch.class);
        toolTranslate = PageFactory.initElements(driver, ToolTranslate.class);
        toolCalculator = PageFactory.initElements(driver, ToolCalculator.class);
        toolTipCalculator = PageFactory.initElements(driver, ToolTipCalculator.class);
    }

    @AfterMethod
    public void finish() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
