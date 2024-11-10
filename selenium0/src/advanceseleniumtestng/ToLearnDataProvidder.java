package advanceseleniumtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvidder {
	@DataProvider(name="cred")
	public String[][] toSendData(){

	String[][] sarr = {
			{"dheeraj@gmail.com","Dheeraj147"},
			{"kumar@gmail.com","Kumar147"},
			{"Gurjar@gmail.com","Gurjar147"},
	};
	return sarr;
}
	@Test(dataProvider = "cred")
	public void toLogin(String email,String Password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.quit();
	}
}