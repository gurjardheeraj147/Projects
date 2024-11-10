package advanceseleniumtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPerfromInvocationTestNg {
	@Test(priority=-5,invocationCount=2)
	public void cricbuzz() {//testcase1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed successfully",true);//teststep
		driver.quit();
	}
	@Test(priority=-1,invocationCount=3)
	public void banskinRobbins() {//testcase2
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("banskinRobbins got executed successfully",true);//teststep
		driver.quit();
	}
	@Test(priority=0,invocationCount=1)
	public void amazon() {//testcase3
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("amazon got executed successfully",true);//teststep
		driver.quit();
}
}
