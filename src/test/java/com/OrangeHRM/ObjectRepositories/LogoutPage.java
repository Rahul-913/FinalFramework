package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath = "//li[@class='oxd-userdropdown']")
	private WebElement logoutDropdown;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutBtn;
	//initialization
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement clicklogoutDropdown()
	{
		return logoutDropdown;
	}
	public WebElement clicklogoutBtn()
	{
		return logoutBtn;
	}

}
