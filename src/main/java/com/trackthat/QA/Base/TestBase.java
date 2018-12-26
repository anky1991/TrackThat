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
	public static WebDriver dr;
	public static Properties prop;
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
			dr=new ChromeDriver();
		}
		else if(BrowserName.equals("FF"))
		{
		    System.setProperty("webdriver.gecko.driver","//home//ankitsharma//Downloads//geckodriver");		
		    dr =new FirefoxDriver();
		}
		 dr.manage().window().maximize();
		 dr.manage().deleteAllCookies();
		 dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 dr.get(prop.getProperty("Url"));
		}
	}


