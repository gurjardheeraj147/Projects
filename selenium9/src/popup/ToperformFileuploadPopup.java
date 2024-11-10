package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToperformFileuploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		//Action class
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		//upload file
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\suman\\Downloads\\Dheeraj _Resume (1).pdf");
		Thread.sleep(2000);
		driver.quit();
	}

}
