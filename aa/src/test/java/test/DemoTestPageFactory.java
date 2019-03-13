package test;

import org.testng.annotations.Test;

import pages.PgLogin;
import pages.PgLoginPageFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class DemoTestPageFactory {
	WebDriver driver;
	
  @Test(dataProvider="Sam",dataProviderClass=utility.ExcelReader.class)
  public void MainTest(String sUserName, String sPassword) {
	  PgLoginPageFactory login = PageFactory.initElements(driver, PgLoginPageFactory.class);
	  login.LoginToDemo(sUserName, sPassword);
	  
  }
  @BeforeMethod
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com/");
	  
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}
