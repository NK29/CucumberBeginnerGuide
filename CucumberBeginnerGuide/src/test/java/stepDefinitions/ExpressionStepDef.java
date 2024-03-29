package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionStepDef {
	
	@Given("^I have (\\d+) Laptop$")
	public void I_have_1_Laptop(int count) {
		System.out.println("Laptop count:"+ count);
	}
	
	@Given("^I have a (\\d+\\.\\d+) CGPA$")
	public void I_have_a_CGPA(float num){
	System.out.println("CGPA is:"+ num);
	}
	
	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String name, String name2, String name3) {
		System.out.println(name + " is elder to " + name2 + " and " + name3 );
	}
}