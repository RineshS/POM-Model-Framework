package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLead extends AbstractPage{

	public CreateLead(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	WebElement crmsfaLink;
		public CreateLead clickcrmsfa(){
		click(crmsfaLink);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement createLead;
	public CreateLead clickcreateleadLink(){
		click(createLead);
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement compName;
	public CreateLead typeCompName(String cName){
		type(compName, cName);
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement firstName;
	public CreateLead typeFirstName(String fName){
		type(firstName, fName);
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement lastName;
	public CreateLead typeLastName(String lName){
		type(lastName, lName);
		return this;
	}
	
	@FindBy(how=How.NAME, using="dataSourceId")
	WebElement source;
	public CreateLead selectSource(){
		selectByValue(source, "LEAD_CONFERENCE");
		return this;
	}
	
	@FindBy(how=How.NAME, using="marketingCampaignId")
	WebElement marketCampaign;
	public CreateLead selectMarketCampaignId(){
		selectByValue(marketCampaign, "CATRQ_CARNDRIVER");
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	WebElement phoneNum;
	public CreateLead typePhoneNumber(String pNumber){
		type(phoneNum, pNumber);
		return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	WebElement emailID;
	public CreateLead typeMailId(String emaidId){
		type(emailID, emaidId);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME,using = "smallSubmit")
	WebElement createSubmit;
	public ViewLead clickCreateLeadButton(){
		click(createSubmit);
		return new ViewLead();
	}
	
}
