   package advanceseleniumtestng;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
public class BaseClass {
	public WebDriver driver;
	String expectedwelcomepageTitle= "Demo Web Shop";
	//@Parameters("browserName")
	@BeforeClass
	public void toLaunch() {
		/*if(bname.equalsIgnoreCase("edge")) {*/
		 driver = new EdgeDriver();
		//}
		/*else if(bname.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}*/
			Reporter.log("Broswer got launched Successfully",true);
			driver.manage().window().maximize();
			Reporter.log("Broswer got maximized successfully",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
    @BeforeMethod
	 public void tologin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualcomepageTitle = driver.getTitle();
		if(actualcomepageTitle.equals(expectedwelcomepageTitle)) {
			Reporter.log("Navigate to demowebshop successfully",true);
		}
		else {
			Reporter.log("falid to Navigate to demowebshop successfully",true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("dheeraj147@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dheeraj147");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("navigate to home page should be display",true);
	}
	@AfterMethod
	public void tologut() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Successfully logout",true);
	}
	@AfterClass
	public void toClassBroswer() {
		Reporter.log("Broswer got closed successfully",true);
		driver.quit();
	}
}
