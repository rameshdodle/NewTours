package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class FlightsPage extends TestBase{
	LoginPage loginpage;
	FlightsPage flightspage;
	
	//Page Factory
	@FindBy(xpath="//input[@name='tripType' and @value='oneway']")
	WebElement onewayBtn;
	
	@FindBy(xpath="//input[@type='radio' and @value='Business']")
	WebElement BusinessClassBtn;
	
	@FindBy(xpath="//a[text()='Vacations']")
	WebElement vacationslink;
	
	@FindBy(xpath="//a[text()='Destinations']")
	WebElement destinationslink;
	
	public FlightsPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateFlightsPageTitle(){
		return driver.getTitle();
	}
	
	public void clickOneWayRadioBtn(){
		onewayBtn.click();
		//return; 
		
	}
	public  void clickBusinessclassBtn(){
		BusinessClassBtn.click();
		//return;
		
	}
	public VacationsPage clickOnVacationsLink(){
		vacationslink.click();
		return new VacationsPage();
		
	}
	public DestinationsPage clickOnDestinationsLink(){
		destinationslink.click();
		return new DestinationsPage();
		
	}


}
