package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Thonas_StepDef {
	@Given("Thanos has the inifinity stones")
	public void thanos_has_the_inifinity_stones() {
	    System.out.println("Thanos has the inifinity stones");
	}

	@When("Thanos snaps his fingers")
	public void thanos_snaps_his_fingers() {
	    System.out.println("Thanos snaps his fingers");
	}

	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
		System.out.println("half of the living things died");
	}
}
