package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_007 extends BaseClass{
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Gift Cards";
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Gift Cards page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Gift Cards page",true);
		}
		Reporter.log("test case 007 excuted successfully",true);
	}
}
