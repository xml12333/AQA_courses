package com.company;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import static org.junit.Assert.assertTrue;

public class AppiumWebTest {

    @Test
    public void testIncorrectFBLogin() throws Exception {
        System.out.println("Step 1. Create new driver");
        AppiumDriver driver = getAppiumDriver("iOS", new URL("http://127.0.0.1:4723/wd/hub"));
        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("Step 2. Open website");
        driver.get("https://facebook.com");

        System.out.println("Step 3. Enter email");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        driver.findElement(By.name("email")).sendKeys("max@test.com");

        System.out.println("Step 4. Enter password");
        driver.findElement(By.name("pass")).sendKeys("123456");

        System.out.println("Step 5. Click Login button");
        driver.findElement(By.name("login")).click();

        System.out.println("Step 6. Check error message");
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.cssSelector("div[data-sigil='m_login_notice']")).getText().contains("The password you entered is incorrect"));

        System.out.println("Step 7. Close driver");
        driver.quit();
    }

    private AppiumDriver getAppiumDriver(String platform, URL serverUrl) {
        return platform.equals("iOS") ? getIOSDriver(serverUrl) : getAndroidDriver(serverUrl);
    }

    private AppiumDriver getIOSDriver(URL serverUrl) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        capabilities.setCapability(MobileCapabilityType.UDID, "CD23A0C6-FE61-4AAA-9359-BC8E58988DE6");

        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");

        capabilities.setCapability("showXcodeLog", "true");
        capabilities.setCapability("autoAcceptAlerts", "true");

        return new IOSDriver(serverUrl, capabilities);
    }

    private AppiumDriver getAndroidDriver(URL serverUrl) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");

        return new AndroidDriver(serverUrl, capabilities);
    }

}
