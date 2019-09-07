package com.Eservices.Pages;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Eservices.WebBase.WebBase;

public class FeaturePage extends WebBase {
	
	WebDriver driver;
	public WebElement Welement;
	public boolean bool=false;
	
	public FeaturePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public  String PolicyTypexpath= ".//span[@class='es-policy-title-info-big-blue']";
	
	@FindBy(how = How.ID, using = "hi-tittle")
	WebElement Firstname;
	
	@FindBy(how=How.XPATH, using=".//span[@class='es-policy-title-info-big-blue']")
	WebElement PolicyType;
	
	@FindBy(how=How.XPATH, using=".//span[@class='es-policy-title-info-big-black']")
	WebElement PolicyNumber;
	
	@FindBy(how=How.XPATH, using=".//div[@id='es-id-term-select-holder']/ul/li[@ng-model='selectedPolicyTerm']/span[@class='term-text']")
	WebElement Policydate;
	
	@FindBy(how=How.ID, using="es-policy-primary-addr")
	WebElement PolicyHolderAddress;
	
	
	public  void showtext() throws TimeoutException {
		
		
		//Welement=elementToBeVsible(PolicyType, driver);
		
		bool=waitForElementToAppear(driver,PolicyTypexpath);
		
		if(bool == true) {
		System.out.println(PolicyType.getText());
		}
		
	}
	
	
	
	
	
	
	
	

}
