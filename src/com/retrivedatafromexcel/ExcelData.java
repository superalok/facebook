package com.retrivedatafromexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FileInputStream f=new FileInputStream("D:\\Alok\\Book1.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("sheet1");
		
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		String s1 = c.getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(s1);;
		//driver.findElement(By.id("pass"));
		//driver.findElement(By.id("u_0_2"));

	}

}
