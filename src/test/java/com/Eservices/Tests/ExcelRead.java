package com.Eservices.Tests;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelRead {
	
	
	private static String FilePath="E:\\Plymouthrock\\Excel\\Data.xlsx";
	private static String sheetName="Login";
	
	
	@DataProvider(name="excelData")
	   public Object[][] getData() throws Exception {
	       return ExcelRead.readExcel(FilePath, sheetName);
	   }





	public static  Object[][] readExcel(String FilePath,String sheetname) throws Exception {


	            FileInputStream file= new FileInputStream(FilePath);
	            XSSFWorkbook wb = new XSSFWorkbook(file);
	            XSSFSheet sheet = wb.getSheet(sheetname);
	            int rowCount = sheet.getLastRowNum();
	            int column = sheet.getRow(0).getLastCellNum();
	            Object[][] data = new Object[rowCount][column];
	            for (int i = 1; i <= rowCount; i++) {
	                XSSFRow row = sheet.getRow(i);
	                for (int j = 0; j < column; j++) {
	                    XSSFCell cell = row.getCell(j);
	                    DataFormatter formatter = new DataFormatter();
	                    String val = formatter.formatCellValue(cell);
	                    data[i - 1][j] = val;
	                }
	            }

	            return data;
	        }

	 
	// return(tabArray);


	}



