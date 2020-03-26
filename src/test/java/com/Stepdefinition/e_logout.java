package com.Stepdefinition;

import com.Pages.logout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class e_logout {
	logout e=new logout();
	//To open the browser 
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	    e.Launch();
	}
// To open the taskmanager website
	@When("^access Taskmanager website$")
	public void access_Taskmanager_website() throws Throwable {
	    e.Open();
	}
// To click the adminisration 
	@Then("^click the administration$")
	public void click_the_administration() throws Throwable {
	    e.Click();
	    }
// To click the logout
	@Then("^click the logout$")
	public void click_the_logout() throws Throwable {
	   e.Logout(); 
	}
}
