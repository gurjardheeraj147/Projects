package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit
		driver.get("https://www.facebook.com/signup");
		//dropdown
		WebElement daydropdwon = driver.findElement(By.id("day"));
		WebElement monthdropdwon = driver.findElement(By.id("month"));
		WebElement yeardropdwon = driver.findElement(By.id("year"));
		//to handle dropdwon
		Select dayselect =new Select(daydropdwon);
		Select monthselect =new Select(monthdropdwon);
		Select yearselect =new Select(yeardropdwon);
		//select methods using
		dayselect.selectByIndex(28);
		monthselect.selectByValue("10");
		yearselect.selectByVisibleText("2000");
		//every option presentn in months
		List<WebElement> allmonths = monthselect.getOptions();
		for(WebElement month:allmonths) {
			System.out.println(month.getText());
			monthselect.selectByVisibleText(month.getText());
			Thread.sleep(2000);
		}
		//to check wether dropdwon is single or multiple
		System.out.println("====================");
		System.out.println(monthselect.isMultiple());
		driver.quit();
		}
	

}
