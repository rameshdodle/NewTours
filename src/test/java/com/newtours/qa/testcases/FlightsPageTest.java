package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.FlightsPage;
import com.newtours.qa.pages.LoginPage;

public class FlightsPageTest extends TestBase{
	
	LoginPage loginpage;
	FlightsPage flightspage;
	public FlightsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage=new LoginPage();
		flightspage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void validateFlightsPageTitleTest(){
		String title=flightspage.validateFlightsPageTitle();
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:", "title not found");
	}
	
	@Test
	public void clickOneWayRadioBtnTest(){
		flightspage.clickOneWayRadioBtn();
		System.out.println("button clicked ");
		//retun true;
	}
	
	@Test
	public void clickBusinessclassBtnTest(){
		flightspage.clickBusinessclassBtn();
		System.out.println("button clicked successfully");
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
