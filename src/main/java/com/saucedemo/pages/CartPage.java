package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkOutButton=By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver=driver;
    }
    public String getcartProduct(int p){
        return driver.findElement(By.xpath("(//div[@class='inventory_item_name'])["+p+"]")).getText();
    }
    public CheckOutPage clickCheckOut(){
        driver.findElement(checkOutButton).click();
        return new CheckOutPage(driver);
    }
}
