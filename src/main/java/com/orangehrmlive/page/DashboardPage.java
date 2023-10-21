package com.orangehrmlive.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.base.BaceClass;

public class DashboardPage extends BaceClass {
	
	public DashboardPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
	
	@FindBy (xpath= "//span[text()='PIM']") private WebElement pim;
	
	public DashboardPage clickonPIM() {
		click(pim);
		System.out.println("Clicked on PIM");
		return this;
		
	}

}
