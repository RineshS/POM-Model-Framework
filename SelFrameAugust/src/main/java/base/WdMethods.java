package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WdMethods extends WdEventListenerCalls {
	
	WebDriver driver;
	public static EventFiringWebDriver eventDriver;
	
	/**This method is used to locate the elements
	 *Ex: locateElement("id","username")
	 * @param eleType - Locator of the element is passed
	 * @param using - Value of the locator
	 * @return ele
	 */
	public WebElement locateElement(String eleType,String using){
		
		WebElement ele = null;
		switch(eleType){
		case ("id") :
			ele = eventDriver.findElement(By.id(using));
		    break;
		case ("name") :
			ele = eventDriver.findElement(By.name(using));
		    break;
		case ("classname") :
			ele = eventDriver.findElement(By.className(using));
		    break;
		case ("tagname") :
			ele = eventDriver.findElement(By.tagName(using));
		    break;
		case ("linktext") :
			ele = eventDriver.findElement(By.linkText(using));
		    break;
		case ("partiallinktext") :
			ele = eventDriver.findElement(By.partialLinkText(using));
		    break;
		case ("xpath") :
			ele = eventDriver.findElement(By.xpath(using));
		    break;
		case ("cssSelector") :
			ele = eventDriver.findElement(By.cssSelector(using));
		    break;
		case ("type") :
		ele = eventDriver.findElement(By.xpath("//*[@type='"+using+"']"));
		    break;
		/*case ("cssSelector") :
			ele = eventDriver.findElement(By.cssSelector(using));
		    break;*/
		default:
			System.out.println("The given locator"+eleType+"is not correct");
			break;
		}
		return ele;
		
	}
		
		public void type(WebElement ele,String value){
			ele.sendKeys(value);	
		}
		
		public void click(WebElement ele){
			ele.click();
		}
		
		public void selectByIndex(WebElement ele,int value){
			Select dp = new Select(ele);
			dp.selectByIndex(value);
		}
		
		public void selectByValue(WebElement ele,String value){
			Select dp = new Select(ele);
			dp.selectByValue(value);
		}
		
		public void selectByVisibleText(WebElement ele,String value){
			Select dp = new Select(ele);
			dp.selectByVisibleText(value);
		}
		
	 public void  switchToWindow(int index){
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 List<String> allWindows = new ArrayList();
		 allWindows.addAll(allWindowHandles);
		 eventDriver.switchTo().window(allWindows.get(index));	 
	 }
	 
	 public void alertAccept(){
		 eventDriver.switchTo().alert().accept();
	 }
	 
	 public void alertDismiss(){
		 eventDriver.switchTo().alert().dismiss();
	 }
	 
	 public String alertText(){
		 String text = eventDriver.switchTo().alert().getText();
		 return text;
	 }
	 
	 public void alertType(String value){
		 eventDriver.switchTo().alert().sendKeys(value);
	 }
	 
	 public void switchFrame(WebElement ele){
		 eventDriver.switchTo().frame(ele);
	 }
	 
	 public boolean verifyTitle(String givenTitle){
		 String actualTitle = driver.getTitle();
		 if(actualTitle.equalsIgnoreCase(givenTitle)){
			 System.out.println("The Title is verified");
			 return true;
		 }
		 else{
			 System.out.println("The Title is not correct");
			 return false;
		 }
	 }
	 
	 public String getAttribute(WebElement ele,String value){
		 String text = ele.getAttribute(value);
		 return text;
	 }
	 
     public String getText(WebElement ele){
    	 String text = ele.getText();
    	 return text;
     }
     
     public boolean verifyText(WebElement ele,String value){
    	String expectedVal = ele.getText();
    	boolean finValue;
    	if(value.equalsIgnoreCase(expectedVal)){
    		System.out.println("The Text is verified");
    		finValue = true;
    	}
    	else{
    		System.out.println("The Text is not correct");
    		finValue = false;
    	}
    	return finValue;	
     }
     
     public void takeSnap(){
    	 
     }
     
     /**
      * The method will launch the application in the specified browser
      * and load the given URL
      * @author Rinesh S
      * @param browser - It can chrome or ie or firefox
      * @param url - It shall be specified as http or https or file
      */
     
     public void invokeApp(String browser, String url){
    	switch(browser){
    	case ("ie"):
    		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
    	    driver = new InternetExplorerDriver();
    	    break;
    	
     case ("chrome"):
 		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 	    driver = new ChromeDriver();
 	    break;
 	    
     case ("firefox"):
  		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
  	    driver = new FirefoxDriver();
  	    break;
    	
    default:
    	System.out.println("The given browser"+browser+"is not loaded successfully");
    	}
    	eventDriver = new EventFiringWebDriver(driver);
        WdMethods handler = new WdMethods();
        eventDriver.register(handler);
        eventDriver.get(url);
        eventDriver.manage().window().maximize();
        //eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
     }
     
     public void quitApp(){
    	 eventDriver.quit();
}
     public void closeWindow(){
    	 eventDriver.close();
}
     
}
