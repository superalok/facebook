package com.genric;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Èxcel {
	public static String getCellValue(String path,String sheet,int r,int c)  
	{
		String v=" ";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream("D:\\Book1.xlxs"));
		v = wb.getSheet("sheet1").getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
     public static int getRowCount(String path,String sheet)
     {
    	 int rc=0;
    	 try 
    	 {
    		 Workbook wb = WorkbookFactory.create(new FileInputStream("D:\\Book1.xlxs"));
    		 rc=wb.getSheet("sheet1").getLastRowNum();
    	 }
    	 catch(Exception e)
    	 {
    		 
    		 
    	 }
    	 return rc;
     }
}
