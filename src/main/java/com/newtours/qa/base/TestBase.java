package com.newtours.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.newtours.qa.utility.TestUtil;
import com.newtours.qa.utility.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListner;
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\TestNG\\NewtoursdeamoutTest\\src\\main\\java\\com"
					+ "\\newtours\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
			
		
	}
	public static void initialization(){
		String browserName=prop.getProperty("browser");
		if(browserName.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else{
			System.out.println("No browser name");
		}
		e_driver=new EventFiringWebDriver(driver);
		eventListner =new WebEventListener();
		e_driver.register(eventListner);
		driver=e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
