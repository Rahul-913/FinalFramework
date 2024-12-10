package com.OrangeHRM.ExcelUtilities;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHRM.GenericScripts.ApplicationConstants;

public class WriteDataIntoExcel implements ApplicationConstants
{
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static XSSFRow row1;
	static XSSFCell cel1;
	static FileOutputStream fos;
	public static void CreateSheet(String SheetName) throws IOException
	{
		 book = new XSSFWorkbook();
		sheet = book.createSheet(SheetName);
		fos = new FileOutputStream(ExcelPath+"/Credentials123.xls");
	}
	public static void CreateRow(String SheetName,int Row) throws IOException
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.createRow(Row);
		fos = new FileOutputStream(ExcelPath+"/Credentials123.xls");
	}
	public static void GetRow(String SheetName,int Row) throws IOException
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Row);
		fos = new FileOutputStream(ExcelPath+"/Credentials123.xls");
	}
	public static void GetCell(String SheetName,int Row,int cel) throws IOException
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Row);
		row1.getCell(cel);
		fos = new FileOutputStream(ExcelPath+"/Credentials123.xls");
	}
	public static void SetCelVal(String SheetName,int Row,int cel,String celVal)
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Row);
		cel1 = row1.getCell(cel);
		cel1.setCellValue(celVal);
	}
	public static void CreateCel(String SheetName,int Row,int cel) throws IOException
	{
	sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Row);
		cel1 = row1.createCell(cel);
		fos = new FileOutputStream(ExcelPath+"/Credentials123.xls");
	}
	public static void WriteValue(String SheetName,int rowvalue,int celvalue,String Val) throws IOException
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(rowvalue);
		cel1 = row1.getCell(celvalue);
		cel1.setCellValue(Val);
		fos = new FileOutputStream(ExcelPath+"/Credentials123.xls");
		book.write(fos);
		fos.close();
	}
	
	public static XSSFSheet AccessSheet(String SheetName)
	{
		XSSFSheet AccessedSheet = book.getSheet(SheetName);
		return AccessedSheet;
	}
	
	
	
	
	

}
