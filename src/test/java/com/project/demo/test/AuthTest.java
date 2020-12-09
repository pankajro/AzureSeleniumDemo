package com.project.demo.test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.demo.base.*;
import com.project.demo.pages.HomePage;
import com.project.demo.pages.PropertyDetailsPage;
import com.project.demo.pages.SearchPage;
import com.utilities.Log;

@Listeners(com.project.demo.listener.ListenerTest.class)	

public class AuthTest extends BaseClass {
	
	@Test(priority = 0)
	public void InquiryTest() throws Exception
	{
	HomePage homePage = new HomePage(driver);
	Log.info("Homepage is opened");
	/*homePage.login();
	homePage.travelerLogin();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	homePage.username("tc@devmail.wvrgroup.internal");
	Log.info("Username Entered");
	homePage.getStarted();
	homePage.password("stage456");
	Log.info("Password Entered");
	homePage.submit();	
	homePage.searchKeyword(" Greenland");	
	Log.info("Destination Entered");
	homePage.startDate();
	Log.info("Arrival Date Entered");
	homePage.arrivalDate();
	homePage.departureDate();
	Log.info("Departure Date Entered");
	homePage.guestSelector();
	Log.info("guest Count Entered");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	SearchPage searchPage = homePage.submitButton();
	Log.info("Search Page is opened");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	PropertyDetailsPage propertyDetailsPage = searchPage.selectPDP();
	Log.info("Property Details Page is opened");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	propertyDetailsPage.inquiryButton();
	propertyDetailsPage.enterMobileNumber("512-512-1234");
	Log.info("Mobile Number Entered");
	propertyDetailsPage.enterMessage("Send Inquiry to Owner");
	Log.info("Message to Owner Entered");
	//propertyDetailsPage.send();
	//Log.info("Inquiry Sent Successfully");
	//Assert.assertTrue(true);
	//propertyDetailsPage.closeModal();
	}*/
  }
}