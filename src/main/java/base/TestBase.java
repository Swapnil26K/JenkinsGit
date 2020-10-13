package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
	//public static WebDriver driver;
	public static RemoteWebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\base\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws MalformedURLException
	{
		String browserName = prop.getProperty("browser");
		ChromeOptions dc=new ChromeOptions();
		URL url=new URL("http://13.232.122.191:4444/wd/hub");
		
		
		  
		if(browserName.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver",
		  System.getProperty("user.dir")+"\\src\\main\\java\\driver\\chromedriver.exe")
		  ;
		  
		  System.out.println("Swapnil"); } else if(browserName.equals("FF")){
//		  System.setProperty("webdriver.gecko.driver",
//		  "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver"); //driver = new
//		  FirefoxDriver();
			  }
		 		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);		
	}

}
