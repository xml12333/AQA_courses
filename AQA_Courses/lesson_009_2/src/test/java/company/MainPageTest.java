package company;

import company.pages.MainPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainPageTest extends BaseTest {

    private MainPage mainPage;

    @Before
    public void setupMainPage(){
        mainPage = new MainPage(driver);
    }


    @Test
    public void canCheckTotalPriceForTShirt(){
        mainPage.clickTShirtTab()
                .scrollToItem();
        mainPage.navigateToItemView();
        mainPage.clickAddToCart();
        mainPage.clickProceedToCheckout();

        String actualResult = mainPage.getTotalPrice();
        String expectedResult = "$18.51";

        Assert.assertEquals("If test failed then total price was changed", expectedResult, actualResult);
    }
}
