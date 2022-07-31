package tests;

import org.testng.annotations.Test;

public class Tests extends BaseTests {

    @Test
    public void checkOfGooglePage() throws InterruptedException {
        toolSearch.checkGooglePage();
    }

    //tool - translate
    @Test
    public void checkOfTranslatePage() throws InterruptedException {
        toolSearch.goToTranslate();
        toolTranslate.checkTranslatePage();
    }
    @Test
    public void checkTranslateResult() throws InterruptedException {
        toolSearch.goToTranslate();
        toolTranslate.selectItalianLanguage();
        toolTranslate.translateItalianEnglish();
    }

    //tool - calculator
    @Test
    public void checkCalculatorPage() throws InterruptedException {
        toolSearch.goToCalculator();
        toolCalculator.checkCalculatorPage();
    }
    @Test
    public void checkCalculationPlus() throws InterruptedException {
        toolSearch.goToCalculator();
        toolCalculator.calculatePlus();
    }
    @Test
    public void checkCalculationMinus() throws InterruptedException {
        toolSearch.goToCalculator();
        toolCalculator.calculateMinus();
    }
    @Test
    public void checkCalculationMultiply() throws InterruptedException {
        toolSearch.goToCalculator();
        toolCalculator.calculateMultiply();
    }
    @Test
    public void checkCalculationDivision() throws InterruptedException {
        toolSearch.goToCalculator();
        toolCalculator.calculateDivision();
    }

    //tool - tip calculator
}
