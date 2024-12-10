package com.OrangeHRM.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//declaration
	@FindBy(name = "username")
	private WebElement usnTF;
	@FindBy(name = "password")
	private WebElement pswTF;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement enterUsn()
	{
		return usnTF;
	}
	public WebElement enterPsw()
	{
		return pswTF;
	}
	public WebElement clickLoginBtn()
	{
		return loginBtn;
	}
	
	
	
	
	
	//utilization

}
