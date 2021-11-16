package com.test.swag.labs.base;

import org.junit.Assert;
import org.testng.annotations.Test;
/**
 * Selenium automation test with JAVA
 * @author nalini
 *
 */
public class LoginTests extends BaseTests {
	@Test(priority = 0)
	public void logInTest() throws InterruptedException {

		loginPage.inputUsername("standard_user");
		loginPage.inputPassword("secret_sauce");
		loginPage.clickLoginButton();
		Thread.sleep(2000);
		Assert.assertEquals(productPage.getProductsHeaderText(), "Products");
	}

	@Test(priority = 3)
	public void orderingTests() throws InterruptedException {
		// calling the log in test method
		logInTest();
		//adding the first product to the cart 
		productPage.addFirstProductToCart();
		//click event on shopping cart
		productPage.goToShoppingCart();
		
		Thread.sleep(2000);
		//validate the product name 
		Assert.assertEquals(cartPage.getProductName(), "Sauce Labs Backpack");
		//validate the count on the cart 
		Assert.assertEquals(cartPage.getProductQuantity(), "1");
		Thread.sleep(2000);

		//checkout 
		cartPage.checkOut();
		Thread.sleep(2000);
		//update 
		customerInfoPage.fillIn("Test User", "Here", "03063");
		customerInfoPage.submit();

		Thread.sleep(2000);
		Assert.assertEquals(checkoutPage.finishButtonText(), "FINISH");
		checkoutPage.finalizePurchase();

		Thread.sleep(2000);
		// validate the confirmation page
		Assert.assertEquals(confirmationPage.orderConfirmationText(), confirmationPage.getAssertText());
	}

}
