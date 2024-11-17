package advanceseleniumtestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before suite got excuted",true);
	}
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("After suite got excuted",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before test got excuted",true);
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("After test got excuted",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class got excuted",true);
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("After class got excuted",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before method got excuted",true);
	}
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("After method got excuted",true);
	}
	@Test
	public void testCase() {
		Reporter.log("Test Case got excute",true);
		
	}

}
