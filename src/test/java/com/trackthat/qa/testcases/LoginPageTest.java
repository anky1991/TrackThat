package com.trackthat.qa.testcases;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.trackthat.QA.Base.TestBase;
import com.trackthat.qa.pages.LoginPage;
import com.trackthat.qa.pages.PatientTrends;
public class LoginPageTest extends TestBase
{
	LoginPage lp;
	PatientTrends PT;
	public LoginPageTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setup()
	{
		initilization();
		new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String sr=lp.validateLoginPageTitle();
		Assert.assertEquals(sr, "LOGIN");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		PT=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		dr.quit();
	}
	

}
