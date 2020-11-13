package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/" , //set: Path to the Feature Files
				 glue = "com/hrms/API/Final/steps", //set: Path to the Step Definitions
				 dryRun = false, //true: checks if all the Steps have Step Definition
				 monochrome = true, //true: Display console Output is more readable format
				 tags = "@APIworkflow", //instruct: What tags in feature files should be executed
				 strict = false, // at the excetuion time if cucumber fing unimplemented method junit makrs as failed
				 plugin = {"pretty",//set: What all report formats to use
						   "html:target/cucumber-default-reports",// generates default html reports
						   "rerun:target/FailedTests.txt" ,//generates txt file only with failed tests	
						   "json:target/cucumber.json"//generates json reports
						  
						}
				) 


public class APIRunner {

}
