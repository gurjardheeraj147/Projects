package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListboex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit
		driver.get("https://demoapp.skillrary.com/");
		//list box
		WebElement multilistbox = driver.findElement(By.id("cars"));
		//handle by using selecting
		Select multiselect = new Select(multilistbox);
		//call method
		System.out.println(multiselect.isMultiple());
		multiselect.selectByIndex(1);
		multiselect.selectByVisibleText("Free ( 90 ) ");
		Thread.sleep(2000);
		//deselecting
		//multiselect.deselectByIndex(0);
		//multiselect.deselectByValue("99");
		//multiselect.deselectAll();
		driver.quit();
	}

}
