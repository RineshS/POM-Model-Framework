package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.WdMethods;

public class TC002 extends TestNGAnnotations{

	@Test
	public void TC2() throws InterruptedException {
		
		//invokeApp("firefox", "http://leaftaps.com/opentaps");		
		type(locateElement("id", "username"), "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");	
		click(locateElement("xpath", "//input[@value='Login']"));		
		click(locateElement("link", "CRM/SFA"));		
		click(locateElement("link", "Leads"));		
		click(locateElement("link", "Find Leads"));	
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"),"bb");	
		click(locateElement("xpath", "//button[text()='Find Leads']"));	
		Thread.sleep(5000);
        click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        boolean b = verifyTitle("View Lead | opentaps CRM");
        if(b){     	
            click(locateElement("link", "Edit"));
            type(locateElement("id", "updateLeadForm_companyName"),"Glencore");
            click(locateElement("xpath", "//input[@value='Update']"));
        	String companyName = getText(locateElement("id", "viewLead_companyName_sp"));
        	if(companyName.contains("Glencore")){
        		System.out.println("The Company Name is updated");
        	}
        }
        else{
        	System.out.println("The Title did not match");
        }
		//quitApp();

	}

}
