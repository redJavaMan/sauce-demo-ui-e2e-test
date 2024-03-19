package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    private WebDriver driver;
    private By finishButton=By.id("finish");

    public ConfirmationPage(WebDriver driver) {
        this.driver=driver;
    }
    public OrderStatusPage clickFinish(){
        driver.findElement(finishButton).click();
        return new OrderStatusPage(driver);
    }
}
