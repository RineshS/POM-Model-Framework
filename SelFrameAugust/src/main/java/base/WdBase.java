package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public interface WdBase {

public WebElement locateElement(String eleType,String using);
		
		public void type(WebElement ele,String value);
		public void click(WebElement ele);
		
		public void selectByIndex(WebElement ele,int value);
		
		public void selectByValue(WebElement ele,String value);
		
		public void selectByVisibleText(WebElement ele,String value);
		
	 public void  switchToWindow(int index);
	 
	 public void alertAccept();
	 public void alertDismiss();
	 
	 public String alertText();
	 
	 public void alertType(String value);
	 
	 public void switchFrame(WebElement ele);
	 
	 public boolean verifyTitle(String givenTitle);
	 
	 public String getAttribute(WebElement ele,String value);
     public String getText(WebElement ele);
     public boolean verifyText(WebElement ele,String value);
     
     public void takeSnap();
     public void invokeApp(String browser, String url);
     
     public void quitApp();
  
     public void closeWindow();  


}
