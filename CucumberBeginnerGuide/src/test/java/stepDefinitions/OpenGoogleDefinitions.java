package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
	    driver= new ChromeDriver();
	    driver.get("http://www.google.co.in");
	}

	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String searchTerm) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("the user should be see the search results")
	public void the_user_should_be_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("kumar")).isDisplayed();
		if(status) {
			System.out.println("Results displayed");
		}
	}

}
