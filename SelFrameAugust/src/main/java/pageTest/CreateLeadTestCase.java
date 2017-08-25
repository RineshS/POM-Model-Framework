package pageTest;

import org.testng.annotations.Test;

import base.TestNGAnnotations;
import pageFactory.CreateLead;
import pageFactory.HomePage;

public class CreateLeadTestCase extends TestNGAnnotations{
	
	@Test
	public void createLeadTestCase(){
		new HomePage()
		.typeUserName()
		.typeUserPassword()
		.clickLogin()
		.clickcrmsfa()
		.clickcreateleadLink()
		.typeCompName()
		.typeFirstName()
		.typeLastName()
		.selectSource()
		.selectMarketCampaignId()
		.typePhoneNumber()
		.typeMailId()
		.clickCreateLeadButton()
		.checkLeadID();
	}

}
