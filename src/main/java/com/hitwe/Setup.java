package com.hitwe;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class Setup {
    private DesiredCapabilities capabilities;
    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;
    public TouchAction action;


    @BeforeClass
    public void initialize() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Nexus 5X API 27");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("browserName", "Chrome");
    }

    @BeforeMethod
    public void initDriver() throws MalformedURLException {
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 7);
        driver.get("https://m.hitwe.com/landing/inter?p=15276");
    }
}
