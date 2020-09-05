package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.FacebookLogin;

public class LoginPageTest extends TestBase{
	
	FacebookLogin loginPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new FacebookLogin();	
//		List<String> myName=new ArrayList<String>();
//		List<String> myName2=new ArrayList<String>();
//		myName.add("Swap");
//		myName.add("Ashu");	
//		myName.add("Avadhoot");
//		myName2.add("Swap");
//		myName2.add("Ashu");
//		myName2.add("Avadhoot");			
//		Assert.assertEquals(myName, myName2,"Not Matched");
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
