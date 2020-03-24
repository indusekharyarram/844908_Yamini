package com.Stepdefinition;

import com.Pages.addTask;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class c_addTask {
	addTask c = new addTask();
	@Given("^open the Application$")
	public void open_the_Application() throws Throwable {
	    c.Open();
	}

	@When("^click on Administration(\\d+)$")
	public void click_on_Administration(int arg1) throws Throwable {
	    c.Click();
	}

	@When("^login with valid credentials$")
	public void login_with_valid_credentials() throws Throwable {
	    c.Login();
	}

	@When("^click on add task$")
	public void click_on_add_task() throws Throwable {
	    c.Add();
	}

	@When("^enter all fields$")
	public void enter_all_fields() throws Throwable {
	    c.Enter();
	}

	@When("^select Start Date$")
	public void select_Start_Date() throws Throwable {
	    c.Startdate();
	}

	@When("^select End Date$")
	public void select_End_Date() throws Throwable {
	    c.Enddate();
	}

	@Then("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
	    c.AddButton();
	}

}
