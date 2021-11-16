package tests.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.CartPage;
import pages.CheckoutPage;
import pages.ConfirmationPage;
import pages.CustomerInfoPage;
import pages.LoginPage;
import pages.ProductPage;

public class BaseTests 
{
	WebDriver driver;
	LoginPage loginPage;
	ProductPage productPage;
	CartPage cartPage;
	CustomerInfoPage customerInfoPage;
	CheckoutPage checkoutPage;
	ConfirmationPage confirmationPage;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nalini/eclipse-workspace/swaglabsdemo/resources/chromedriver");
		this.driver = new ChromeDriver();
		this.loginPage = new LoginPage(driver);
		this.productPage = new ProductPage(driver);
		this.cartPage = new CartPage(driver);
		this.customerInfoPage = new CustomerInfoPage(driver);
		this.checkoutPage = new CheckoutPage(driver);
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
