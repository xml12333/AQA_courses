package ctdev.dataProvider;

import ctdev.WebDriverFactory.engine.DriverType;
import ctdev.WebDriverFactory.engine.WebDriverFactory;
import ctdev.utils.Config;
import ctdev.utils.TestHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("src/main/resources/test.properties");

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }


    @AfterMethod
    public void cleanup() {
        driver.manage().deleteAllCookies();
        TestHelper.sleep5Seconds();
        driver.close();
    }
}
