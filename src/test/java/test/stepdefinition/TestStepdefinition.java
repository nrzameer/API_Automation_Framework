package test.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pages.First;

public class TestStepdefinition {
	
	//First f ;
	
	
	@Given("^I goto calculator site with \"(.*)\" and \"(.*)\"$")
	public void I_want_to_write_a_step_with_precondition (String a, String b) {
//		f= new First();
//		f.a();
		System.out.println("First case executed");
		System.out.println(a + b);
		
	}

	
	@Given("^I hit BMI link$")
	public void i_hit_BMI_link() throws Throwable {
		//f.b();
	}

	@Then("^I enter the values$")
	public void i_enter_the_values() throws Throwable {
		//f.c();
	}

	@When("^I hit calculate button$")
	public void i_hit_calculate_button() throws Throwable {
		//f.d();
	}

	@Then("^BMI value is thrown$")
	public void bmi_value_is_thrown() throws Throwable {
		System.out.println("Last step");
	}
}
