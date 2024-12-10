package com.OrangeHRM.Utilities;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityObjects
{
	public static Actions MouseActions(WebDriver driver)
	{
		Actions action = new Actions(driver);
		return action;
	}
	
	public static Select HandleDropdown(WebElement element)
	{
		Select dropdown = new Select(element);
		return dropdown;
	}
	
	
	public static JavascriptExecutor HandleDisabledElement(WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		return js;
	}
	
	public static Robot KeyBoard() throws Exception
	{
		Robot r = new Robot();
		return r;
	}
	
	
	
	
	
	
	

}
