package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");	
	}
	@Test(priority=2)
	public void NewToursImageTest(){
		boolean flag=loginpage.validateNewToursImage();
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void loginTest(){
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	

}
