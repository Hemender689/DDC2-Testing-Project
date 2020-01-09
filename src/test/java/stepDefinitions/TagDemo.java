package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagDemo {

	
	@Given("I launch app")
	public void i_launch_app() {
		System.out.println("launched");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("I register with valid data")
	public void i_register_with_valid_data() {
		System.out.println("registered");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("application is working")
	public void application_is_working() {
		System.out.println("application is working");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("I provide data")
	public void i_provide_data() {
		System.out.println("I provide data");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("I am placing order for my selected item")
	public void i_am_placing_order_for_my_selected_item() {
		System.out.println("I am placing order for my selected item");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("I cancel the order as it not meets my expectation")
	public void i_cancel_the_order_as_it_not_meets_my_expectation() {
		System.out.println("I cancel the order as it not meets my expectation");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
}
