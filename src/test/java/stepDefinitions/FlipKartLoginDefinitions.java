package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipKartLoginDefinitions {
	
	

@Given("Flipcart is up and running and is launched")
public void flipcart_is_up_and_running_and_is_launched() {
	System.out.println(" launched");
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("User clicks on SignIn link")
public void user_clicks_on_SignIn_link() {
	System.out.println("clicked");
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("User provides valid credentials")
public void user_provides_valid_credentials() {
	System.out.println("provides");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("user clicks on OK button")
public void user_clicks_on_OK_button() {
	System.out.println("clicked");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}
