package com.saucedemo.test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void successfullOrderValidation() {
        ProductsPage productsPage=loginPage.login("standard_user","secret_sauce");
        productsPage.selectProduct("Sauce Labs Backpack");
        productsPage.selectProduct("Sauce Labs Bike Light");
        CartPage cartPage = productsPage.addProductToCart();
        System.out.println(cartPage.getcartProduct(1));
        System.out.println(cartPage.getcartProduct(2));
        Assert.assertEquals(cartPage.getcartProduct(1),"Sauce Labs Backpack","Product Miss Match");
        Assert.assertEquals(cartPage.getcartProduct(2),"Sauce Labs Bike Light","Product Miss Match");
        CheckOutPage checkOutPage = cartPage.checkOut();
        ConfirmationPage confirmationPage = checkOutPage.deliveryDetails("John", "Doe", "12345");
        OrderStatusPage orderStatusPage = confirmationPage.finish();
        Assert.assertEquals(orderStatusPage.getOrderStatusMessage(),"Thank you for your order!","Product Miss Match");

    }
}
