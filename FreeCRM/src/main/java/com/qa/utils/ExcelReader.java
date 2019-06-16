package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet globalSheet;
	
	public ExcelReader() throws IOException {
		
		fis=new FileInputStream(new File("e:/ExcelFile.xlsx"));
		wb=new XSSFWorkbook(fis);
		globalSheet=wb.getSheetAt(0);
		
		
	}
	
	public String selectDaptName(String departmentName) throws IOException {
		
		
		
		int num=0;		
		int rowCount=globalSheet.getLastRowNum();
		System.out.println("row count "+rowCount);
		
		for(int i=1;i<=rowCount;i++) {
			
			String cellValue=globalSheet.getRow(i).getCell(0).getStringCellValue();
			if (cellValue.equalsIgnoreCase(departmentName))
			{
								
				break;
			}
		
		}
		return departmentName;
	}
	


}
