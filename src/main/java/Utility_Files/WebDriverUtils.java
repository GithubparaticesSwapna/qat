package Utility_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {

WebDriver driver=null;
//Constructor Dependency injection
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	/**this method will Enter text from the page**/
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
		
	}
	/**this method will extract text from the page**/
	public String gettext(By prop) {
		return driver.findElement(prop).getText();
	}
	
	public void selectvaluefromdropdown(By prop,String value) {
		Select s= new Select(driver.findElement(prop));
				s.selectByValue(value);
	}
	
	
}

