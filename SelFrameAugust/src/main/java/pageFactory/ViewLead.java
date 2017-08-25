package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLead extends AbstractPage{

	public ViewLead(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement checkLeadID;
	public ViewLead checkLeadID(){
		String s= getText(checkLeadID);
		System.out.println(s);
		return this;
	}
	
}
