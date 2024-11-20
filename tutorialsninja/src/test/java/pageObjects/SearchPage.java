package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage {
	
			WebDriver driver;

			public SearchPage(WebDriver driver)
			{
				super(driver);
				
			}
			@FindBy(xpath="//input[@placeholder='E-Mail Address']")
			WebElement shtxtEmail;

			@FindBy(xpath="//input[@placeholder='Password']")
			WebElement shpasswordtxt;
				
			@FindBy(xpath="//input[@value='Login']")
			WebElement shcloginbutton;

			@FindBy(xpath="//input[@placeholder='Search']")
			WebElement shsearchtxtbox;

			@FindBy(xpath="//body//header//div//div//div//div//span//button[@type='button']")
			WebElement shsearchbutton;
			
			@FindBy(xpath="//span[normalize-space()='Add to Cart']")
			WebElement shaddtocartbutton;
			
			@FindBy(xpath="//a[normalize-space()='shopping cart']")
			WebElement shshoppingcartbutton;
			
			
			public void atcsetEmail(String email){
				shtxtEmail.sendKeys(email);
				
			}
			public void atcpasswordtxt(String password){
				shpasswordtxt.sendKeys(password);	
			}
			public void atcloginbutton(){
				shcloginbutton.click();
			}
			public void atcsearchtxtbox(String searchtxt){
				shsearchtxtbox.sendKeys("iPod Nano");;
			}
			public void atcsearchbutton(){
				shsearchbutton.click();
			}


}
