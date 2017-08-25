package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import base.WdMethods;


public class Seleniumscript {
	
	
	
	public static void main(String[] arg)
	{
		
	//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	//System.setProperty("webdriver.gecko.driver", "./Drivers/chromedriver.exe");
	//WebDriver drivernew= new ChromeDriver();
	WebDriver drivernew= new InternetExplorerDriver();
	drivernew.get("http://leaftaps.com/opentaps");
	drivernew.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	drivernew.manage().window().maximize();
	drivernew.findElement(By.id("username")).sendKeys("DemoSalesManager");
	drivernew.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	drivernew.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	drivernew.findElement(By.className("decorativeSubmit")).click();
	
	drivernew.findElement(By.linkText("CRM/SFA")).click();
	drivernew.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	drivernew.findElement(By.linkText("Leads")).click();
	drivernew.findElement(By.linkText("Find Leads")).click();
	drivernew.findElement(By.xpath("//span[text()='Email']")).click();
	drivernew.findElement(By.name("emailAddress")).sendKeys("abc@mail.com");
	drivernew.findElement(By.xpath("//button[text()='Find Leads']")).click();
	drivernew.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String firstname=drivernew.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a")).getText();
	System.out.println(firstname);
	drivernew.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a")).click();
	drivernew.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	drivernew.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	drivernew.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String title= drivernew.findElement(By.id("sectionHeaderTitle_leads")).getText();
			if(title.equalsIgnoreCase("Duplicate Lead"))
			{
				System.out.println(title);
			}
			else
			{
				System.out.println("Failed");
			}
	drivernew.findElement(By.name("submitButton")).click();
	drivernew.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String checkname=drivernew.findElement(By.id("viewLead_firstName_sp")).getText();
	if(firstname.equalsIgnoreCase(checkname))
	{
		System.out.println("Verified");
	}
	else
	{
		System.out.println("Not verified");
	}
	drivernew.close();
	}

}
