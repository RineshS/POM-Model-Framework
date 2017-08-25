package pageTest;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.WdMethods;
import pageFactory.HomePage;

public class HomePageTestcase extends TestNGAnnotations{

	@Test
	public void homePageTestcase(){
		new HomePage()
		.typeUserName()
		.typeUserPassword()
		.clickLogin();

	}
	
	
	/*public Object[][] getData(){
		String[][] data = new String[2][2];
		data[0][0] = "";
		data[0][1] = "";
		data[1][0] = "";
		data[1][0] = "";
		return data;
	}*/
	
	@DataProvider(name = "Fetchdata")
	public Object[][] getValue(){
		return new Object[][]{
			{"DemoSalesManager","crmsfa"},{"user2","pass2"}};
			
		}
	}
	
	
	
