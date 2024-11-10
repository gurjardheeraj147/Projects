package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//constructor
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		@FindBy(id="Email")
		private WebElement emailTextFild;
		@FindBy(id="Password")
		private WebElement passwordTextFild ;
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement loginVutton  ;
		public WebElement getEmailTextFild() {
			return emailTextFild;
		}
		public WebElement getPasswordTextFild() {
			return passwordTextFild;
		}
		public WebElement getLoginVutton() {
			return loginVutton;
		
		}
		
}
