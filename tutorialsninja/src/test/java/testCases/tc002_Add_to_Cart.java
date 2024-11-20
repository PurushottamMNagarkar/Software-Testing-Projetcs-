package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.Checkout;

public class tc002_Add_to_Cart extends BasePage {

	 WebDriver driver;
	    
	    public tc002_Add_to_Cart(WebDriver driver) {
	        super(driver);
	    }

	    @Factory
	    public static Object[] createInstances() {
	        return new Object[]{new tc002_Add_to_Cart(new ChromeDriver())}; // Example with WebDriver parameter
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
			Checkout out =new Checkout(driver);
			out.setEmail("abcdefghuquququq@gmail.com");
			out.setPassword("aaaa");
			out.clickloginbt();
			out.sendtext("iPod Nano");
			out.clickserachbutton();
			out.addtocart();
			out.shoppingcarttxt();
	
	
	
}
		@AfterClass
		public void tearDown() {		
			driver.quit();
		}
		
	}