package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert; 

//@SuppressWarnings("deprecation")
public class DemoWeb {
	
static WebDriver driver;
	@Given("User launches the DemoWebshop App")
	public void user_launches_the_DemoWebshop_App() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User Provides the valid data for all fields")
	public void user_Provides_the_valid_data_for_all_fields() {
		
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Rohit");
		driver.findElement(By.name("LastName")).sendKeys("Baura");
		driver.findElement(By.name("Email")).sendKeys("eminem@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rohit@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("rohit@123");
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User clicks in submit button at the end of the  form")
	public void user_clicks_in_submit_button_at_the_end_of_the_form() {
		driver.findElement(By.name("register-button")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	@Then("verifies the result of the resgistration")
	public void verifies_the_result_of_the_resgistration() {
		String str = driver.findElement(By.className("result")).getText();		
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(str.contains("Your registration completed"));
	    //throw new cucumber.api.PendingException();
	}
	@When("prints the message")
	public void prints_the_message() {
		System.out.println("Your registration completed");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("Application launched by registered user")
	public void application_launched_by_registered_user(){
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Then("User access the login Link")
	public void user_access_the_login_Link() {
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Provides the valid data as input")
	public void provides_the_valid_data_as_input() {
	
		driver.findElement(By.name("Email")).sendKeys("eminem@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rohit@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Verfies the login status")
	public void verfies_the_login_status() {
		String res = driver.findElement(By.xpath("//a[@href='/customer/info']")).getText();		
		Assert.assertTrue(res.contains("eminem@gmail.com"));
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
