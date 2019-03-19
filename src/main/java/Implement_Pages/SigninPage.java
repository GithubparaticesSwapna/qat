package Implement_Pages;

import org.openqa.selenium.WebDriver;

import Utility_Files.WebDriverUtils;
import object.properties.siginproperties;

public class SigninPage extends WebDriverUtils implements siginproperties{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterNewEmailAddress() {
		enterText(EmailAddressLocator,"selenium76194.@gmail.com");
	}
	
	public void clickCreateAccountButton() {
		click(CreateAccountLocator);
	}
	
	public void clickForgotPassword() {
		System.out.println("Clicked Forgot password link");
	}
}
