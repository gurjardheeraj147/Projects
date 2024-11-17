package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_002   extends BaseClass{
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Computer";
		driver.findElement(By.partialLinkText("Computers")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Computers']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  computers page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to computer page",true);
		}
		Reporter.log("test case 002 excuted successfully",true);
	}
}
