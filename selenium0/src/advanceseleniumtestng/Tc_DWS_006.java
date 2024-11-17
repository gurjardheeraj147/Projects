package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_006 extends BaseClass{
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Jewelry";
		driver.findElement(By.partialLinkText("Jewelry")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Jewelry page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Jewelry page",true);
		}
		Reporter.log("test case 006 excuted successfully",true);
	}
}
