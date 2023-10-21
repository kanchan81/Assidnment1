package com.orangehrmlive.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utilities.ExcelUtilities;
import com.orangehrmlive.base.BaceClass;
import com.orangehrmlive.page.LoginPage;


public class LoginTest extends BaceClass {
	
	public static void main(String[] args) throws Exception {		
		BaceClass bace = new BaceClass();
				bace.browserSetup("url");	}
	
	public static WebDriver driver;
	public static LoginPage login;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = browserSetup("url");
	}
	
	@Test
	public void login_with_Valid_Credentials() {
		login = new LoginPage(driver);
		
		login.getUsername();
		login.getPassword();
		login.clickonLoginbutton();
		
		String actualUrl = driver.getCurrentUrl();
	      String expectedUrl = "dashboard";
	      Assert.assertTrue(actualUrl.contains(expectedUrl));
	}
	
	@Test
	public void test_users() throws EncryptedDocumentException, IOException 
	{
		login = new LoginPage(driver);
       ExcelUtilities utility = new ExcelUtilities();
		
		Sheet sh = utility.read_Excel("Sheet1");
		
	    String key =  (String) utility.getSingleStringData(1, 0, sh);
		String value =(String) utility.getSingleStringData(1, 0, sh);
		login.clickonLoginbutton();
	}
	
	public void getDataFromExcel() throws EncryptedDocumentException, IOException {
		  ExcelUtilities utility = new ExcelUtilities();
		
		Sheet sh = utility.read_Excel("Sheet1");
		
	    String key =  (String) utility.getSingleStringData(1, 0, sh);
		String value =(String) utility.getSingleStringData(1, 0, sh);
		
		
				
	}	


}
