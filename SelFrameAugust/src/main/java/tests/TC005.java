package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.WdMethods;

public class TC005 extends TestNGAnnotations{
	
	
	@Test
	public void test() throws InterruptedException
	{
		//invokeApp("chrome", "http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id","password"),"crmsfa");
		click(locateElement("classname", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name","emailAddress"),"abc@mail.com");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(5000);
		String firstname=getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		click(locateElement("xpath", "//a[text()='Duplicate Lead']"));
		String title=getText(locateElement("id", "sectionHeaderTitle_leads"));
		if(title.equalsIgnoreCase("Duplicate Lead"))
		{
			System.out.println(title+" Verified successfully");
		}
		else
		{
			System.out.println("Failed");
		}
		click(locateElement("name", "submitButton"));
		String checkname=getText(locateElement("id", "viewLead_firstName_sp"));
		if(firstname.equalsIgnoreCase(checkname))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not verified");
		}
		//quitApp();
		
	}
	
	

}
