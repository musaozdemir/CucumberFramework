package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeDefinitions extends CommonMethods {

	@When("navigate to Add employee page")
	public void navigate_to_Add_employee_page() {
		jsClick(dash.pimLinkBtn);
		jsClick(dash.addEmpBtn);

	}

	@When("add employee details")
	public void add_employee_details() {
		sendText(addEmp.firstNameField, "Alex");
		sendText(addEmp.lastName, "DeSouza");

	}

	@Then("verify employee name in employee list")
	public void verify_employee_name_in_employee_list() {
		Assert.assertEquals(persDetails.profileName.getText(), "Alex DeSouza");
	}

	@When("click login details")
	public void click_login_details() {
		jsClick(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, "AlexDesouza1");
		sendText(addEmp.userPassword, "AbCD@#$1290$");
		sendText(addEmp.confirmPassword, "AbCD@#$1290$");

	}

	@When("enter first name as {string} middle name {string} and last name {string}")
	public void enter_first_name_as_middle_name_and_last_name(String firstname, String middlename, String lastname) {
		sendText(addEmp.firstNameField, firstname);
		sendText(addEmp.middleName, middlename);
		sendText(addEmp.lastName, lastname);

	}

	@Then("click save button")
	public void click_save_button() {
		jsClick(addEmp.saveButton);
	}

	@Then("verify that {string} is added sucsasfully")
	public void verify_that_is_added_sucsasfully(String fullname) {
		Assert.assertEquals(persDetails.profileName.getText(), fullname);

	}

	@When("enter employee {string},  {string} and {string}")
	public void enter_employee_and(String firstname, String middlename, String lastname) {
		sendText(addEmp.firstNameField, firstname);
		sendText(addEmp.middleName, middlename);
		sendText(addEmp.lastName, lastname);
	}

	@Then("verify that {string},  {string} and {string} is successfully added")
	public void verify_that_and_is_successfully_added(String firstname, String middlename, String lastname) {
		Assert.assertEquals(persDetails.profileName.getText(), firstname + " " + middlename + " " + lastname);
	}

}
