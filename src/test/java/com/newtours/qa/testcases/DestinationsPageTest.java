package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.DestinationsPage;
import com.newtours.qa.pages.FlightsPage;
import com.newtours.qa.pages.LoginPage;
//import com.newtours.qa.pages.VacationsPage;

public class DestinationsPageTest extends TestBase{
	LoginPage loginpage;
	//VacationsPage vacationsPage;
	DestinationsPage destinationsPage;
	FlightsPage flightspage;

	public DestinationsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage=new LoginPage();
		flightspage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		destinationsPage=flightspage.clickOnDestinationsLink();
	}
	
	@Test
	public void validatedestinationsPageTitleTest(){
		String title=destinationsPage.validatedestinationsPageTitle();
		Assert.assertEquals(title, "Under Construction: Mercury Tours");
		//String title=vacationsPage.validateVacationsPageTitle();
		//Assert.assertEquals(title, "Under Construction: Mercury Tours", "title not found");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
