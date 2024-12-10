package com.OrangeHRM.GenericScripts;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyValue implements ApplicationConstants
{
	public static Properties ReadProperty() throws Exception
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(PropertyPath);
		p.load(fis);
		return p;
	}

}
