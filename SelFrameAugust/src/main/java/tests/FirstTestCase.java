package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Using chrome driver
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();*/		
		
		
		//Using IE Driver
		
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("crmsfa");       
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
      
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("bb");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //driver.findElement(By.name("firstName")).sendKeys("yassar");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("View Lead | opentaps CRM")){
        	driver.findElement(By.linkText("Edit")).click();
        	driver.findElement(By.id("updateLeadForm_companyName")).clear();
        	
        	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Glencore");
        	driver.findElement(By.xpath("//input[@value='Update']")).click();
        	
        	
        	String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        	
        	if(companyName.contains("Glencore")){
        		System.out.println("The Company Name is updated");
        	}
        }
        else{
        	System.out.println("The Title did not match");
        }

        driver.close();       	
	}
}
