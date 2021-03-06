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
	public HomePage typeUserName(String userName){
		type(uName,userName);
		return this;
	}
	
	@FindBy(how = How.ID,using = "password")
	WebElement pWord;
	public HomePage typeUserPassword(String passWord){
		type(pWord,passWord);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME,using = "decorativeSubmit")
	WebElement logButton;
	public CreateLead clickLogin(){
		click(logButton);
		return new CreateLead();
	}
	
}
