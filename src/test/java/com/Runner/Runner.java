package com.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature/testcase.feature",
	
		glue= {"com\\Stepdefinition"},
				plugin = {"pretty:target/json-report.json","html:target/cucumber-html-report","junit:target/junit-xml-report.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},//reports generated
		/*
		 * tags= {"@tc01_login,@tc02_Tasklist,@tc03_AddTask,@tc04_Print,@tc05_Logout"},
		 */
		monochrome=true,//display console output in readable format
		strict=true,//checking if any step is not defined in stepdefinition file
		dryRun=false// mapping between feature and stepdefinition file
		)
public class Runner {
	}