package com.test.swag.lab.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Selenium automation for the CustomerInfoPage
 * @author nalini
 *
 */
public class CustomerInfoPage {
	WebDriver driver;

	WebElement nameInput;
	WebElement lastNameInput;
	WebElement postalCodeInput;
	WebElement continueButton;

	/*
	 * find the css selector input[type='submit
	 */
	public WebElement getContinueButton() {
		return driver.findElement(By.cssSelector("input[type='submit']"));

	}
	
	/*
	 * find the element for the first-name
	 */
	public WebElement getNameInput() {
		return driver.findElement(By.id("first-name"));
	}
	
	/*
	 * find the element for the last-name
	 */
	public WebElement getLastNameInput() {
		return driver.findElement(By.id("last-name"));
	}

	/*
	 * find the element for the postal-code
	 */
	public WebElement getPostalCodeInput() {
		return driver.findElement(By.id("postal-code"));
	}

	/*
	 * CustomerInfoPage
	 */
	public CustomerInfoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/*
	 * fillIn information 
	 */
	public void fillIn(String name, String lastName, String postalCode) {
		getNameInput().sendKeys(name);
		getLastNameInput().sendKeys(lastName);
		getPostalCodeInput().sendKeys(postalCode);
	}

	/*
	 * click event on the continue Button 
	 */
	public void submit() {
		getContinueButton().click();
	}

}
