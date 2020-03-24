package com.Stepdefinition;

import com.Pages.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class d_Screenshot {
	Screenshot d=new Screenshot();
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	   d.Launch();
	}

	@When("^Access TaskManager website$")
	public void access_TaskManager_website() throws Throwable {
	    d.Open();
	}

	@Then("^open the task list$")
	public void open_the_task_list() throws Throwable {
	    d.Click();
	}

	@Then("^print the tasks list$")
	public void print_the_tasks_list() throws Throwable {
	    d.Screenshots();
	}
}
