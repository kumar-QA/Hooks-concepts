package com.stepdefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable_For_Specific_step_feature {

	@Given("User is on register page")
	public void user_is_on_register_page() {
		System.out.println("click on REGISTARTION button");
	}
	

	@When("User should enter fallowing Details")
	public void user_should_enter_fallowing_details(DataTable dataTable) {
		
		List<List<String>> data=dataTable.asLists(String.class);
		for(List<String>li:data) {
			System.out.println(li);
			
		}
//	List<Map<String,String>>datamap=dataTable.asMaps(String.class,String.class);
////	System.out.println(datamap);
//	for(int i=0;i<datamap.size();i++) {
//		for(Map.Entry<String, String> data:datamap.get(i).entrySet()) {
//			System.out.println(data.getKey() +"  "+data.getValue());
//		}
//	}
		
//	System.out.println(datamap.get(0).get("FirstName"));
		
	}

	@Then("click on signup button")
	public void click_on_signup_button() {
		System.out.println("click on registration button");
	}

	@Then("It should navigate to HomePage")
	public void it_should_navigate_to_home_page() {
		System.out.println("Naviigated to Home page with successful registration ");
		
	}
	
	@Given("User is on register page with different url")
	public void user_is_on_register_page_with_different_url(DataTable dataTable) {
	    				
		List<List<String>>	data=dataTable.asLists(String.class);
	    System.out.println("Url "+data.get(0));
	    System.out.println("Url "+data.get(1));

						
	    
	}



	
}
