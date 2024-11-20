package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class ForgotPassword extends BasePage{
	WebDriver driver;
	
	public ForgotPassword (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//form[@action='https://tutorialsninja.com/demo/index.php?route=account/login']//a[normalize-space()='Forgotten Password']")
	WebElement ForgotPassword;

	@FindBy(id="input-email")
	WebElement inputEmail;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebutton;
	
	public void forgotPassword(){
		ForgotPassword.click();
	}
	public void inputEmail(String email){
		inputEmail.sendKeys(email);;
	}
	public void continuebutton(){
		continuebutton.click();
	}

	
	
}
