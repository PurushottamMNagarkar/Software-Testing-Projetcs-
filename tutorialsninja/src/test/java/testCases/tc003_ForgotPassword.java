package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Factory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


import pageObjects.BasePage;
import pageObjects.ForgotPassword;

public class tc003_ForgotPassword extends BasePage{

	WebDriver driver;
    
    public tc003_ForgotPassword(WebDriver driver) {
        super(driver);
    }

    @Factory
    public static Object[] createInstances() {
        return new Object[]{new tc003_ForgotPassword(new ChromeDriver())}; // Example with WebDriver parameter
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
		ForgotPassword forgotpassword =new ForgotPassword(driver);
		forgotpassword.forgotPassword();
		forgotpassword.inputEmail("abcdefghuquququq@gmail.com");
		forgotpassword.continuebutton();
		
	}
	@AfterClass
	public void tearDown() {		
		driver.quit();
	}
	
	
}
