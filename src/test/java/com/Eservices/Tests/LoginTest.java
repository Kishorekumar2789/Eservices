package com.Eservices.Tests;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Eservices.BrowserFactory.Browserfactory;
import com.Eservices.Pages.FeaturePage;
import com.Eservices.Pages.Loginpage;

public class LoginTest {
	
	
		
		static WebDriver driver;
		
		Loginpage page;
		FeaturePage fpage;
		
		@BeforeTest
		public  void setup() {
			
			driver=Browserfactory.initaiteBrowser();
			page=PageFactory.initElements(driver, Loginpage.class);
			fpage=PageFactory.initElements(driver, FeaturePage.class);
			
		}
		
		/*@Test(dataProvider = "excelData", dataProviderClass=ExcelRead.class)
		public  void LoginvalidTest(String username,String password) {
			
			System.out.println("username is : "+username+"Password is "+password);
			
			//page.validlogin(username, password);
			page.validlogin("qaregression08@gmail.com", "QACoffee7");

		}*/
		@Test
		public void Getdetails() throws TimeoutException {
			
			page.validlogin("qaregression08@gmail.com", "QACoffee7");
			
			fpage.showtext();
			//driver.findElement(By.id("email")).sendKeys("qaregression08@gmail.com");
			//driver.findElement(By.id("password")).sendKeys("QACoffee7");
			
		}

	}



