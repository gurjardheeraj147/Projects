package advanceseleniumtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPerfromeEnabled {
	@Test(enabled=false)
	public void cricbuzz() {//testcase1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed successfully",true);//teststep
		driver.quit();
	}
	@Test
	public void banskinRobbins() {//testcase2
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("banskinRobbins got executed successfully",true);//teststep
		driver.quit();
	}
	@Test(enabled=true)
	public void amazon() {//testcase3
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("amazon got executed successfully",true);//teststep
		driver.quit();
}
}
