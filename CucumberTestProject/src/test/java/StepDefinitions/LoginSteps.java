package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("when user is on login page")
	public void when_user_is_on_login_page() {

		System.out.println("Inside step - user is on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

		System.out.println("Inside step - user enters username and password");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - user clicks login button ");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("Inside step - user is navigated to HomePage");
	}

}
