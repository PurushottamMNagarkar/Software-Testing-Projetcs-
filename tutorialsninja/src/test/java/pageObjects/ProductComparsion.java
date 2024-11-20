package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductComparsion extends BasePage {

WebDriver driver;
	
	public ProductComparsion(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//input[@placeholder='E-Mail Address']")
	WebElement pcptxtEmail;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pcppasswordtxt;
		
	@FindBy(xpath="//input[@value='Login']")
	WebElement pcploginbutton;

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement pcpsearchtxtbox;

	@FindBy(xpath="//body//header//div//div//div//div//span//button[@type='button']")
	WebElement pcpsearchbuttn;
	
	@FindBy(xpath="//body//div//button[3]")
	WebElement pcpcomparsionbutton;
	
	@FindBy(xpath="//a[normalize-space()='product comparison']")
	WebElement pcpproductbutton;
	
	
	public void pcptxtEmail(String email){
		pcptxtEmail.sendKeys(email);
	}
	public void pcppasswordtxt(String password){
		pcppasswordtxt.sendKeys(password);	
	}
	
	public void pcploginbutton(){
		pcploginbutton.click();	
	}
	public void pcpsearchbutton(String txt ){
		pcpsearchtxtbox.sendKeys(txt);	
	}
	public void pcpsearchbuttn(){
		pcpsearchbuttn.click();	
	}
	public void pcpcomparsionbutton(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body//div//button[3]"))));
		pcpcomparsionbutton.click();
	}
	public void pcpproductbutton(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0, -document.body.scrollHeight)");
		pcpproductbutton.click();
		
	}
	
	
	
	
}
