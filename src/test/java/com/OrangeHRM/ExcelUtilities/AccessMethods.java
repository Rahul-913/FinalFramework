package com.OrangeHRM.ExcelUtilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessMethods 
{
	static int cel;
	static int row;
	static String Sheetname;
	static String ExcelPath;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	public static XSSFSheet AccessSheets(String ExcelPath,String Sheet) throws Exception
	{
			book = new XSSFWorkbook(ExcelPath);
			sheet = book.getSheet(Sheet);
			return sheet;
	}
	public static XSSFRow AccessRows(String sheetname,int row) throws Exception
	{
		XSSFRow rows = AccessSheets(ExcelPath, Sheetname).getRow(row);
		return rows;
	}
	public static XSSFCell AccessCells(String SheetName,int row,int cel) throws Exception
	{
		XSSFCell Cel = AccessRows(Sheetname,row).getCell(cel);
		return Cel;
		
	}
	public static String AccessCellValue(String SheetName,int row,int cel) throws Exception
	{
		String celValue = AccessCells(Sheetname,row,cel).getStringCellValue();
		return celValue;
	}

}
