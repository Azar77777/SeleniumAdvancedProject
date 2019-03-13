package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PgLoginPageFactory {
	//WebDriver driver;
	
	/*public PgLoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		
	}*/
	
	// Locators
	@FindBy(how=How.NAME,using="userName")
	WebElement edtUserName;
	
	@FindBy(how=How.NAME,using="password")
	WebElement edtPassword;
	
	@FindBy(how=How.NAME,using="login")
	WebElement btnLogins;
	
	
	// Methods
	public void LoginToDemo(String sUserName, String sPassword)
	{
		edtUserName.sendKeys(sUserName);
		edtPassword.sendKeys(sPassword);
		btnLogins.click();
		
		
	}
	

}
