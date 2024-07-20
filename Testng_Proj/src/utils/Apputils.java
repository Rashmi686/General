package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils {

	
	@BeforeTest
	public void login()
	{
		System.out.println("Login as Admin");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("Logout fromadmin");
	}
	@BeforeSuite
	public void launchApp()
	{
		System.out.println("Launch Orangehrm app");
	}
	@AfterSuite
	public void closeApp()
	{
		System.out.println("close Orangehrm app");
	}
}

