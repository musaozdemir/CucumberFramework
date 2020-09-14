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

	@Then("verify to add employee text box")
	public void verify_to_add_employee_text_box() {
	   Assert.assertTrue(addEmp.addEpmloyeText.isDisplayed());
	}

	@When("add employee details and save")
	public void add_employee_details_and_save() {
	  sendText(addEmp.firstNameField, "Alex");
	  sendText(addEmp.lastName, "DeSouza");
	  jsClick(addEmp.saveButton);
	}

	@Then("verify employee name in employee list")
	public void verify_employee_name_in_employee_list() {
		Assert.assertEquals(persDetails.profileName.getText(), "Alex DeSouza");
	}

	@When("add employee details with login details and save")
	public void add_employee_details_with_login_details_and_save() {
		sendText(addEmp.firstNameField, "Alex");
		sendText(addEmp.lastName, "DeSouza");
		
		jsClick(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, "AlexDesouza1");
		sendText(addEmp.userPassword, "AbCD@#$1290$");
		sendText(addEmp.confirmPassword, "AbCD@#$1290$");
		
		jsClick(addEmp.saveButton);
		
	}
	
}
