package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefWithData {
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver=new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("the user enters the valid credentials {string} and {string}")
	public void the_user_enters_the_valid_credentials_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("the user should see the home page")
	public void the_user_should_see_the_home_page() {
		boolean status = driver.findElement(By.linkText("HOME")).isDisplayed();
		   Assert.assertTrue(status);
	}
}
