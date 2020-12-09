package com.project.demo.pages;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertyDetailsPage 
{
	WebDriver driver;

	public PropertyDetailsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".owner-details-mini > button")	 
	WebElement inquiryButtonElement;
	
	//@FindBy(css = "div.form-group:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")
		
	@FindBy(id = "react-input-tel__input")
	WebElement mobileNumberElement;
	
	@FindBy(id = "contact-owner-form__comments")
	WebElement enterMessageElement;
	
	@FindBy(id = "inquiry-btn-send")
	WebElement sendElement;	
	
	@FindBy(css = ".Modal__close-btn")
	WebElement closeModalElement;
			
	public void inquiryButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@class,'owner-details-mini')]//button"))));
		driver.findElement(By.xpath("//div[contains(@class,'owner-details-mini')]//button")).click();		
   	}
		
	public void enterMobileNumber(String mobileNumber)
	{
		mobileNumberElement.sendKeys(mobileNumber);
	}	
	
	public void enterMessage(String message)
	{
		enterMessageElement.sendKeys(message);	
	}
	
	public void send()
	{
		sendElement.click();
	}	
	
	public void closeModal()
	{
		closeModalElement.click();
	}
}
