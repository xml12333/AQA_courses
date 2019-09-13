package ctdev.dataProvider;

import ctdev.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {

    private MainPage mainPage;

    @BeforeMethod
    public void setupMainPage() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void canCheckTotalPriceForTShirt() {
        mainPage.clickTShirtTab();
        mainPage.scrollToItem();
        mainPage.navigateToItemView();
        mainPage.clickAddToCart();
        mainPage.clickProceedToCheckout();

        String actualResult = mainPage.getTotalPrice();
        String expectedResult = "$18.511";

        Assert.assertEquals("$18.511", mainPage.getTotalPrice());

       // Assert.assertEquals("Actual result is: " + actualResult + " Expected result is: " + expectedResult, expectedResult, actualResult);
    }
}
