package com.genric;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(CustamizedListener.class)
public abstract class BaseTest implements IAutoConst {
	static
	{
		System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
	}
	public WebDriver driver;
	@Parameters({"node","browser"})
	@BeforeMethod(alwaysRun=true)
	/*public void openApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}*/
	
	public void openApplication(String node,String browser) throws MalformedURLException
	{
		try
		{
		URL url=new URL(node);
		DesiredCapabilities browser1=new DesiredCapabilities();
		browser1.setBrowserName(browser);
		driver=new RemoteWebDriver(url,browser1);
		driver.get(FIREFOX_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	catch(Exception exp)
	{
		System.out.println("Unable to open Browser.");
	}
	}
//	@AfterMethod(alwaysRun=true)
//	public void closeApplication()
//	{
//		driver.quit();
//	}
}
