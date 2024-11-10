package youTubeMusicPlay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SongPlayInYoutube {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("Firecracker ");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Firecracker | Jayeshbhai Jordaar')]")).click();
		 //driver.findElement(By.partialLinkText("Firecracker | Jayeshbhai Jordaar |Ranveer Singh | Vishal & Sheykhar | New Song | Laal Rangi Chola by YRF91,711,901 views 1 year ago 2 minutes, 38 seconds")).click();
	}


}
