package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class LoginPage extends TestBase{
	FlightsPage flightspage;
	//Page Factory
		@FindBy(name="userName")
		WebElement UserName;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(name="login")
		WebElement loginBtn;
			
		@FindBy(xpath="//a[text()='REGISTER']")
		WebElement registerBtn;
		
		@FindBy(xpath="//img[@src='/images/nav/logo.gif']")
		WebElement newtourslogo;
		
		/*@FindBy(xpath="//a[text()='REGISTER']")
		WebElement registerLink;*/
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateNewToursImage(){
			return newtourslogo.isDisplayed();
			
		}
		
		public FlightsPage login(String un, String pwd){
			UserName.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			
			return new FlightsPage();
			
		}
		
	/*	public void clickOnregisterLink(){
			registerLink.click();
		}*/
		
	

}
