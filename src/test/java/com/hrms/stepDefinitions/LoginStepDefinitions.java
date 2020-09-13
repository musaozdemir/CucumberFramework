package com.hrms.stepDefinitions;


import org.junit.Assert; // when we importing we need to choose org.junit!!!!

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends CommonMethods{

	

	@When("login with valid credentials")
	public void login_with_valid_credentials() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
	}

	@Then("verify the dasboard logo is displayes")
	public void verify_the_dasboard_logo_is_displayes() {
		Assert.assertTrue(dash.welcome.isDisplayed());
	}
	
	@When("login with invalid credentials")
	public void login_with_invalid_credentials() {
		login.loginToHRMS("Admin111", "sysysys");
	}

	@Then("verify the error message")
	public void verify_the_error_message() {
	    Assert.assertTrue(login.spanMessage.isDisplayed());
	}
	
	@When("login with empty username")
	public void login_with_empty_username() {
	   login.loginToHRMS("",ConfigsReader.getPropValue("password"));
	}

	@Then("verify the error message empty username")
	public void verify_the_error_message_empty_username() {
		Assert.assertEquals(login.spanMessage.getText(), "Username cannot be empty");
	}

	@When("login with empty password")
	public void login_with_empty_password() {
	   login.loginToHRMS(ConfigsReader.getPropValue("username"), "");
	}

	@Then("verify the error message empty password")
	public void verify_the_error_message_empty_password() {
		Assert.assertEquals(login.spanMessage.getText(), "Password cannot be empty");
	}

	
}
