package com.hrms.stepDefinitions;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
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
	
	@When("add multiple employees and verify they are added")
	public void add_multiple_employees_and_verify_they_are_added(DataTable employees) {
	  List<Map<String , String>> employeeNames = employees.asMaps();
	 for (Map<String, String> employeeName : employeeNames) {
		String firstname = employeeName.get("First Name");
		String middlename= employeeName.get("Middle Name");
		String lastname = employeeName.get("Last Name");
		
		sendText(addEmp.firstNameField, firstname);
		sendText(addEmp.middleName, middlename);
		sendText(addEmp.lastName, lastname);
		
		jsClick(addEmp.saveButton);
		
		String actualname = persDetails.profileName.getText();
		String expectedname = firstname + " " + middlename + " " + lastname;
		
		Assert.assertEquals("verifying employee names", expectedname, actualname);
		jsClick(dash.addEmpBtn);
	}
	 
	}
	
	
	@When("add multiple employees from {string} verify they are added successfully")
	public void add_multiple_employees_from_verify_they_are_added_successfully(String sheetName) {
	    
		List<Map<String, String>>  excelData = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH	, sheetName);
		
		for (Map<String, String> excelEmpName : excelData) {
			String firstname = excelEmpName.get("FirstName");
			String middlename= excelEmpName.get("MiddleName");
			String lastname = excelEmpName.get("LastName");
			
			sendText(addEmp.firstNameField, firstname);
			sendText(addEmp.middleName, middlename);
			sendText(addEmp.lastName, lastname);
			
			jsClick(addEmp.saveButton);
			
			String actualname = persDetails.profileName.getText();
			String expectedname = firstname + " " + middlename + " " + lastname;
			
			Assert.assertEquals("verifying employee names", expectedname, actualname);
			jsClick(dash.addEmpBtn);
		
		
		
		}
		
	}

}
