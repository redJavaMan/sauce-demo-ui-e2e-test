package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    private By firstNameTextBox=By.id("first-name");
    private By lastNameTextBox=By.id("last-name");
    private By postalCodeTextBox=By.id("postal-code");
    private By continueButton=By.id("continue");
    public CheckOutPage(WebDriver driver) {
        this.driver=driver;
    }
    public ConfirmationPage deliveryDetails(String firstName, String lastName, String postalCode){
        driver.findElement(firstNameTextBox).sendKeys(firstName);
        driver.findElement(lastNameTextBox).sendKeys(lastName);
        driver.findElement(postalCodeTextBox).sendKeys(postalCode);
        driver.findElement(continueButton).click();
        return new ConfirmationPage(driver);
    }
}
