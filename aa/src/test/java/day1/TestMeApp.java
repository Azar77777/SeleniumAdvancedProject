package day1;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestMeApp {
	WebDriver driver;
	WebDriverWait wait;
	String title = "selenium - Google Search";
	String Hometitle = "Home";
	
  @Test(priority=1)
  public void SignIn() {
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.partialLinkText("SignIn")).click();
	 
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals(Hometitle, driver.getTitle());	
  }
  
  
  @Test(priority=2)
  public void VerifyCart()
  {
	  System.out.println("work agutha over over");
	 wait = new WebDriverWait(driver,30);
	  Actions act = new Actions(driver);
	  System.out.println("work agutha over over");
	  WebElement lblAllCategories = driver.findElement(By.xpath("//span[text()='All Categories']"));
	  WebElement lblElectronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	//  WebElement lblHeadPhone = driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
	  System.out.println("work agutha over over");
	  act.moveToElement(lblAllCategories).click().build().perform();
	  act.moveToElement(lblElectronics).click().build().perform();
	 // act.moveToElement(lblHeadPhone).click().build().perform();

	  wait.until(ExpectedConditions.elementToBeClickable(lblAllCategories));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Add to cart']")));
	  driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	  
	//a[contains(text(),'Cart')]/b
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Cart')]/b")));
	  
	  
	  String value = driver.findElement(By.xpath("//a[contains(text(),'Cart')]/b")).getText();
	  
	  Assert.assertEquals("1", value);  
	  
  }
  
  
  @BeforeTest
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterTest
  public void afterMethod() {
	//  driver.close();
  }

}
