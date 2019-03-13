package day1;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class JavaScriptExp {
	WebDriver driver;
	String title = "selenium - Google Search";
	
  @Test
  public void f() {
	  
	  
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	//  String s = js.executeScript("return document.title;").toString();
	 // System.out.println(s);
	  
	  WebElement ele = driver.findElement(By.name("q"));
	  WebElement btn = driver.findElement(By.name("btnK"));
//	  js.executeScript("arguments[0].click();", ele);
//	  js.executeScript("arguments[0].value=arguments[1]", ele,"sample");
//	  js.executeScript("arguments[0].click();", btn);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
