package com.hitwe;

import com.hitwe.page_object_classes.MainPage;
import com.hitwe.page_object_classes.RegistrationFlow;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.hitwe.util.Context.CHROMIUM;
import static com.hitwe.util.Context.NATIVE_APP;
import static com.hitwe.util.HelpClass.generateEmail;
import static org.testng.Assert.assertTrue;

public class TestClass extends Setup{

    @Test
    public void registrationAndPushNotification() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://m.hitwe.com/landing/inter?p=15276");

        RegistrationFlow registrationFlow = new RegistrationFlow(driver, wait);
        MainPage mainPage = new MainPage(driver, wait);

        registrationFlow.chooseFemaleGender();
        registrationFlow.chooseDarkHair();
        registrationFlow.chooseDarkEyes();
        registrationFlow.chooseNormalConstitution();
        registrationFlow.fillNameField("test");
        registrationFlow.fillEmailField(generateEmail());
        registrationFlow.chooseGenderFromDropdown();
        registrationFlow.chooseAgeFromDropdown();
        registrationFlow.pressSignUpButton();
        do {
            driver.context(CHROMIUM);
            mainPage.clickOnVisitorTab();
        } while (!(wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.accept_notif))).isDisplayed());
        mainPage.acceptNotif();
        driver.context(NATIVE_APP);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.android_accept_notif_)).click();
        driver.context(CHROMIUM);
        assertTrue(!(driver.findElement(mainPage.accept_notif).isDisplayed()));
        System.out.println("User was successfully registered and subscribed to push notifications.");
    }
}
