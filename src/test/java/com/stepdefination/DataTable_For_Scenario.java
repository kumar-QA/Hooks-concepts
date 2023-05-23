package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable_For_Scenario {

//	@Given("User should  on register page")
//	public void user_should_on_register_page() {
//		System.out.println("registration page");
//	}

	@When("user Enter {string} and {string}")
	public void user_enter_and(String fname, String lname) {
		System.out.println("Enter First Name "+fname);
		System.out.println("Enter Last Name "+lname);
	}

	@When("user should enter {string} and {string} also")
	public void user_should_enter_and_also(String email, String pno) {
		System.out.println("Enter Email "+email);
		System.out.println("Enter PhoneNo "+pno);
	}
	@When("user  click on register btn")
	public void user_click_on_register_btn() {
		System.out.println("clicked on submit btn");
	}

	@Then("user should get success Message notification")
	public void user_should_get_success_message_notification() {
	   System.out.println("successful logged in");
	}

	@Then("user should navigate to homePage directly")
	public void user_should_navigate_to_home_page_directly() {
	  System.out.println("naviagted to Home page Directly");
	}

}
