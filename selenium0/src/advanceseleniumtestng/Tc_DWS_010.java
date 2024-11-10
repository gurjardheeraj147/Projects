package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_010 extends BaseClass {
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Wishlist";
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Wishlist']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Wishlist page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Wishlist page",true);
		}
		Reporter.log("test case 010 excuted successfully",true);
	}
}
