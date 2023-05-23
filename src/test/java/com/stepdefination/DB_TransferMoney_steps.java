package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DB_TransferMoney_steps {
	
//	@Given("user is in dashboard page")
//	public void user_is_in_dashboard_page() {
//
//			System.out.println("Open browser");
//			System.out.println("enter url");
//			System.out.println("login in to the application");
//	}
//
//	@Then("user should click on transfermoney link")
//	public void user_should_click_on_transfermoney_link() {
//		System.out.println("click on transfer money link");
//	}
//
//	@Then("user should Enter AccountNO {string} and name as {string}")
//	public void user_should_enter_account_no_and_name_as(String no, String name) {
//		System.out.println("Enter AccountNo :"+no);
//		System.out.println("Enter userName: "+name);
//	}
//
//	@Then("user should enter amount as {int}")
//	public void user_should_enter_amount_as(Integer amount) {
//	  System.out.println("Enter Amount Details: "+amount);
//	}
//
//	@Then("user should Branch name as {string}")
//	public void user_should_branch_name_as(String branch) {
//		System.out.println("Enter Branch Name: "+branch);
//		System.out.println("click on send btn");
//	}

	
	/*----------------------------------Regex----------------------------------*/
	
	@Given("user is in dashboard page")
	public void user_is_in_dashboard_page() {

//			System.out.println("Open browser");
//			System.out.println("enter url");
			System.out.println("login in to the application");
	}

	@Then("user should click on transfermoney link")
	public void user_should_click_on_transfermoney_link() {
		System.out.println("click on transfer money link");
	}


	@Then("^user should enter amount as (\\d+)$")
	public void user_should_enter_amount_as(int amount) {
	  System.out.println("Enter Amount Details: "+amount);
	}

	@Then("^user should Branch name as \"([^\"]+)\"$")
	public void user_should_branch_name_as(String branch) {
		System.out.println("Enter Branch Name: "+branch);
		System.out.println("click on send btn");
	}
	@Then("^user should enter accountno \"([a-zA-Z0-9]+)\" and name as \"([a-zA-Z]+)\"$")
	public void user_should_enter_accountno_and_name_as(String acno, String name) {
	   System.out.println(acno);
	   System.out.println(name);
	}
	
	
	@Then("user should click on RequestLoan link")
	public void user_should_click_on_request_loan_link() {
	   System.out.println("clicked on request loan link");
	}

	@Then("user should enter LoanAmount {int} and DownPayment {int}")
	public void user_should_enter_loan_amount_and_down_payment(Integer loanamount, Integer downpayment) {
		System.out.println("loan amount is:  "+loanamount );
		System.out.println("DownPayment  amount is:  "+downpayment );
	}

	@Then("user should select From which account he need loan")
	public void user_should_select_from_which_account_he_need_loan() {
	    System.out.println("Selected from savings account");
	}




	
	
	
}
