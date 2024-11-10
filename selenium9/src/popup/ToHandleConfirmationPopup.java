package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.linkText("Login")).click();	
		//to handle confirmation popup
		Alert confirmationpopup = driver.switchTo().alert();
		System.out.println(confirmationpopup.getText());
		confirmationpopup.accept();//ok button
		Thread.sleep(2000);
		//confirmationpopup.dismiss();//ok and cancle
		driver.quit();
		
		}

}
