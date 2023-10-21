package com.orangehrmlive.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.base.BaceClass;

public class AddEmployee extends BaceClass {
		
	public AddEmployee(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath="//input[@placeholder='First Name']") private WebElement firstname;
	@FindBy (xpath="//input[@placeholder='Middle Name']") private WebElement middlename;
	@FindBy (xpath="//input[@placeholder='Last Name']") private WebElement lastName;
	@FindBy (xpath="//button[@type='submit']") private WebElement save;	
	@FindBy (xpath="//a[text()='Employee List']") private WebElement emplist;
	
	
	public AddEmployee enterFirstname()
	{
		sendKeys (firstname, "Isha");
		System.out.println("Entered Firstname");
		return this;		
	}
	public AddEmployee enterMiddlename()
	{
		sendKeys (middlename, "Deepak");
		System.out.println("Entered Middlename");
		return this;		
	}
	public AddEmployee enterLastname()
	{
		sendKeys (lastName, "Joshi");
		System.out.println("Entered Lastname");
		return this;		
	}
	public AddEmployee clickonSavebutton()
	{
		click(save);
		System.out.println("Clicked on Save Button");
		return this;		
	}
	public AddEmployee clickonEmployeeList()
	{
		click(emplist);
		System.out.println("Clicked on Employee List");
		return this;		
	}
	

}
