package com.orangehrmlive.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.base.BaceClass;

public class LoginPage extends BaceClass {
	
	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//p[text() = 'Username : Admin']") private WebElement username;
	@FindBy (name="username") private WebElement uname;
	@FindBy(xpath = "//p[text() = 'Password : admin123']") private WebElement password;
	@FindBy (name="password") private WebElement pass;
	@FindBy (xpath="//button[@type='submit']") private WebElement loginbutton;
	
	
	public String getUsername() 
	{
		
		 String ui= username.getText();
		 System.out.println(ui);
		return ui.substring(ui.indexOf(":"),ui.length()-1);
	}
	
	public String getPassword() 
	{
		
		 String pw = password.getText();
		 System.out.println(pw);
		 
		 return pw.substring(pw.indexOf(":"));
	}
	
	public void setUsername(String setUsername) 
	{
		uname.sendKeys(setUsername);
	}
	
	public void setPassword(String setPassword) 
	{
		pass.sendKeys(setPassword);
	}
	
	public LoginPage clickonLoginbutton()
	{
		click(loginbutton);
		System.out.println("Clicked on Login Button");
		return this;		
	}

	
 
}
