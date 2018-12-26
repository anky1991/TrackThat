package com.trackthat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.trackthat.QA.Base.TestBase;
public class LoginPage extends TestBase
{
//Page factory -OR:
@FindBy(xpath="//input[@id='exampleInputEmail1 ']")
WebElement emailid;

@FindBy(xpath="//input[@name='password11']")
WebElement password;

@FindBy(xpath="//button[@class='btn btn-default']")
WebElement loginBtn;



}



