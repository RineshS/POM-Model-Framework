package base;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import dataProvider.ExcelDataProvider;

public class TestNGAnnotations extends WdMethods {
	public static String excelName;
	public static String sheetName;
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite method");
	}
	
	@BeforeTest
public void beforeTest() {
		System.out.println("Before Test method");
}
	
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups method");
	}
	
	/*@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class method");
	}
	*/
	@DataProvider(name = "fetchData")
	public static Object[][] getValue() throws IOException{
		
		return ExcelDataProvider.getDataFromExcel(excelName,sheetName);
	}
	
	@BeforeMethod
    public void beforeMethod() {
		invokeApp("chrome","http://leaftaps.com/opentaps");

}   
	@AfterMethod
	public void afterMethod() {
		quitApp();

	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class method");

	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups method");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test method");

	}
	
	@AfterSuite
	private void afterSuite() {
		System.out.println("After Suite method");

	}
	
}
