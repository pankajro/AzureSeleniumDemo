package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
 WebDriver driver;
 
 public SearchPage(WebDriver driver) 
   {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	}
 
@FindBy(css = "div.Hit:nth-child(2) > div:nth-child(2) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h4:nth-child(1)")
 //@FindBy(css = ".HitCollection > div:nth-child(1) > a:nth-child(2) > div")
 WebElement firstPDP;
 

public PropertyDetailsPage selectPDP()
 {
	firstPDP.click();	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(String winHandle:driver.getWindowHandles()){
	    driver.switchTo().window(winHandle); 
	}
	return new PropertyDetailsPage(driver);		
 }
}
