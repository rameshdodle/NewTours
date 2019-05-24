package com.newtours.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class DestinationsPage extends TestBase{
	
	
	public DestinationsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatedestinationsPageTitle(){
		return driver.getTitle();
	}

}
