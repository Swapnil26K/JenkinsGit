package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FacebookLogin extends TestBase {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public FacebookLogin()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String login() throws InterruptedException
	{
		email.sendKeys("swapnil.kadale@rediffmail.com");
		password.sendKeys("Gajanan@123");
		submit.click();
		//Thread.sleep(300000);
		return driver.getTitle();
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	

}
