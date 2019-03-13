package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinition {
	WebDriver driver;
	
	@Given("^User is on the Same page$")
	public void user_is_on_the_Same_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demoaut.com/");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and click submit button$")
	public void user_enters_and_and_click_submit_button(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		By userName = By.name("userName");
		By passWord = By.name("password");
		By btnLogin = By.name("login");
		driver.findElement(userName).sendKeys(arg1);
		driver.findElement(passWord).sendKeys(arg2);
		driver.findElement(btnLogin).click();
	}

	@Then("^login is successful$")
	public void login_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.close();
	   
	}

	
}
