package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchBmw {
	@Test(groups = "integration")
	public void bmw() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmwmotorcycles.com/en/home.html#/filter-all");
		Reporter.log("bmw got launach");
		driver.quit();
}
}
