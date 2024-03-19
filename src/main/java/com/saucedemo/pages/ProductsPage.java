package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage {
    private WebDriver driver;
    private By addToCartButton=By.xpath("//div[@class='inventory_item_name ']//parent::a//parent::div//following-sibling::div[@class='pricebar']/button");
    private By cartButton=By.id("shopping_cart_container");
    //private String product1;
    public ProductsPage(WebDriver driver) {
        this.driver=driver;
    }
    public void selectProduct(String item){
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for (int i=0;i<products.size();i++){
            if(products.get(i).getText().contains(item)){
               // product1=products.get(i).getText();
                driver.findElements(addToCartButton).get(i).click();
            }
        }
    }

    public CartPage clickCartButton(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);
    }
}
