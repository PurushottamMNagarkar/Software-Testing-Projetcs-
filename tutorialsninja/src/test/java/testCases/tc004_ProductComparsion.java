package testCases;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.ProductComparsion;

public class tc004_ProductComparsion extends BasePage {
       
	WebDriver driver;
	
	public tc004_ProductComparsion (WebDriver driver) {
		super(driver);
	}

	@BeforeClass
	public void setup() {
	WebDriver driver=  new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
		
	}
	@Test
	public void verifycheckout() {
		ProductComparsion productcomparsion = new ProductComparsion(driver);
		productcomparsion.pcptxtEmail("abcdefghuquququq@gmail.com");
		productcomparsion.pcppasswordtxt("aaaa");
		productcomparsion.pcploginbutton();
		productcomparsion.pcpsearchbutton("iPod Nano");
		
		
		
	}
	@AfterClass
	public void tearDown() {		
		driver.quit();
	}

}
