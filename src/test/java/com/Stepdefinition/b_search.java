package com.Stepdefinition;

import com.Pages.search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class b_search {
	search b=new search();
	@Given("^Login to the application$")
	public void login_to_the_application() throws Throwable {
	    b.Login();
	}

	@When("^click on tasklist$")
	public void click_on_tasklist() throws Throwable {
	    b.Click();
	}

	@Then("^Select Assined to as Alex kniel$")
	public void select_Assined_to_as_Alex_kniel() throws Throwable {
	    b.Assign();
	}

	@Then("^click on search  button$")
	public void click_on_search_button() throws Throwable {
	    b.Search();
	}

}
