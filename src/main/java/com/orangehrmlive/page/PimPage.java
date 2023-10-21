package com.orangehrmlive.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.base.BaceClass;

public class PimPage extends BaceClass {
	
	public PimPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
@FindBy (xpath= "//a[text()='Add Employee']") private WebElement ademp;

	
	public PimPage clickonAddEmployee() {
		click(ademp);
		System.out.println("Clicked on Add Employee");
		return this;
	}	
	
}