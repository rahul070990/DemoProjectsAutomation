package com.adidas.base;

import java.util.logging.Logger;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.adidas.utility.ExcelSheetUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {

	public ExcelSheetUtility excelUtil=null;
	String userDir=System.getProperty("user.dir");
	String testdataFile="\\testdata\\testdata_TS01 (2).xlsx";	
	String strExtentReportPath = "\\test-output\\testreport\\testReport.html";
	public static ExtentReports report = null;
	public static ExtentTest test = null;
	protected Logger logger = Logger.getLogger(BaseClass.class.getName());
	
	
	@BeforeSuite	
	public void init() {		
		excelUtil=new ExcelSheetUtility(testdataFile);
		System.out.println("Ininitializing test data sheet..");
		initReport();
		
	}
	@AfterSuite
	public void closeReport() {
		
		endReport();
		
	}
	/**
	 * 
	 * initReport() function is for test reporting purpose
	 * 
	 */
	public void initReport() {
		String strReportName = userDir + strExtentReportPath;
		report = new ExtentReports(strReportName);
		test = report.startTest("CA Automation - Test Report");
		report.addSystemInfo("Browser Name", "Chrome");
		report.addSystemInfo("Project Name", "CA Test Automation");

	}

	/**
	 * 
	 * This function is for testing purpose
	 * 
	 */
	public void endReport() {
		report.endTest(test);
		report.flush();

	}
	
	
	
}
