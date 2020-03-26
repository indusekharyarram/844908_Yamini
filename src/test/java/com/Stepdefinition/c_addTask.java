package com.Stepdefinition;

import com.Pages.addTask;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class c_addTask {
	addTask c = new addTask();
// To open the application 
	@Given("^open the Application$")
	public void open_the_Application() throws Throwable {
	    c.Open();
	}
//  To click on  administration 
	@When("^click on Administration$")
	public void click_on_Administration() throws Throwable {
	   c.Click();
	}

//To login 
	@When("^login with valid credentials$")
	public void login_with_valid_credentials() throws Throwable {
	    c.Login();
	}
//To  click the taks
	@When("^click on add task$")
	public void click_on_add_task() throws Throwable {
	    c.Add();
	}
// To do enter all fields 
	@When("^enter all fields$")
	public void enter_all_fields() throws Throwable {
	    c.Enter();
	}
// To do select start  date 
	@When("^select Start Date$")
	public void select_Start_Date() throws Throwable {
	    c.Startdate();
	}
// To do select end date 
	@When("^select End Date$")
	public void select_End_Date() throws Throwable {
	    c.Enddate();
	}
//To click the click button 
	@Then("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
	    c.AddButton();
	}

}
