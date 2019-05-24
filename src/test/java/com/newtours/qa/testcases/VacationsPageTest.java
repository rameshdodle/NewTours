package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.FlightsPage;
import com.newtours.qa.pages.LoginPage;
import com.newtours.qa.pages.VacationsPage;

public class VacationsPageTest extends TestBase {
	LoginPage loginpage;
	VacationsPage vacationsPage;
	FlightsPage flightspage;
	public VacationsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage=new LoginPage();
		flightspage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		vacationsPage=flightspage.clickOnVacationsLink();
		
		
	}
	
/*	@Test
	public void validateVacationsLinkTest(){
		vacationsPage.clickingOnVactionLink();
		System.out.println("vacations links clicked successfully");
	}
	*/
	@Test
	public void validatevacationsPageTitleTest(){
		String title=vacationsPage.validateVacationsPageTitle();
		Assert.assertEquals(title, "Under Construction: Mercury Tours", "title not found");
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
