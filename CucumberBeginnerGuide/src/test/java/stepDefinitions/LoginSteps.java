package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("student");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    driver.findElement(By.id("submit")).click();
	}

	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
	   boolean status = driver.findElement(By.linkText("HOME")).isDisplayed();
	   Assert.assertTrue(status);
	}
}
