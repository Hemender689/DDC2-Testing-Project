package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Parameter {
	
	static WebDriver driver;
	
	@Given("User launch the applicaton")
	public void user_launch_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Application  launched by user")
	public void application_launched_by_user() {
		driver.findElement(By.xpath(".//a[@href='login.htm']")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("enter username {string}")
	public void enter_username(String string) {
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("enter password {string}")
	public void enter_password(String string) {
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("CLick on all category")
	public void click_on_all_category() {
		driver.findElement(By.xpath("(.//span)[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	   //  throw new cucumber.api.PendingException();
	}

	@Then("click on home electronics")
	public void click_on_home_electronics() {
		driver.findElement(By.xpath("(.//span)[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User click on headphone")
	public void user_click_on_headphone() {
		driver.findElement(By.xpath(".//span[@onclick='getProducts(11290,112101)']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("User CLick on add to cart")
	public void user_CLick_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User click on cart")
	public void user_click_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User CLick on remove from cart")
	public void user_CLick_on_remove_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	

}
