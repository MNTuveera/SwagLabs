package com.test.swag.labs.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.test.swag.lab.web.pages.CartInformation;
import com.test.swag.lab.web.pages.CheckoutProducts;
import com.test.swag.lab.web.pages.ConfirmationPage;
import com.test.swag.lab.web.pages.CustomerInfoPage;
import com.test.swag.lab.web.pages.LoginPage;
import com.test.swag.lab.web.pages.ProducInformation;



/**
 * Selenium Automation for the Base Class 
 * @author nalini
 *
 */
public class BaseTests {
	WebDriver driver;
	LoginPage loginPage;
	ProducInformation productPage;
	CartInformation cartPage;
	CustomerInfoPage customerInfoPage;
	CheckoutProducts checkoutPage;
	ConfirmationPage confirmationPage;

	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nalini/eclipse-workspace/swaglabsdemo/resources/chromedriver");
		this.driver = new ChromeDriver();
		this.loginPage = new LoginPage(driver);
		this.productPage = new ProducInformation(driver);
		this.cartPage = new CartInformation(driver);
		this.customerInfoPage = new CustomerInfoPage(driver);
		this.checkoutPage = new CheckoutProducts(driver);
		this.confirmationPage = new ConfirmationPage(driver);

		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("Program");
	}

}
