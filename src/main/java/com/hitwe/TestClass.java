package com.hitwe;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass extends Setup {
    @Test
    public void test() {
//        driver.findElement(By.className("inter-select-item left")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementByXPath("//*[@alt = 'Девушки']").click();
        driver.findElementByXPath("//*[@alt = 'Темные']").click();
        driver.findElementByXPath("//*[@alt = 'Темные']").click();
        driver.findElementByXPath("//*[@alt = 'Стройная']").click();
        driver.findElementByXPath("//*[@data-test = 'qa-name']").sendKeys("test");
        driver.findElementByXPath("//*[@data-test = 'qa-email']").sendKeys("4ssassdsdfdsdf646@testmail.com");
        driver.findElementByXPath("//*[@data-test = 'qa-gender']").click();
        driver.findElementByXPath("//*[@value = 'm']").click();
        driver.findElementByXPath("//*[@data-test = 'qa-age']").click();
        driver.findElementByXPath("//*[@value = '27']").click();
        driver.findElementByXPath("//*[@data-test = 'qa-sign']").click();



//        driver.findElementByXPath("//a[@href = '/profile/activity?type=visitors']").click();
//        driver.findElementByXPath("//a[@href = '/hotusers?type=hour']").click();
        do {
            driver.get("https://m.hitwe.com/profile/activity?type=visitors");
//            driver.get("https://m.hitwe.com/hotusers?type=hour");

//            driver.findElementByXPath("//*[contains(text(),'Посетители')]").click();
//            driver.findElementByXPath("//a[@href= '/profile/activity?type=visitors']").click();
//            driver.findElementByXPath("//a[@href= '/hotusers?type=hour']").click();
        } while (!(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'enable-push-notifications btn blue']"))).isDisplayed()));
        driver.findElementByXPath("//*[@class = 'enable-push-notifications btn blue']").click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@resource-id=‘android:id/button1’]"))).click();
//        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.findElementByXPath("//android.widget.FrameLayout[@resource-id=‘android:id/button1’]").click();
        driver.switchTo().activeElement();
        driver.findElementById("android:id/button1").click();



//        ((AndroidDriver) driver).findElement(By.id("android:id/button1")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1"))).click();
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();
    }

}
