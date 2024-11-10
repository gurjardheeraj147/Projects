package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_003 extends BaseClass {
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Electronics";
		driver.findElement(By.partialLinkText("Electronics")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Electronics']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Electronics page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Electronics page",true);
		}
		Reporter.log("test case 003 excuted successfully",true);
	}
}
