package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage {
    private WebDriver driver;
    private By orderStatusMessage=By.xpath("//h2[@class='complete-header']");
    public OrderStatusPage(WebDriver driver) {
        this.driver=driver;
    }
    public String getOrderStatusMessage(){
        return driver.findElement(orderStatusMessage).getText();
    }


}
