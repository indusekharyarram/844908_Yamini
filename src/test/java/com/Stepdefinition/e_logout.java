package com.Stepdefinition;

import com.Pages.logout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class e_logout {
	logout e=new logout();
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	    e.Launch();
	}

	@When("^access Taskmanager website$")
	public void access_Taskmanager_website() throws Throwable {
	    e.Open();
	}

	@Then("^click the administration$")
	public void click_the_administration() throws Throwable {
	    e.Logout();
	}

	@Then("^click the logout$")
	public void click_the_logout() throws Throwable {
	   e.Logout(); 
	}
}
