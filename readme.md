![](https://komarev.com/ghpvc/?username=AlekSound)
![](https://img.shields.io/cirrus/github/AlekSound/DealBoard-AutoTests-demo)
# google-tools-tests-selenium-demo

---
This is a demonstration of auto tests on the example of some Google Tools. </br>
Such tools were used for demonstration:

- **SEARCH** - is a fully-automated search engine
 </br> ![search](https://prnt.sc/5n_GkTP4qzZ4)
  </br>- check of searching.
- **TRANSLATE** - is an online multilingual neural machine translation service developed by Google to translate text, documents and websites from one language into another.
  </br> ![translate](https://prnt.sc/FrKcxlNEny2H)
  </br>- check of translate from Italian to English.
- **CALCULATOR** - is a device that performs arithmetic.
  </br> ![calculator](https://prnt.sc/1U6VnLZ0XwF7)
  </br>- check of simple arithmetic operations like addition, subtraction, division and multiplication.
- **Tip Calculator** alculates tip amount for various percentages of the cost of the service, and also provides a total amount that includes the tip.
  </br>![tip calculator](https://prnt.sc/33bVZFZ8CZ-Z)
  </br>- current status is "in process".


Project's technologies:

- Java11, maven, selenium4, testNG7

Example of code: <br/>
```java
public class ToolSearch {
    public static final String SEARCH_PAGE = "https://www.google.com/?hl=en";
    public static final String TITLE = "Google";

    //check that it is the google search page by title
    public void checkGooglePage() throws InterruptedException {
        driver.get(SEARCH_PAGE);
        String title = driver.getTitle();
        Assert.assertEquals(title, TITLE);
    }

    @Test
    public void checkOfGooglePage() {
        checkGooglePage();
    }
}
```