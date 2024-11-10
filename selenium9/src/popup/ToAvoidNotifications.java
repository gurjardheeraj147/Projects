package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Broswer Setting
		ChromeOptions settings = new ChromeOptions();
		//settings.addArguments("--disable-notifications");
		settings.addArguments("--incognito");
		WebDriver driver =new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
