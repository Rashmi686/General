package testcases;

import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Check extends Utils {
	@Parameters({"firstname","lastname"})
	@Test
	public void forprac() {
		System.out.println("Enter first name as "+"Richards");
		System.out.println("Enter last name as "+"J");
	}

}
