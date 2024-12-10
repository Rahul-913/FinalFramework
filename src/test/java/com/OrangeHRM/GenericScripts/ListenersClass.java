package com.OrangeHRM.GenericScripts;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.OrangeHRM.Utilities.CaptureDefects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersClass implements ITestListener
{
	ExtentSparkReporter sparkReporter;
	ExtentReports reports;
	public void onStart(ITestContext context)
	{
		Date d = new Date();
		String d1 = d.toString().replace(":","-");
		sparkReporter = new ExtentSparkReporter("./Reports/ExtentReport"+d1+".html");
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setDocumentTitle("ExecutionReport");
		sparkReporter.config().setReportName("BUILB01");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("OS","win");
		reports.setSystemInfo("Browser1","Chrome");
		reports.setSystemInfo("Browser2","Firefox");
		reports.setSystemInfo("TesterName","TE001");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.PASS,result.getName()+" is success" );
	}
	public void onTestFailure(ITestResult result,WebDriver driver) throws Exception
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.FAIL,result.getName()+" is fail" );
		test.log(Status.FAIL,result.getThrowable()+" is fail" );
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.SKIP,result.getName()+" is skipped" );
		test.log(Status.SKIP,result.getThrowable()+" is fail" );
		
	}
	public void onFinish(ITestContext context)
	{
		reports.flush();
	}

}
