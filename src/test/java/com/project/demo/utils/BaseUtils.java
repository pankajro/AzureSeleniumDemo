package com.project.demo.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseUtils {

	public static void selectElementFromDropdown(WebElement element, String value)
	{
	Select select = new Select(element);
	select.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value)
	{
	Select select = new Select(element);
	select.selectByVisibleText(value);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
	Select select = new Select(element);
	select.selectByValue(value);
	}
	
	public static void mousehover(WebDriver driver, WebElement element)
	{
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	}    
}
