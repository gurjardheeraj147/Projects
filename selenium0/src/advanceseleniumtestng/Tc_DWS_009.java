package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Tc_DWS_009 extends BaseClass{
	@Test
	public void toCheckComputerPage() {
		String expectedData = "Shopping cart";
	    driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	    WebElement actualData = driver.findElement(By.xpath("//h1[text()='Shopping cart']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  Shopping cart page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to Shopping cart page",true);
		}
		Reporter.log("test case 009 excuted successfully",true);
	}
}
