package com.OrangeHRM.Utilities;

import org.openqa.selenium.WebElement;

public class HandlingDropdowns
{
	public static void SelectOption(WebElement element,Object value)
	{
		if(value instanceof Integer) 
		{
		UtilityObjects.HandleDropdown(element).selectByIndex((int) value);
		}
		else if (value instanceof String) 
		{
			try 
			{
				UtilityObjects.HandleDropdown(element).selectByValue((String) value);
			} 
			catch (Exception e) 
			{
				UtilityObjects.HandleDropdown(element).selectByVisibleText((String) value);
			}
		}
	}
		public static void DeSelectOption(WebElement element,Object value)
		{
			if(value instanceof Integer) 
			{
			UtilityObjects.HandleDropdown(element).deselectByIndex((int) value);
			}
			else if (value instanceof String) 
			{
				try 
				{
					UtilityObjects.HandleDropdown(element).deselectByValue((String) value);				} 
				catch (Exception e) 
				{
					UtilityObjects.HandleDropdown(element).deselectByVisibleText((String) value);
				}
			}
			else if(value.equals(null))
			{
				UtilityObjects.HandleDropdown(element).deselectAll();
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		switch(value)//12357435//khgkjgk
//		{
//		case "+value+":UtilityObjects.HandleDropdown(element).selectByIndex(0);
//		UtilityObjects.HandleDropdown(element).selectByValue(null);
//		UtilityObjects.HandleDropdown(element).selectByVisibleText(null);
//		}

	}

}
