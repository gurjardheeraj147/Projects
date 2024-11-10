package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
//constructor
		public WelcomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(linkText="Register")
		private WebElement regsiterlink;
		@FindBy(linkText="Log in")
		private WebElement loginlink;
		public WebElement getRegsiterlink() {
			return regsiterlink;
		}
		public WebElement getLoginlink() {
			return loginlink;
		}
	
}
