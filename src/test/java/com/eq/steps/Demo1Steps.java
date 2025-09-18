package com.eq.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {
	
	@Given("I have browser with github home page")
	public void i_have_browser_with_github_home_page() {
		System.out.println("given");
	    
	}
	@When("User enter uesrname as {string}")
	public void user_enter_uesrname_as(String username) {
		System.out.println("when" + username);
	   
	}
	@When("User enter password as {string}")
	public void user_enter_password_as(String string) {
	   
	}
	@When("User click on Sign in")
	public void user_click_on_sign_in() {
	   System.out.println("when login");
	}
	@Then("User should gets access to dashboard with header as {string}")
	public void user_should_gets_access_to_dashboard_with_header_as(String expectedValue) {
		System.out.println();		
	   
	}	
	
	@Then("User should gets access to dashboard with error as {string}")
	public void user_should_gets_access_to_dashboard_with_error_as(String string) {
	    
	}

}
