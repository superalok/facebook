package com.genric;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustamizedListener implements ITestListener ,IAutoConst{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("hello i am start",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("i am running",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("HI",true);
		String testName = result.getName();
		try {
		Robot r=new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(size);
		BufferedImage im = r.createScreenCapture(rect);
		File dest = new File(IMG+testName+".png");
		ImageIO.write(im,".png",dest);
		}
		catch(Exception e)
		{
			Reporter.log("BYE",true);
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("BYEji");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("BYEpi");
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("BYEbye");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("BYEli");
	}

}
