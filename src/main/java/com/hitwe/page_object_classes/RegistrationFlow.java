package com.hitwe.page_object_classes;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationFlow extends PageObject {
    private By female = By.xpath("//*[@data-test = 'qa-left-btn']");
    private By dark_hair = By.xpath("//*[@data-test = 'qa-left-btn']");
    private By dark_eyes = By.xpath("//*[@data-test = 'qa-left-btn']");
    private By slim_normal = By.xpath("//*[@data-test = 'qa-right-btn']");
    private By name_field = By.xpath("//*[@data-test = 'qa-name']");
    private By email = By.xpath("//*[@data-test = 'qa-email']");
    private By gender = By.xpath("//*[@data-test = 'qa-gender']");
    private By gender_from_dropdown = By.xpath("//*[@value = 'm']");
    private By age = By.xpath("//*[@data-test = 'qa-age']");
    private By age_from_dropdown = By.xpath("//*[@value = '27']");
    private By sign_up_button = By.xpath("//*[@data-test = 'qa-sign']");

    public RegistrationFlow(AppiumDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void chooseFemaleGender() {
        driver.findElement(female).click();
    }

    public void chooseDarkHair() {
        driver.findElement(dark_hair).click();
    }

    public void chooseDarkEyes() {
        driver.findElement(dark_eyes).click();
    }

    public void chooseNormalConstitution() {
        driver.findElement(slim_normal).click();
    }

    public void fillNameField(String name) {
        driver.findElement(name_field).sendKeys(name);
    }

    public void fillEmailField(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void chooseGenderFromDropdown() {
        driver.findElement(gender).click();
        driver.findElement(gender_from_dropdown).click();
    }

    public void chooseAgeFromDropdown() {
        driver.findElement(age).click();
        driver.findElement(age_from_dropdown).click();
    }

    public void pressSignUpButton() {
        driver.findElement(sign_up_button).click();
    }
}
