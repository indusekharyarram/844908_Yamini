package com.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature//testcase.feature",
		glue= {"com.Stepdefinition"},
		monochrome = true
		)
public class Runner {

}
