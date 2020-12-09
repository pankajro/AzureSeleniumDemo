package com.project.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id = "site-header__login")	 
	WebElement loginButtonElement;
	
	@FindBy(css = ".Dropdown__menu--open > li:nth-child(1) > a:nth-child(1)")
	WebElement travelerLoginElement;
	
	@FindBy(id = "lex-emailAddress")
	WebElement usernameElement;
	
	@FindBy(css = "#lex-initial-button > span")
	WebElement getstartedElement;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement passwordElement;
	
	//@FindBy(className = "btn-primary")
	@FindBy(css = "button[label='Log in']")
	WebElement submitElement;
	
	@FindBy(id = "react-destination-typeahead")
	WebElement searchKeywordElement;
	
	@FindBy(css = ".form-combined__input1 > div.picker__overlay--selectable")
	WebElement startDateElement;

	@FindBy(css = "div.month:nth-child(3) .clickable.top.first-day")
	WebElement arrivalDateElement;

	@FindBy(css = "div.month:nth-child(3) .clickable.last.day")
	WebElement departureDateElement;
	
	@FindBy(css = "button[label='Increase Adults']")	
	WebElement guestSelectorElement;
	
	@FindBy(css = ".SearchForm__button")
	WebElement submitButtonElement;	
		
	public void login()
	{
		loginButtonElement.click();
	}
	
	public void travelerLogin()
	{
		travelerLoginElement.click();
	}
	
	public void username(String userName)
	{
		usernameElement.sendKeys(userName);
	}
	
	public void getStarted()
	{
		getstartedElement.click();
	}
	
	public void password(String password)
	{
		passwordElement.sendKeys(password);	
	}
	
	public void submit()
	{
		submitElement.click();
		try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
	}
	
	public void searchKeyword(String keyword)
	{
		searchKeywordElement.sendKeys(keyword);
	}
	
	public void startDate()
	{
		startDateElement.click();
	}
	
	 public void arrivalDate()
	 {
		 arrivalDateElement.click();
		 	try {
					Thread.sleep(5000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}				
			}
	 
	 public void departureDate()
	 {
		 departureDateElement.click();
	 }
	 
	 public void guestSelector()
	 {
		 guestSelectorElement.click();
		 guestSelectorElement.click();
	 }
	 
	 public SearchPage submitButton()
	 {
		 submitButtonElement.click();
		 return new SearchPage(driver);
	 }	 
}

