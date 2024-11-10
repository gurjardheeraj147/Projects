package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchJawa {
	@Test(groups = "smoke")
	public void hawa() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jawamotorcycles.com/");
		Reporter.log("jawa got launach");
		driver.quit();
}
}
