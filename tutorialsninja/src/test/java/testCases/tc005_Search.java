package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import pageObjects.BasePage;
import pageObjects.Checkout;
import pageObjects.SearchPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class tc005_Search extends BasePage {
	WebDriver driver;
	
	public tc005_Search (WebDriver driver) {
		super(driver);
	}


	
	@BeforeClass
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void verifycheckout() {
		Checkout out =new Checkout(driver);
		out.setEmail("abcdefghuquququq@gmail.com");
		out.setPassword("aaaa");
		out.clickloginbt();
		out.sendtext("iPod Nano");
		out.clickserachbutton();
		
	}
	@AfterClass
	public void tearDown() {		
		driver.quit();
}
}
