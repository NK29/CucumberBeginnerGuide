package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDef {
	WebDriver driver;
	
	@Given("you are on the login page")
	public void you_are_on_the_login_page() {
		driver=new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("you enter the below credential")
	public void you_enter_the_below_credential(io.cucumber.datatable.DataTable dataTable) {
		List<String>credentials=dataTable.asList(String.class);
		String userName=credentials.get(0);
		String passWord=credentials.get(1);
		driver.findElement(By.id("username")).sendKeys(userName);
	    driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("submit")).click();
	}
}
