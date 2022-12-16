package com.QA.Utilitiesz;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	 private static XSSFWorkbook book;
	    private static XSSFSheet sheet;
	    
	    public static String readDetails(int row,int col) throws IOException
	    {
	        FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestAutomation2.xlsx");
	        book=new XSSFWorkbook(file);
	        sheet= book.getSheetAt(0);
	        DataFormatter formatter = new DataFormatter();
	        String val = formatter.formatCellValue(sheet.getRow(row).getCell(col));
	         
	        return sheet.getRow(row).getCell(col).getStringCellValue();
	    }
	
}
