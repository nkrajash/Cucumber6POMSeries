package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginPage {

	@Given("user is on Amazon landing page")
	public void user_is_on_amazon_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("Sign in button is present on screen")
	public void sign_in_button_is_present_on_screen() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user is displayed login screen")
	public void user_is_displayed_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks Sign in button")
	public void user_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("title of home page is {string}")
	public void title_of_home_page_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Sign in button is not present")
	public void sign_in_button_is_not_present() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user gets login failed error message")
	public void user_gets_login_failed_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	}
}

/*
/*Quiz
 * 
 * 
Question 1:
Identify the correct statement about Maven.
A.Build management tool for Java framework.
B.Repository for getting the project dependencies.
C.Can be integrated easily with CI tools like Jenkins.
D.All of the above.
Ans: D

Question 2:
Which plugin helps to execute test cases from test folder in Maven project?
A.Maven - invoker plugin
B.Maven - verifier plugin
C.Surefire plugin
D.None of these
Ans:C

Question 3:
Suppose your test suite contains Regression and Sanity test cases having two profiles in pom.xml. 
Each of them is integrated with TestNG and having separate TestNG xml file. 
How will you trigger only the Sanity test cases?
A.mvn test -PSanity
B.mvn test Sanity
C.mvn test
D.mvn test -Pregression
Ans:A

Question 4:
Once Maven reads the pom.xml, first were does it search for the dependencies?
A.Central repository
B.Local repository
C.Remote repository
D.None of these
Ans:B

Question 5:
Suppose we want to publish our project in Maven, what is the mandatory piece of information that is 
needed for doing that?
A.groupId
B.artidfactId
C.version
D.All of these
Ans:D

Question 6:
Which maven command does the compilation and identifies if there are any syntax errors in the code?
A.mvn compile
B.mvn clean
Ans:A


*/

