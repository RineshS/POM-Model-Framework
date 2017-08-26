package pageTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import dataProvider.ExcelDataProvider;
import pageFactory.CreateLead;
import pageFactory.HomePage;

public class CreateLeadTestCase extends TestNGAnnotations{
	
	
	@BeforeClass
	public void setValues(){
		excelName= "TC001";
		sheetName= "Create";
	}
	@Test(dataProvider = "fetchData")
	public void createLeadTestCase(String userName,String passWord,String cName,
			String fName,String lName,String pNumber,String emailID){
		new HomePage()
		.typeUserName(userName)
		.typeUserPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickcreateleadLink()
		.typeCompName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.selectSource()
		.selectMarketCampaignId()
		.typePhoneNumber(pNumber)
		.typeMailId(emailID)
		.clickCreateLeadButton()
		.checkLeadID();
	}
	
	/*@DataProvider(name = "LeadData")
	public static Object[][] getValue() throws IOException{
		
		return ExcelDataProvider.getDataFromExcel("TC001","Create");
		return new Object[][]{
		{"DemoSalesManager","crmsfa","TestLeaf","shahid","afridi","345267509","hello@testleaf.com"}};
			
		}*/

}
