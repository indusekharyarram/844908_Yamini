
package com.Stepdefinition;

import com.Pages.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class a_login {
	login a=new login();
//To launch the browser	
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
	   a.Launch();
	}
// To open the application 
	@When("^open the application$")
	public void open_the_application() throws Throwable {
	    a.Open();
	}
//enter username and pssword 
	@Then("^enter username & password$")
	public void enter_username_password() throws Throwable {
	    a.Enter();
	}
//click on login buttn
	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    a.Click();
	}
}
