package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature" , //set: Path to the Feature Files
				 glue = "com/hrms/stepDefinitions", //set: Path to the Step Definitions
				 dryRun = false, //true: checks if all the Steps have Step Definition
				 monochrome = true //true: Display console Output is more readable format
				 )


public class TestRunner {
	
}
