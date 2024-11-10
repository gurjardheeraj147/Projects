package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManualoAutomation {
	public static void main(String[] args) throws InterruptedException {
		//Expected Data
			String expectedloginPageTitle = "Demowebshop login";
			String expectedRegisterPageTitle = "Demowebshop Register";
			String expectedfirstname = "Dheeraj";
			String expectedlastname = "gurjar";
			String expectedemail= "dheeraj@gmail.com";
			String expectedPassword = "123456";
			String expectedconfirmPassword = "123456";
			
		//srep1. ;-open the  broswer
			WebDriver driver =new ChromeDriver();//cross broswer testig
			System.out.println("Broswer got launched successfully");
			driver.manage().window().maximize();
			System.out.println("Broswer got Maximized successfully");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		//step 2;- Enter the url and login page display or not
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			WebElement actualloginpageTitle = driver.findElement(By.partialLinkText("Log in"));
			actualloginpageTitle.click();
			if(actualloginpageTitle.equals(expectedloginPageTitle)) {
				System.out.println("Successfully navigated to Demowebshop logionpage");
			}else {
				System.out.println("faild navigate to Demowebshop logionpage");
			}
		// step 3;- enter the username in login page
			WebElement emailtextfield = driver.findElement(By.id("Email"));
			emailtextfield.clear();
			emailtextfield.sendKeys(expectedemail);
			String actualemail = emailtextfield.getAttribute("value");
			if(actualemail.equals(expectedemail)) {
				System.out.println("emailtextfield successfully accepted data");
			}else {
				System.out.println("emailtextfield faild accept data");
			}
			
		//step.4:-Enter the password in login page
			WebElement passwordTextfield = driver.findElement(By.id("Password"));
			passwordTextfield.clear();
			passwordTextfield.sendKeys(expectedPassword);
			String actualpassword = passwordTextfield.getAttribute("value");
			if(actualpassword.equals(expectedPassword)) {
				System.out.println("passwordTextfieldTeaxfield successfully accepted data");
			}
			else {
				System.out.println("passwordTextfieldTeaxfield  faild accept data");
			}
			Thread.sleep(2000);
			
		//step.4:  chack the regiter page display or noy and fil the all details chack
			WebElement actualregisterpage = driver.findElement(By.partialLinkText("Register"));
			actualregisterpage.click();
		
			if(actualregisterpage.equals(expectedRegisterPageTitle)) {
				System.out.println("Successfully navigated to Demowebshop register");
			}else {
				System.out.println("faild navigate to Demowebshop register");
			}
			Thread.sleep(2000);
			
		//step.5: click on bar in first book page display on not
			WebElement clickonbook = driver.findElement(By.partialLinkText("Books"));
			clickonbook.click();
			if(clickonbook.equals(clickonbook)) {
				String booklogo = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
				System.out.println(booklogo);
			}
			else {
				System.out.println("book page should  not be display");
			}
			Thread.sleep(2000);
			
		//step.6: click on bar in computer button than computer  page display on not
			WebElement clickoncomputer = driver.findElement(By.partialLinkText("Computers"));
			clickoncomputer.click();
			if(clickoncomputer.equals(clickoncomputer)) {
				String computerlogo = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
				System.out.println(computerlogo);
			}
			else {
				System.out.println("computer page should  not be display");
			}
			Thread.sleep(2000);
			
		//step.7: click on bar in Electronicsbutton and Electronics page display on not
			WebElement clickonElectronics = driver.findElement(By.partialLinkText("Electronics"));
			clickonElectronics.click();
			if(clickonElectronics.equals(clickonElectronics)) {
				String Electronicslogo = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
				System.out.println(Electronicslogo);
			}
			else {
				System.out.println("book page should  not be display");
			}
			Thread.sleep(2000);
			
			//step.8: click on bar in Apparles and shoes button and Apparles and shoes page display on not
			WebElement clickonshoes= driver.findElement(By.partialLinkText("Apparel & Shoes"));
			clickonshoes.click();
			if(clickonshoes.equals(clickonshoes)) {
				String shoeslogo = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
				System.out.println(shoeslogo);
			}
			else {
				System.out.println("shoes page should  not be display");
			}
			Thread.sleep(2000);
			
		//step.9: click on bar in  Digitalbutoon and digital page display on not
			WebElement clickondigital = driver.findElement(By.partialLinkText("Digital downloads"));
			clickondigital.click();
			if(clickondigital.equals(clickondigital)) {
				String digitallogo = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
				System.out.println(digitallogo);
			}
			else {
				System.out.println("digital page should  not be display");
			}
			Thread.sleep(2000);
		//step.10: click on bar in jewelrybutton and jewelry page display on not
			WebElement clickonjewelry = driver.findElement(By.partialLinkText("Jewelry"));
			clickonjewelry.click();
			if(clickonjewelry.equals(clickonjewelry)) {
				String jewelrylogo = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
				System.out.println(jewelrylogo);
			}
			else {
				System.out.println("jewelry page should  not be display");
			}
			Thread.sleep(2000);
			
		//step.11: click on bar in gift cards button and gift card page display on not
			WebElement clickongiftcards = driver.findElement(By.partialLinkText("Gift Card"));
			clickongiftcards.click();
			if(clickongiftcards.equals(clickongiftcards)) {
				String giftcardslogo = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
				System.out.println(giftcardslogo);
			}
			else {
				System.out.println("giftcards page should  not be display");
			}
			Thread.sleep(2000);
			
			
			driver.quit();
			

}

}
