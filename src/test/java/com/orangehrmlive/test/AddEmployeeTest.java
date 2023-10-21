package com.orangehrmlive.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrmlive.base.BaceClass;
import com.orangehrmlive.page.AddEmployee;
import com.orangehrmlive.page.DashboardPage;
import com.orangehrmlive.page.LoginPage;
import com.orangehrmlive.page.PimPage;

public class AddEmployeeTest extends BaceClass{
	
	
	public static WebDriver driver;
	public static LoginPage login;
	public static DashboardPage dash;
	public static PimPage pim;
	public static AddEmployee addemp;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = browserSetup("url");
	}
	@Test
	public void clickonaddEmployee() {
		login = new LoginPage(driver);
		dash = new DashboardPage(driver);
		pim = new PimPage(driver);
		addemp = new AddEmployee(driver);
		
		login.getUsername();
		login.getPassword();
		login.clickonLoginbutton();
		dash.clickonPIM();
		pim.clickonAddEmployee();
		addemp.enterFirstname();
		addemp.enterMiddlename();
		addemp.enterLastname();
		addemp.clickonSavebutton();
		addemp.clickonEmployeeList();
	}

}
