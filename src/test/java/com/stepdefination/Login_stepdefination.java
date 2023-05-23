package com.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepdefination {
	
	@Given("customer entered application url and landed on login page")
	public void customer_entered_application_url_and_landed_on_login_page() {
//		System.out.println("Lanch the chrome browser");
//		System.out.println("Enter Application url");
		System.out.println("landed on login page ");
	}
	
	@When("customer enter username and password")
	public void customer_enter_username_and_password() {
		System.out.println("Entered username and password");
	}
	
	@When("customer enter username as {string} and password as {string}")
	public void customer_enter_username_and_password(String uname,String pwd) {
		System.out.println("username as: "+uname+" password as: "+pwd);
	}
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("clickd on login button");
	}
	@Then("customer should landed on Dashboard page")
	public void customer_should_landed_on_Dashboard_page() {
		System.out.println("customer landed on dashboard page ");
//		System.out.println("chrome browser closed");
	}

	@Then("It should show error as invalid username&passwords")
	public void it_should_show_error_as_invalid_username_passwords() {
	    System.out.println("invalid username and password");
	}
	
	@Then("It should show error as invalid username")
	public void it_should_show_error_as_invalid_username() {
	    System.out.println("invalid username");
	}
	@Then("It should show error as invalid password")
	public void it_should_show_error_as_invalid_password() {
	    System.out.println("invalid password");
	}
	

}
