package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{
	@BeforeTest
public void login()
	
{
	System.out.println("Gmail Login");
}
@AfterTest	
public void logout()

{
	System.out.println("Gmail Logout");
}
@BeforeSuite	
public void launchApp()

{
	System.out.println("Launch app");
}
@AfterSuite	
public void closeApp()

{
	System.out.println("close App");
}
		
	
	
	
	
	
}
