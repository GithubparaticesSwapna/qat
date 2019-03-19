package Utility_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUrls implements Base_Setup{
	WebDriver driver;
	public WebDriver intilizeDriver() {
	System.setProperty(Chrome_key, Chrome_path);
	driver =new ChromeDriver();
	System.out.println("TestBase Driver :::: "+driver);
	return driver;
		
	}
public void enterURL(String URL) {
	driver.get(URL);
	
}

}



