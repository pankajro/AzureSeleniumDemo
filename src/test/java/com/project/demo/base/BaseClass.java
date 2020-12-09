package com.project.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utilities.Log;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected WebDriver driver;
	
	@BeforeClass
	public void open()
	{
		Log.startLog("InquiryTest is Starting");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Log.info("Opening Homeaway Website");
		driver.get("https://www.homeaway.com");
		Log.info("Chrome Browser is opened");
		driver.manage().window().maximize();
		Log.info("Browser is maximized");
	}
	
	@AfterClass
	public void end()
	{
		Log.endLog("InquiryTest is Ending");
		driver.quit();
	}
}
