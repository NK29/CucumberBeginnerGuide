package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDef {
	WebDriver driver;
	@Given("Go to login page")
	public void go_to_login_page() {
		driver=new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("enter the below credential")
	public void enter_the_below_credential(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String> >keyValuePair=dataTable.asMaps(String.class, String.class);
	   
	   String userName=keyValuePair.get(0).get("userName");
	   String passWord=keyValuePair.get(0).get("passWord");
	   
	   driver.findElement(By.id("username")).sendKeys(userName);
	   driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.id("submit")).click();
	}
}
