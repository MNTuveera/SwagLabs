package com.test.swag.lab.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Selenium automation for the Checkout Products page
 * @author nalini
 *
 */
public class CheckoutProducts {
	//web driver 
	WebDriver driver;
	//web element 
	WebElement finalizeOrderButton;
	
	/*
	 * find the element cart_button
	 */
	public WebElement getFinalizeOrderButton() {
		return driver.findElement(By.className("cart_button"));
	}
	
	/*
	 * getting the text of the cart button 
	 */
	public String finishButtonText() {
		return getFinalizeOrderButton().getText();
	}
	
	/*
	 * checkout products info
	 */
	public CheckoutProducts(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/*
	 * finalizing the purchase 
	 */
	public void finalizePurchase() {
		getFinalizeOrderButton().click();
	}
}
