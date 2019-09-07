package com.Eservices.WebBase;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebBase {

		public static  WebDriver driver=null;
		public static WebDriverWait wait;
		public static WebElement wElement;
		

		public static WebDriver getdriver()
		
		{
		if (driver == null){

		return driver;
		}else
			
		
		return driver;
		}
		
		
		public static WebElement elementToBeVsible(WebElement element,WebDriver driver) {
			
			wait = new WebDriverWait(driver, 40);
	
			wElement=wait.until(ExpectedConditions.visibilityOf(element));
			
			return wElement;
		}
		
		public static boolean waitForElementToAppear(WebDriver driver, String element) throws TimeoutException {
			boolean webElementPresence = false;
			try {
				
				//System.out.println("Policy type: "+element.toString());
				
				By locator=By.xpath(element);
				
				
				@SuppressWarnings("deprecation")
				Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
						.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				if (driver.findElement(locator).isDisplayed()) {
					webElementPresence= true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return webElementPresence;
		}
		
	}

	

