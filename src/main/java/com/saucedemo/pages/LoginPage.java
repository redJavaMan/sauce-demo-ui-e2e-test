package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameTextBox=By.id("user-name");
    private By passwordTextBox=By.id("password");
    private By loginButton=By.id("login-button");
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public ProductsPage login(String userName,String password){
        driver.findElement(userNameTextBox).sendKeys(userName);
        driver.findElement(passwordTextBox).sendKeys(password);
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

}
