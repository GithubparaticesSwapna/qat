package object.properties;

import org.openqa.selenium.By;

public interface createAccountProperties {
	By FirstName_locator =By.id("customer_firstname");
	By lastname_locator =By.id("customer_lastname");
	By Password_locator =By.id("passwd");
	By Address_locator =By.id("address1");
	By City_locator =By.id("city");
	By State_locator =By.id("id_state");
	By postalcode_locator =By.id("postcode");
	By Country_locator =By.id("id_country");
	By Phonenumber_locator =By.id("phone_mobile");
	By ALIAS_locator =By.id("alias");
	By Register_locator =By.id("submitAccount");
}
