package com.orangehrmlive.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrmlive.base.BaceClass;
import com.orangehrmlive.page.DashboardPage;
import com.orangehrmlive.page.LoginPage;

public class DashboardTest extends BaceClass {
	
	public static WebDriver driver;
	public static LoginPage login;
	public static DashboardPage dash;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = browserSetup("url");
	}
	@Test
	public void clickonpim() {
		login = new LoginPage(driver);
		dash = new DashboardPage(driver);
		
		login.getUsername();
		login.getPassword();
		login.clickonLoginbutton();
		dash.clickonPIM();
		
	}

}
