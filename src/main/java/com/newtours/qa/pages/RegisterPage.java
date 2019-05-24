package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class RegisterPage extends TestBase{
	
	
	//page factory
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement registerLink;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstNametextbox;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastNametextbox;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonetextbox;
	
	public RegisterPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
		public void clickOnregisterLink(){
			registerLink.click();
		}
		
		public void newUserRegistraion(String ftName, String ltName, String phone){
			firstNametextbox.sendKeys(ftName);
			lastNametextbox.sendKeys(ltName);
			phonetextbox.sendKeys(phone);
			
		}

}
