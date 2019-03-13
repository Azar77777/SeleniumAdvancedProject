package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PgLogin {
	WebDriver driver;
	
	public PgLogin(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	// Locators
	By userName = By.name("userName");
	By passWord = By.name("password");
	By btnLogin = By.name("login");
	
	// Methods
	public void LoginToDemo(String sUserName, String sPassword)
	{
		driver.findElement(userName).sendKeys(sUserName);
		driver.findElement(passWord).sendKeys(sPassword);
		driver.findElement(btnLogin).click();
		
		
	}
	

}
