package tests;

import org.testng.annotations.Test;

import base.WdMethods;

public class TC003 extends WdMethods {


		@Test
		public void TestCase() throws InterruptedException
		{
		//invokeApp("chrome", "http://leaftaps.com/opentaps/");
		type(locateElement("XPath","//input[@id='username']"),"DemoSalesManager");
		type(locateElement("XPath", "//input[@id='password']"),"crmsfa");
		click(locateElement("XPath", "//input[@class='decorativeSubmit']"));
		click(locateElement("LinkText","CRM/SFA"));
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Find Leads"));
		click(locateElement("XPath","//span[text()='Phone']"));
		type(locateElement("XPath","//input[@name='phoneCountryCode']"),"91");
		type(locateElement("XPath","//input[@name='phoneNumber']"),"9840495772");
		click(locateElement("XPath","//button[text()='Find Leads']"));
		Thread.sleep(5000);
		String Str=getText(locateElement("XPath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("XPath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("XPath","//a[text()='Delete']"));
		click(locateElement("LinkText","Find Leads"));
		type(locateElement("XPath","//input[@name='id']"),Str);
		click(locateElement("XPath","//button[text()='Find Leads']"));
		//quitApp();
		}
	}


