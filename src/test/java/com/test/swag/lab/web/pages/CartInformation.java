package com.test.swag.lab.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Selenium automation for the CartInformation
 * 
 * @author nalini
 *
 */
public class CartInformation {

	WebDriver driver;
	String productName;
	String productQuantity;
	WebElement checkoutButton;

	/*
	 * find the element inventory_item_name
	 */
	public String getProductName() {
		return driver.findElement(By.className("inventory_item_name")).getText();
	}

	/*
	 * find the element cart_quantity
	 */
	public String getProductQuantity() {
		return driver.findElement(By.className("cart_quantity")).getText();
	}

	/*
	 * find the element checkout_button
	 */
	public WebElement getCheckoutButton() {
		return driver.findElement(By.className("checkout_button"));
	}

	/*
	 * using the webDriver get CartInformation
	 */
	public CartInformation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/*
	 * Implementing the click event
	 */
	public void checkOut() {
		getCheckoutButton().click();
	}

}
