package test;

import org.testng.annotations.Test;

import pages.PgLogin;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DemoTest {
	WebDriver driver;
	
  @Test
  public void MainTest() {
	  PgLogin pgLogin = new PgLogin(driver);
	  pgLogin.LoginToDemo("tutorial", "password");
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
