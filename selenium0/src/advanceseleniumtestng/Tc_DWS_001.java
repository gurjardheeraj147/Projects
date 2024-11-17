package advanceseleniumtestng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class Tc_DWS_001 extends BaseClass{
	String expectedData = "Books";
	@Test
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Books']"));
		/*if(actualData.equals(expectedData)) {
			Reporter.log("navigate to  books page successfully",true);
		}
		else {
			Reporter.log("failed to navigate to books page",true);
		}*/
		Assert.assertEquals(actualData, expectedData, "failed to navigate to books page");
		Reporter.log("test case 001 excuted successfully",true);
	}
}
