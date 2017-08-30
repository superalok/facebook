package com.facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genric.BasePage;

public class FacebookLoginOrSignupPage extends BasePage{
	private WebDriver driver;
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement pw;
	
	@FindBy(id="loginbutton")
	private WebElement login;
	 
	public FacebookLoginOrSignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void   setUserName(String username)
	
	{
		
		un.sendKeys(username);
	}
	public void setPassword(String password)
	{
		pw.sendKeys(password);
	}
	public void clickLogin()
	{
		login.click();
	}
	

}
