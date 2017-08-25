package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.WdMethods;

public class Testcase1 extends WdMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		/*System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	*/
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		driver.get("http://leaftaps.com/opentaps");	
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(10000);
		/*System.out.println(driver.findElementByClassName("decorativeSubmit").getAttribute("value"));
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Jacob");
		driver.findElementById("createLeadForm_lastName").sendKeys("Oram");
		Select dropdown = new Select(driver.findElementByName("dataSourceId"));
		dropdown.selectByValue("LEAD_CONFERENCE");
		Select dropdown1 = new Select(driver.findElementByName("marketingCampaignId"));
		dropdown1.selectByValue("CATRQ_CARNDRIVER");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2345678");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@testleaf.com");
		driver.findElementByClassName("smallSubmit").submit();
		String s = driver.findElementById("viewLead_companyName_sp").getText().trim().replace("Testleaf", "").replace("()","");
		System.out.println(s);
		driver.close();*/
	}
}
	
