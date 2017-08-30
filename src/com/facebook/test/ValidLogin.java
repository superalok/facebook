package com.facebook.test;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.facebook.page.FacebookLoginOrSignupPage;
import com.genric.BaseTest;

public class ValidLogin extends BaseTest{
	@Test(priority=1)
	public void testValidLogin()
	{
	FacebookLoginOrSignupPage l=new FacebookLoginOrSignupPage(driver);
	

	l.setUserName("alokkumar5445@gmail.com");
	l.setPassword("swatantrakumarishwar");
	l.clickLogin();
	l.sleep(2);
	l.verifyTitle(driver, 6, "Facebo");
	}
	
	
	

}
