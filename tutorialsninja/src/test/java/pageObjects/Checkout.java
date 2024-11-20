package pageObjects;

import java.time.Duration;

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

public class Checkout extends BasePage{
	WebDriver driver;
	
	public Checkout (WebDriver driver) 
	{		
		super(driver);	
	}

@FindBy(xpath="//input[@placeholder='E-Mail Address']")
WebElement txtEmail;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement txtPassword;

@FindBy(xpath="//input[@value='Login']")
WebElement loginbutton;
	
@FindBy(xpath="//input[@placeholder='Search']")
WebElement txtserach;

@FindBy(xpath="//body//header//div//div//div//div//span//button[@type='button']")
WebElement searchbutton;

@FindBy(xpath="//span[normalize-space()='Add to Cart']")
WebElement addtocartbutton;

@FindBy(xpath="//a[normalize-space()='shopping cart']\r\n")
WebElement shoppingcartbuttonbutton;

@FindBy(xpath="//a[contains(text(),'Checkout')]")
WebElement checkoutbutton;

@FindBy(xpath="//input[@value='Continue']")
WebElement continue1button;

@FindBy(xpath="//input[@value='1']")
WebElement termcondbutton;

@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]")
WebElement continue2button;

public void setEmail(String email){
	txtEmail.sendKeys(email);
}

public void setPassword(String password) {
	txtPassword.sendKeys(password);
}
public void clickloginbt() {
	loginbutton.click();
}

public void sendtext(String searchboxtxt ) {
	 txtserach.sendKeys("iPod Nano");	
}

public void clickserachbutton() {
	searchbutton.click();
}
public void addtocart() {
	

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']"))));
    addtocartbutton.click();
    
}
public void shoppingcarttxt() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	js.executeAsyncScript("window.scrollBy(0, -document.body.scrollHeight)");
	shoppingcartbuttonbutton.click();
}
public void checkoutpage() {
	checkoutbutton.click();
}
public void terandcondtion() {
	termcondbutton.click();
}

public void continuebutton2nd() {
	continue2button.click();
}

}
	

