 package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformeHiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		//switch to fram
		driver.switchTo().frame("notification-frame-~10cb447c7");
		driver.findElement(By.xpath("//a[@class='close']")).click();
		//switchh parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='13']")).click();
				break;
			}catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
