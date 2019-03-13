package com.hitwe.page_object_classes;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class PageObject {
    AppiumDriver driver;
    WebDriverWait wait;

    PageObject(AppiumDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


}
