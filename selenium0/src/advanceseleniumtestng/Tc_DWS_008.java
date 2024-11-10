package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_008 extends BaseClass {
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Tricentis";
		driver.findElement(By.linkText("Tricentis")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Tricentis']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Tricentis page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Tricentis page",true);
		}
		Reporter.log("test case 008 excuted successfully",true);
	}
}
