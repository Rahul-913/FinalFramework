package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//h6[.='Dashboard']")
	private WebElement Dashboard;
	@FindBy(xpath = "//span[.='PIM']")
	private WebElement PIMButton;
	@FindBy(xpath = "//h6[.='PIM']")
	private WebElement PIMMenu;
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement AddEmpButton;
	@FindBy(xpath = "//h6[.='Add Employee']")
	private WebElement AddEmpPage;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement CheckDashBoard()
	{
		return Dashboard;
	}
	public WebElement ClickPIMButton()
	{
		return PIMButton;
	}
	public WebElement CheckPIMPage()
	{
		return PIMMenu;
	}
	public WebElement VerifyAddEmpBtn()
	{
		return AddEmpButton;
	}
	
	public WebElement VerifyAddEmpPage()
	{
		return AddEmpPage;
	}

}
