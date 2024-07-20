package pkg;

import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmpRegTest extends Utils {
	@Parameters({"Firstname","Lastname"})
	@Test
	 public void checkEmp(String fname,String lname) {
		 System.out.println("Enter fisrt value as "+fname);
		 System.out.println("Enter last value as "+lname);
	 }

}
