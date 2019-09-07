package com.Eservices.Pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {

		WebDriver driver;
		
		
		public Loginpage(WebDriver driver) {
			this.driver=driver;
			
		}

		@FindBy(how = How.ID, using = "email")
		WebElement Username;
		
		@FindBy(how = How.ID, using = "password")
		WebElement Password;
		
		@FindBy(how = How.ID, using = "trouble")
		WebElement troubleLink;
		
		@FindBy(how = How.ID, using = "submit_login")
		WebElement Letsgo;
		
		
		public  void validlogin(String username,String password) {
			
			try {
			
		   System.out.println("from login page class:"+username+" : "+password);
			
		   Username.sendKeys(username);
			Password.sendKeys(password);
			Letsgo.click();
		
			}catch(ElementNotVisibleException e) {
				e.printStackTrace();
			}
		}
		
	
		
		
	}



