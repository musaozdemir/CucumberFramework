package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/FailedTests.txt" , //set: Path to the Feature Files
				 glue = "com/hrms/stepDefinitions", //set: Path to the Step Definitions
				 monochrome = true, //true: Display console Output is more readable format
				 plugin = {"pretty",//set: What all report formats to use
						   "html:target/cucumber-default-reports",// generates default html reports
						 	"rerun:target/FailedTests.txt"
							}
				) 

public class Failedrunner {
	

}
