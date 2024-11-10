package AllLink;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkPrintAndCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("total links"+alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			System.out.println("link on page are"+alllinks.get(i).getAttribute("href"));
			System.out.println("limk page "+alllinks.get(i).getText());
		}
		driver.quit();
	}

}
