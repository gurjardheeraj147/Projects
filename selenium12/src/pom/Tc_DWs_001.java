package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_DWs_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextFild().sendKeys("dheeraj147@gmail.com");
		lp.getPasswordTextFild().sendKeys("Dheeraj147");
		lp.getLoginVutton().click();
		driver.quit();
	}

}
