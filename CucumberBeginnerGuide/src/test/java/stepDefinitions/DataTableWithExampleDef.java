package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExampleDef {
	WebDriver driver;
	@Given("proceed login page")
	public void proceed_login_page() {
		driver=new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enters {string} and password {string}")
	public void user_enters_and_password(String userName, String passWord) {
		   driver.findElement(By.id("username")).sendKeys(userName);
		   driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@When("clicked button")
	public void clicked_button() {
		driver.findElement(By.id("submit")).click();
	}

}
