package com.trackthat.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.trackthat.QA.Base.TestBase;
import com.trackthat.qa.config.*;
public class LoginPage extends TestBase
{
//Page factory -OR:
	
@FindBy(xpath="//input[@id='exampleInputEmail1 ']")
WebElement emailid;

@FindBy(xpath="//input[@name='password11']")
WebElement password;

@FindBy(xpath="//button[@class='btn btn-default']")
WebElement loginBtn;

//Initilizing the page object 
public LoginPage() 
{
	PageFactory.initElements(dr, this);
}
//Actions
public String validateLoginPageTitle()
{
	
return dr.getTitle();

}
public PatientTrends login(String id,String pswd)
{
	emailid.sendKeys(id);
	password.sendKeys(pswd);
	loginBtn.click();
	return new PatientTrends();
}

}



