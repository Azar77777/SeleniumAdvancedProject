package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();
		System.out.println("title is"+driver.getTitle());
		
	}

}
