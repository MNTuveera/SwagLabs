package com.test.swag.lab.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Selenium automation for the ConfirmationPage
 * @author nalini
 *
 */
public class ConfirmationPage {
	
	WebDriver driver;
	
	String orderConfirmation;
	
	String assertText;
	/*
	 * find the element complete-header
	 */
	public String orderConfirmationText() {
		return driver.findElement(By.className("complete-header")).getText();
	}

	/*
	 * Get the text to validate
	 */
	public String getAssertText() {
		return "THANK YOU FOR YOUR ORDER";
	}

	/*
	 * navigation to confirmation page 
	 */
	public ConfirmationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
