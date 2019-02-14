package com.orangehrmlive_common_library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public static String readData(String sheetName,int rowNum,int cellNum )
	{
	try
		{
		File f1 = new File("./src/test/resources/userData/testData.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		Workbook w1 = WorkbookFactory.create(fis);
		String data = w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
		}
		catch (Exception e)
		{
		return "invalid";
		}
	}
	public static void writeData(String sheetName,int rowNum,int cellNum, String data)
	{
		try
		{
			File f1 = new File("./src/test/resources/userData/testData.xlsx");
			FileInputStream fis = new FileInputStream(f1);
			Workbook w1 = WorkbookFactory.create(fis);
			w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
			FileOutputStream fos = new FileOutputStream(f1);
			w1.write(fos);
		}
		catch (Exception e)
		{
			
		}
	}
}
