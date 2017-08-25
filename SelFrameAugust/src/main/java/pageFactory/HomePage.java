package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

	public HomePage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how = How.ID,using = "username")
	WebElement uName;
	public HomePage typeUserName(){
		type(uName,"DemoSalesManager");
		return this;
	}
	
	@FindBy(how = How.ID,using = "password")
	WebElement pWord;
	public HomePage typeUserPassword(){
		type(pWord,"crmsfa");
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME,using = "decorativeSubmit")
	WebElement logButton;
	public CreateLead clickLogin(){
		click(logButton);
		return new CreateLead();
	}
	
}
