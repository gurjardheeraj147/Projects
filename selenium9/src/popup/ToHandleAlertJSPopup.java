package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertJSPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//switch to ifram
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		//to handle  alert popup
		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		//alertpop Accept
		alertpopup.accept();
		//dismiss
		//alertpopup.dismiss();
		driver.quit();
	}
}
