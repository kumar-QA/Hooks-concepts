package com.stepdefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalaryCalculation_steps {
	
	 double GrossSalry;
	 double IncomeTax;
	 double PF;
	 double ProfessionalTax;
	 double NetSalary;
	 

	@Given("user should navigate to calculation page")
	public void user_should_navigate_to_calculation_page() {
	   System.out.println("click on calculator");
	}

	@When("user enter grosssalary {string}")
	public void user_enter_grosssalary(String grossSal) {
		this.GrossSalry=Double.parseDouble(grossSal);
	}

	@When("user enter {string} and {string} and {string}")
	public void user_enter_and_and(String IncomeTax, String PF, String ProfessionalTax) {
	   this.IncomeTax=Double.parseDouble(IncomeTax);
	   this.PF=Double.parseDouble(PF);
	   this.ProfessionalTax=Double.parseDouble(ProfessionalTax);
	   this.NetSalary=this.GrossSalry-this.PF-this.IncomeTax-this.ProfessionalTax;
	}
	@Then("user should get NetSalary information {string}")
	public void user_should_get_net_salary_information(String NetSalary) {
	   Assert.assertTrue(this.NetSalary==Double.parseDouble(NetSalary));
	}

	
}
