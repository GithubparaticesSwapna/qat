package Sprint1_ABFunctionality;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Implement_Pages.Landing_page;
import Implement_Pages.CreateAccountPage;
import Implement_Pages.SigninPage;
import Utility_Files.BaseUrls;

public class S2657_CreateAccountFunctionality_Test extends BaseUrls{
	WebDriver driver=null;

	@BeforeMethod
	public void beforeMethod() {
		//Browser Launching Code
		driver=intilizeDriver();
		enterURL(Automation_path);

	}

	@Test
	public void testCase1() {

		//Click Signin link
		Landing_page landingPage=new Landing_page(driver);
		landingPage.clickSignin();	

		SigninPage signinPage=new SigninPage(driver);
		signinPage.enterNewEmailAddress();
		signinPage.clickCreateAccountButton();

		CreateAccountPage createAccountPage=new CreateAccountPage(driver);
		createAccountPage.enterFirstName();
		createAccountPage.enterLastName();
		createAccountPage.enterPassword();
		createAccountPage.enterAddress();
		createAccountPage.enterCity();
		createAccountPage.selectvaluefromdropdown();
		createAccountPage.enterPostalcode();
		createAccountPage.phonenumber();
		createAccountPage.alias();
		//createAccountPage.enterCountry();
		createAccountPage.Register();
		

	}
}