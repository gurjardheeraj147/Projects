package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_005  extends BaseClass{
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Digital downloads";
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Digital downloads page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Digital downloads page",true);
		}
		Reporter.log("test case 005 excuted successfully",true);
	}
}
