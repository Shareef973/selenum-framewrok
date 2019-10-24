package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.passwdchangePOM;
import com.training.pom.productDetailsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class orderclear_UFM_009 {
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
  public void f() {
	 
	 passwdchangePOM test=new  passwdchangePOM(driver);
		
		test.emali("neha@gmail.com");
		test.enterpassword("Neha123");
		test.Click();
		
		productDetailsPOM shop=new productDetailsPOM(driver);
		shop.unif();
		shop.Premsckl();
		shop.Shirt();
		shop.sizeselect("38");
		 shop.cart();
			shop.chkcart();
			shop.cartview();
		  }
 

  @AfterMethod
  public void afterMethod() {
	  productDetailsPOM shop1=new productDetailsPOM(driver);
	 
	
		
		shop1.check();
		shop1.remove();
		

	  System.out.println("test finished");
	  
  }

  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

	
}
