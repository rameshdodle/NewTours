package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.FlightsPage;
import com.newtours.qa.pages.LoginPage;
import com.newtours.qa.pages.RegisterPage;
import com.newtours.qa.pages.VacationsPage;
import com.newtours.qa.utility.TestUtil;

public class RegisterPageTest extends TestBase{
	
	LoginPage loginpage;
	RegisterPage registerpage; 
	String sheetName="RegisterPage";
	//VacationsPage vacationsPage;
	//FlightsPage flightspage;
	public RegisterPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		registerpage=new RegisterPage();
		//loginpage=new LoginPage();		
	}
	
	@DataProvider
	public Object[][] getNewToursTestdata(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(priority=1, dataProvider="getNewToursTestdata")
	public void clickOnregisterLinkTest(String firstname, String lastName, String phone){
		registerpage.clickOnregisterLink();
		//registerpage.newUserRegistraion("ram", "dom", "999999999");
		registerpage.newUserRegistraion(firstname, lastName, phone);
		//return new 	RegisterPage();
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
