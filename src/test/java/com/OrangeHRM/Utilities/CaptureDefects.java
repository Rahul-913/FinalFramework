package com.OrangeHRM.Utilities;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.OrangeHRM.GenericScripts.ApplicationConstants;

public class CaptureDefects implements ApplicationConstants
{
	public static void GetDefects(WebDriver driver,String Filename) throws Exception
	{
		Date d = new Date();
		String d1 = d.toString().replace(":","-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(DefectsPath+d1+Filename+".png");
		FileHandler.copy(temp, perm);
	}

}
