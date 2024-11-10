package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photomanager = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photomanager);//switch to ifram
		//image
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras'] "));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake'] "));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent'] "));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka'] "));
		//trash box
		WebElement trashbox = driver.findElement(By.id("trash"));
		//gallary
		WebElement gallary = driver.findElement(By.id("gallery"));
		//to use action class
		Actions action = new Actions(driver);
		//to drag and drop to trashbox
		action.dragAndDrop(image1,trashbox).perform();
		Thread.sleep(2000);
		/*action.dragAndDrop(image2,trashbox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3,trashbox).perform();
		Thread.sleep(2000);*/
		//to use moveByOffSet methods
		action.dragAndDropBy(image2,500, 0).perform();
		Thread.sleep(2000);
		action.clickAndHold(image3).moveToElement(trashbox).release().perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4,trashbox).perform();
		Thread.sleep(2000);
		//to drag and drop to gallary
		action.dragAndDrop(image1, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallary).perform();
		Thread.sleep(2000);
		driver.quit();
	}


}
