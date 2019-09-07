package com.Eservices.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Eservices.WebBase.WebBase;

public class Browserfactory  {
		
		static WebDriver driver;
		private static String url="https://cimod.plymouthrock.com/eservice/#/login";
		private static String browser="chrome";
		
		public static WebDriver initaiteBrowser() {
			
			driver=WebBase.getdriver();
			
			if(browser.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			
			}
			
			return driver;
		}
		
		}



