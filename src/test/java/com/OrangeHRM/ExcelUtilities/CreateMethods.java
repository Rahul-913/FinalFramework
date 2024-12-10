package com.OrangeHRM.ExcelUtilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMethods 
{
//	XSSFSheet Sheet;
	static XSSFWorkbook book;
	public static void CreateSheets(String SheetName)
	{
		book = new XSSFWorkbook();
		book.createSheet(SheetName);
		
	}
	public static void CreateRows(String ExcelPath,String SheetName,int row) throws Exception
	{
		XSSFSheet sheet = AccessMethods.AccessSheets(ExcelPath, SheetName);
		sheet.createRow(row);
	}
	public static void CreateCells(String SheetName,int row,int cel) throws Exception
	{
		XSSFRow rows = AccessMethods.AccessRows(SheetName, row);
		rows.createCell(cel);
	}
	public static void WriteCellValues(String SheetName,int row,int cel,String CelValue) throws Exception
	{
		XSSFCell Cel = AccessMethods.AccessCells(SheetName, row, cel);
//		Cel.setCellValue(CelValue);
	}
	
}
