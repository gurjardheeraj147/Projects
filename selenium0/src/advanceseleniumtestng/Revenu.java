package advanceseleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Revenu {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Update path to your chromedriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testRevenueCalculator() throws InterruptedException {
        // Navigate to FitPeo Homepage
        driver.get("https://www.fitpeo.com"); // Replace with the actual URL

        // Navigate to the Revenue Calculator Page
        WebElement revenueCalculatorLink = driver.findElement(By.linkText("Revenue Calculator")); // Update if needed
        revenueCalculatorLink.click();

        // Scroll down to the Slider section
        WebElement sliderSection = driver.findElement(By.id("slider-section")); // Update with the actual ID or locator
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sliderSection);

        // Adjust the Slider
        WebElement slider = driver.findElement(By.id("revenue-slider")); // Update with the actual ID or locator
        WebElement textField = driver.findElement(By.id("revenue-text-field")); // Update with the actual ID or locator

        // Set slider value to 820
        slider.sendKeys("820"); // Might need to use JavaScript for precise control

        // Validate Slider Value
        Assert.assertEquals(textField.getAttribute("value"), "820");

        // Update the Text Field
        textField.clear();
        textField.sendKeys("560");

        // Validate Slider Position
        // Wait for slider to update and then check value
        Thread.sleep(2000); // Wait for the slider to update (consider using WebDriverWait instead)
        Assert.assertEquals(textField.getAttribute("value"), "560");

        // Select CPT Codes
        WebElement cpt99091 = driver.findElement(By.id("cpt-99091")); // Update with actual ID
        WebElement cpt99453 = driver.findElement(By.id("cpt-99453")); // Update with actual ID
        WebElement cpt99454 = driver.findElement(By.id("cpt-99454")); // Update with actual ID
        WebElement cpt99474 = driver.findElement(By.id("cpt-99474")); // Update with actual ID

        cpt99091.click();
        cpt99453.click();
        cpt99454.click();
        cpt99474.click();

        // Validate Total Recurring Reimbursement
        WebElement reimbursementHeader = driver.findElement(By.id("total-recurring-reimbursement")); // Update with actual ID
        String headerText = reimbursementHeader.getText();
        Assert.assertTrue(headerText.contains("$110700"), "Expected reimbursement amount not found");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}


