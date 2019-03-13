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

public class DragAndDropExp {
	WebDriver driver;
	String title = "selenium - Google Search";
	
  @Test
  public void f() {
	  //driver.findElement(By.name("q")).sendKeys("selenium");
	//	driver.findElement(By.name("q")).submit();
	//	Assert.assertEquals(title, driver.getTitle());
		WebElement resize;
		resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(resize, 400, 200).perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
