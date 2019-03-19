package Implement_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility_Files.WebDriverUtils;
import object.properties.createAccountProperties;

public class CreateAccountPage extends WebDriverUtils implements createAccountProperties{

	WebDriver driver=null;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
    public void enterFirstName() {
    new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
	enterText(FirstName_locator,"testing");
	}
	public void enterLastName() {
		enterText(lastname_locator,"tes");
	}
	public void enterPassword() {
		enterText(Password_locator,"Test!524");
	}
	public void enterAddress() {
		enterText(Address_locator,"Address1");
	}
	public void enterCity() {
		enterText(City_locator,"City");
	}
	public void selectvaluefromdropdown() {
		selectvaluefromdropdown(State_locator, "5");
	}
	public void enterPostalcode() 
	{
	enterText(postalcode_locator,"85001");
	}
	public void phonenumber() {
	enterText(Phonenumber_locator ,"1234567890");
	}
	public void alias() {
	enterText(ALIAS_locator,"manoj");
	}
	public void Register() {
	click(Register_locator);
	}
}
