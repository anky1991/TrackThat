package com.trackthat.QA.Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*Framework Created By Ankit Sharmma*/
//Base class contain all properties
public class TestBase {  
	static WebDriver driver;
	static Properties prop;
	public TestBase(){
		try 
		{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("/home/ankitsharma/eclipse/TrackThattest/" 
				+"src/main/java/com/trackthat/qa/config/config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
    }
	public static void initilization() 
	    {
		String BrowserName= prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","/home/ankitsharma/Documents/chromedriver");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("FF"))
		{
		    System.setProperty("webdriver.gecko.driver","//home//ankitsharma//Downloads//geckodriver");		
		    driver =new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("Url"));
		 System.out.println("plase");
		 System.out.println("plase");

		}
	}


