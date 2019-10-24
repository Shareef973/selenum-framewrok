package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.passwdchangePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class uniformvalidcredentials_UFM_007 {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
	}
	

	 @BeforeMethod
	  public void setUp() {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			baseUrl = properties.getProperty("baseURL");
			driver.get(baseUrl);
	  }
  
	 
	 
	 @Test
  public void maintest() {
		 
		passwdchangePOM test=new  passwdchangePOM(driver);
		
		test.emali("neha@gmail.com");
		test.enterpassword("Neha123");
		test.Click();
		
		test.clickpasswordpage();
		test.sendPassword("sneha");
		test.confirmPassword("men ha");
		test.contin();
		 
  }
 

  @AfterMethod
  public void checkmessage() {
	  
	  try {
			assertEquals("Password confirmation does not match password!",
					driver.findElement(By.xpath("//div[@class='text-danger']")).getText());
			
	  
	  } catch (Error e) {
			System.out.println(e);
			driver.close();
			}
		
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test executed succesfully");
	  driver.close();
  }

}
