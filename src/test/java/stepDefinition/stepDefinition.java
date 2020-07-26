package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class stepDefinition {
	
	  @Given("^User is on landing Page$")
	    public void user_is_on_landing_page() throws Throwable {
	        
		  System.out.println("User is on Landing Page");
	    }

	  @When("^User Login into application with username and password$")
	  public void user_login_into_application_with_username_and_password() throws Throwable {
	    System.out.println("User successfully logined into the application");
	  	}

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("User is on Home Page");   
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("Cards details is populated");
	    }


}
