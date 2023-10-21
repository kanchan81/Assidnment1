package com.orangehrmlive.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaceClass {
	
	public static WebDriver driver;
	public Properties prop;
	
	
	public WebDriver browserSetup(String url) throws Exception  {
		
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Properties\\Config.Properties");
			prop.load(fis);
			
			String browserName = prop.getProperty("browser");
			if (browserName.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			driver.get(prop.getProperty(url));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			
			throw e;
		}
		
		
		return driver;
		
	}
	public void waitForVisibility(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void waitUntilElementIsClickable(WebElement e)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		
	}
	public void click(WebElement e)
	{
		waitForVisibility(e);
		waitUntilElementIsClickable(e);
		e.click();		
	}
	public void sendKeys(WebElement e,String text)
	{
		waitForVisibility(e);
		e.sendKeys(text);
	}
	
	public void scrollInToView(WebElement e, int up, int down)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy ("+up+","+down+")");
	}

}
