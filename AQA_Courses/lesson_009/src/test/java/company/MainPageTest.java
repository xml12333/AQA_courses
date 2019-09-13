package company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        // win mac linux
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        mainPage = new MainPage(this.driver);
    }

    @Test
    public void canSelectSizeLForTShirt() {
        Assert.assertTrue(
                mainPage.openMainPage()
                        .openTShirtTab()
                        .selectSizeL()
                        .isSizeL());
    }

    @After
    public void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
