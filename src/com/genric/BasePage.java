package com.genric;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public void veryfyTitle(WebDriver driver,String title)
	{
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle,title);
	}
	public void verifyTitle(WebDriver driver,int i,String title)
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,i);
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("title is matching",true);
	    }
	catch(Exception e)
		{
		Reporter.log("title is not matching",true);
		Assert.fail();
		}
	}
	public void verifyElementPresent(WebElement element)
	{
		Assert.assertTrue(element.isDisplayed());
	}
	public void verifyElementPresent(WebDriver driver,Long time,WebElement element)
	{
		try {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is Present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not Present",true);
		}
		
	}
	public void sleep(int i)
	{
		try
		{
			Thread.sleep(i*1000);
		}
		catch(Exception e)
		{
			
		}
	}
	
		

}
