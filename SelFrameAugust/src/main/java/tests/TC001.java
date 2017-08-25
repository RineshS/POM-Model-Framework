package tests;

import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.WdMethods;

public class TC001 extends TestNGAnnotations {

	@Test
	public void test(){
		//invokeApp("chrome","http://leaftaps.com/opentaps");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("type", "submit"));
		//click(locateElement("classname", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Create Lead"));
		boolean b = verifyTitle("Create Lead | opentaps CRM");
		if(b){
		type(locateElement("id", "createLeadForm_companyName"),"Testleaf");
		type(locateElement("id", "createLeadForm_firstName"),"Asif");
		type(locateElement("id", "createLeadForm_lastName"),"Ahmed");
		selectByValue(locateElement("name", "dataSourceId"),"LEAD_CONFERENCE");
		selectByValue(locateElement("name", "marketingCampaignId"),"CATRQ_CARNDRIVER");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"),"2345678");
		type(locateElement("id", "createLeadForm_primaryEmail"),"xyz@testleaf.com");
		click(locateElement("classname", "smallSubmit"));
		String s= getText(locateElement("id", "viewLead_companyName_sp")).trim().replace("Testleaf", "").replace("()","");
		System.out.println(s);
		//quitApp();
		System.out.println(" Verified successfully");
		}
		else{
			System.out.println("Failed successfully");
		}
	}
}
