package advanceseleniumtestng;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToPerfomeDependsOnMethod {
	@BeforeTest
	@Test
	
	public void createAccount() {
		Reporter.log("Account created succefully",true);
	}
	//@Test(dependsOnMethods = "createAccount")
	@AfterTest
	@Test
	public void editAccount() {
		Reporter.log("Account edit succefully",true);
	}
	//@Test(dependsOnMethods = "editAccount")
	@Test(dependsOnMethods = {"editAccount","createAccount"})
	public void deleteeAccount() {
		Reporter.log("Account delete succefully",true);
	}
}
