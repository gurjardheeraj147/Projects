package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_004 extends BaseClass {
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Apparel & Shoes";
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Apparel & Shoes page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Apparel & Shoes page",true);
		}
		Reporter.log("test case 004 excuted successfully",true);
	}
}
