package Implement_Pages;

import org.openqa.selenium.WebDriver;

import Utility_Files.WebDriverUtils;
import object.properties.landingproperties;

public class Landing_page extends WebDriverUtils implements landingproperties{

	WebDriver driver;
	//Constructor Dependency injection
	public Landing_page(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickSignin() {
		//Code for clicking signin element
		System.out.println("driver "+driver);
		click(Signinlocator);
	}
	
	public void clickContactUS() {
		System.out.println("driver "+driver);
		click(ContactUslocator);
	}
	
	public void searchForAnItem() {
		
		System.out.println("Enter search item data");
	}
}
