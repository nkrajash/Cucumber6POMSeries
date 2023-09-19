package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	@Given("a registered user exists")
	public void a_registered_user_exists() {
		
	}

	@Given("user is on Amazon login page")
	public void user_is_on_amazon_login_page() {
	}

	@When("user enters username")
	public void user_enters_username() {
	}

	@When("user enters password")
	public void user_enters_password() {
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	}

	@Then("user navigates to order page")
	public void user_navigates_to_order_page() {
	}

	@When("user clicks on Order link")
	public void user_clicks_on_order_link() {
	}

	@Then("user checks the previous order detials")
	public void user_checks_the_previous_order_detials() {
	}

	@When("user clicks on Open Orders link")
	public void user_clicks_on_open_orders_link() {
	}

	@Then("user checks the open order details")
	public void user_checks_the_open_order_details() {
	}

	@When("user clicks on Cancelled Orders link")
	public void user_clicks_on_cancelled_orders_link() {
	}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
	}

	
}


/*
As per cucumber official documentation:

Background:
Occasionally you’ll find yourself repeating the same Given steps in all of the scenarios in a Feature.

Since it is repeated in every scenario, this is an indication that those steps are not essential to 
describe the scenarios; they are incidental details. You can literally move such Given steps to the 
background, by grouping them under a Background section.

A Background allows you to add some context to the scenarios that follow it. 
It can contain one or more Given steps, which are run before each scenario, 
but after any Before hooks.

A Background is placed before the first Scenario/Example, at the same level of indentation.

*/