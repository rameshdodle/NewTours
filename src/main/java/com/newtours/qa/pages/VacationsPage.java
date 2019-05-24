package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.newtours.qa.base.TestBase;

public class VacationsPage extends TestBase{
	//FlightsPage flightspage;
	//VacationsPage vacationsPage; 
	        //Page Factory
			/*@FindBy(name="userName")
			WebElement UserName;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(name="login")
			WebElement loginBtn;
			
			@FindBy(xpath="//a[text()='Vacations']")
			WebElement vacationslink;
			*/
			public VacationsPage(){
				PageFactory.initElements(driver, this);
			}
			
			//Actions
			/*public VacationsPage clickingOnVactionLink(){
				 vacationslink.click();
				return new VacationsPage();
			}*/
			
			public String validateVacationsPageTitle(){
				return driver.getTitle();
			}

}
