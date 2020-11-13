package com.hrms.API.Final.steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.entity.ContentType;
import org.junit.Assert;

import com.hrms.utils.APICommonMethods;
import com.hrms.utils.APIConstans;
import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIFinalSteps extends CommonMethods {

	RequestSpecification request;
	Response response;
	// String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	static String employeeID;

	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
//		/** First way to send a paybload with request */
////		request = given().header("Authorization", GenerateTokenSteps.token).header("Content-Type", "application/json")
////				.body(APIPayloadCommonMethods.createEmployeePayload()).log().all();
//
//		/** Second way */
//		request = given().header("Authorization", GenerateTokenSteps.token).header("Content-Type", "application/json")
//				.body(CommonMethods.readJson(APIConstans.CREATE_EMPLOYEE_JSON));
//		/** Third way is to hardcode */

		request = APICommonMethods.createEmployeeRequest(GenerateTokenSteps.token,
				CommonMethods.readJson(APIConstans.CREATE_EMPLOYEE_JSON));

	}

	@When("a POST call is made to create an employee")
	public void a_POST_call_is_made_to_create_an_employee() {
		response = request.when().post(APIConstans.CREATE_EMPLOYEE_URI);
	}

	@Then("the status code for creating an employee is {int}")
	public void the_status_code_for_creating_an_employee_is(int statusCode) {
		response.then().assertThat().statusCode(statusCode);
	}

	@Then("the employee is created contains key {string} and value {string}")
	public void the_employee_is_created_contains_key_and_value(String key, String value) {
		response.then().assertThat().body(key, equalTo(value));
	}

	@Then("the employee ID {string} is stored as a global variable to be used for other calls")
	public void the_employee_ID_is_stored_as_a_global_variable_to_be_used_for_other_calls(String value) {
		employeeID = response.jsonPath().getString(value);
	}

	@Given("a request is prepared to retrieve the created employee")
	public void a_request_is_prepared_to_retrieve_the_created_employee() {
		request = APICommonMethods.getOneEmployeeRequest(GenerateTokenSteps.token, employeeID);

	}

	@When("a GET call is made to retrieve the created employee")
	public void a_GET_call_is_made_to_retrieve_the_created_employee() {
		response = request.when().get(APIConstans.GET_ONE_EMPLOYEE_URI);
	}

	@Then("the status code for retrieving the created employee is {int}")
	public void the_status_code_for_retrieving_the_created_employee_is(int statusCodeForRetrievingEmployee) {
		response.then().assertThat().statusCode(statusCodeForRetrievingEmployee);

	}

	@Then("the retrieved employee ID {string} matches the globally stored employee ID")
	public void the_retrieved_employee_ID_matches_the_globally_stored_employee_ID(String retrievedEmployeeID) {
		response.then().assertThat().body(retrievedEmployeeID, equalTo(employeeID));
	}

	@Then("And the retrieved data at {string} matches the data used to create an employee with employee ID {string}")
	public void and_the_retrieved_data_at_matches_the_data_used_to_create_an_employee_with_employee_ID(
			String employeeObject, String responseEmployeeId, DataTable dataTable) {

		List<Map<String, String>> expectedData = dataTable.asMaps(String.class, String.class);
		List<Map<String, String>> actualData = response.body().jsonPath().get(employeeObject);

		int index = 0;
		for (Map<String, String> map : expectedData) {
			Set<String> keys = map.keySet();
			for (String key : keys) {

				String expectedValue = map.get(key);
				String actualValue = actualData.get(index).get(key);
				Assert.assertEquals(expectedValue, actualValue);
			}
			index++;
		}

		String empID = response.body().jsonPath().getString(responseEmployeeId);
		Assert.assertTrue(empID.contentEquals(employeeID));
	}

	@Given("a request is prepared to retrieve all employees")
	public void a_request_is_prepared_to_retrieve_all_employees() {
		
	}

	@When("a GET call is made to retrieve all employees")
	public void a_GET_call_is_made_to_retrieve_all_employees() {
	}

	@Then("the status code for retrieving all employees is {int}")
	public void the_status_code_for_retrieving_all_employees_is(Integer int1) {
	}

	@Then("the retrieved data contains the globally stored employee ID")
	public void the_retrieved_data_contains_the_globally_stored_employee_ID() {
	}

	@Then("the retrieved data matches the data that was used to create an employee")
	public void the_retrieved_data_matches_the_data_that_was_used_to_create_an_employee() {
	}

}