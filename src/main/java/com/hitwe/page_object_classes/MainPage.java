package com.hitwe.page_object_classes;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PageObject{
    private By visitor_tab = By.xpath("//*[@qa-header-visitors]");
    public By accept_notification = By.xpath("//*[@class = 'enable-push-notifications btn blue']");
    public By android_accept_notification = By.id("android:id/button1");

    public MainPage(AppiumDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickOnVisitorTab() {
        driver.findElement(visitor_tab).click();
    }

    public void acceptNotification() {
        driver.findElement(accept_notification).click();
    }
}
