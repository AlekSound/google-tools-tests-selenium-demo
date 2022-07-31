package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ToolCalculator extends BasePage{
    public ToolCalculator(WebDriver driver) {
        super(driver);
    }

    public static final String TITLE = "calculator - Google Search";
    public static final String FIELD_RESULT_PROPERTIES = "//span[@id=\"cwos\"]";
    public static final String BUTTON_PLUS = "//div[@role=\"button\"][text()=\"+\"]";
    public static final String BUTTON_MINUS = "//div[@role=\"button\"][text()=\"−\"]";
    public static final String BUTTON_MULTIPLY = "//div[@role=\"button\"][text()=\"×\"]";
    public static final String BUTTON_DIVISION = "//div[@role=\"button\"][text()=\"÷\"]";
    public static final String BUTTON_EQUALS = "//div[@role=\"button\"][text()=\"=\"]";

    public static final String BUTTON_3 = "//div[@role=\"button\"][text()=\"3\"]";
    public static final String BUTTON_9 = "//div[@role=\"button\"][text()=\"9\"]";

    public static final String RESULT_PLUS = "12";
    public static final String RESULT_MINUS = "6";
    public static final String RESULT_MULTIPLY = "27";
    public static final String RESULT_DIVISION = "3";


    //check that it is the google calculator page by title
    public void checkCalculatorPage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, TITLE);
    }

    //action plus 9+3=12
    public void calculatePlus() throws InterruptedException {
        clickOn(By.xpath(BUTTON_9));
        clickOn(By.xpath(BUTTON_PLUS));
        clickOn(By.xpath(BUTTON_3));
        clickOn(By.xpath(BUTTON_EQUALS));
        Thread.sleep(1000);
        String result = driver.findElement(By.xpath(FIELD_RESULT_PROPERTIES)).getAttribute("textContent");
        Assert.assertEquals(result, RESULT_PLUS);
    }

    //action plus 9-3=6
    public void calculateMinus() throws InterruptedException {
        clickOn(By.xpath(BUTTON_9));
        clickOn(By.xpath(BUTTON_MINUS));
        clickOn(By.xpath(BUTTON_3));
        clickOn(By.xpath(BUTTON_EQUALS));
        Thread.sleep(1000);
        String result = driver.findElement(By.xpath(FIELD_RESULT_PROPERTIES)).getAttribute("textContent");
        Assert.assertEquals(result, RESULT_MINUS);
    }

    //action plus 9*3=27
    public void calculateMultiply() throws InterruptedException {
        clickOn(By.xpath(BUTTON_9));
        clickOn(By.xpath(BUTTON_MULTIPLY));
        clickOn(By.xpath(BUTTON_3));
        clickOn(By.xpath(BUTTON_EQUALS));
        Thread.sleep(1000);
        String result = driver.findElement(By.xpath(FIELD_RESULT_PROPERTIES)).getAttribute("textContent");
        Assert.assertEquals(result, RESULT_MULTIPLY);
    }

    //action plus 9÷3=3
    public void calculateDivision() throws InterruptedException {
        clickOn(By.xpath(BUTTON_9));
        clickOn(By.xpath(BUTTON_DIVISION));
        clickOn(By.xpath(BUTTON_3));
        clickOn(By.xpath(BUTTON_EQUALS));
        Thread.sleep(1000);
        String result = driver.findElement(By.xpath(FIELD_RESULT_PROPERTIES)).getAttribute("textContent");
        Assert.assertEquals(result, RESULT_DIVISION);
    }
}
