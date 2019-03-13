package day1;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class TestNGGoogle {
	WebDriver driver;
	String title = "selenium - Google Search";
	
  @Test
  public void f() {
	  //driver.findElement(By.name("q")).sendKeys("selenium");
	//	driver.findElement(By.name("q")).submit();
	//	Assert.assertEquals(title, driver.getTitle());
		WebElement lblSignUp;
		lblSignUp = driver.findElement(By.xpath("//a[contains(text(),'SignUp')]"));
		Actions act = new Actions(driver);
		act.clickAndHold(lblSignUp).release(lblSignUp);
		act.build().perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
