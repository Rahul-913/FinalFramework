package com.OrangeHRM.RunnerScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.GenericScripts.BasePage;

public class SmokeTC01 extends BasePage
{
	@Test
	public void CheckAdminDashboard()
	{
		String ExpectedText = "Dashboard";
		String ActualText = homepage.CheckDashBoard().getText();
		Assert.assertEquals(ActualText, ExpectedText," The verification is unsuccessfull");
//		Assert.fail();
	}
	@Test
	public void CheckPIMPage()
	{
		homepage.ClickPIMButton().click();
		String ExpectedPage = "PIM";
		String ActualPage = homepage.CheckPIMPage().getText();
		Assert.assertEquals(ActualPage, ExpectedPage,"PIM page is not valid");
	}
//	
//	@Test
//	public void AddEmpBtn()
//	{
//		boolean res = homepage.VerifyAddEmpBtn().isEnabled();
//		Assert.assertTrue(res,"The element is not Enabled");
//		homepage.VerifyAddEmpBtn().click();
//		boolean res1 = homepage.VerifyAddEmpPage().isDisplayed();
//		Assert.assertTrue(res1,"The page is not disaplayed");
//	}
	
	
	
	
	
	
	
	
	

}
