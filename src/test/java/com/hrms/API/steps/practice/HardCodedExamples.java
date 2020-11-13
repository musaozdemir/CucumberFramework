package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@FixMethodOrder(MethodSorters.DEFAULT)

public class HardCodedExamples {

	/*
	 * REST Assured - Java Library sepecifically developed to automate REST
	 * endpoints
	 * 
	 * Given - Preparing your request When - what action will you perform, what type
	 * of call are you making? Then - Verification
	 */

	// Concatanates with endpoint dring to run time
	String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2NDcwMjQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY5MDIyNCwidXNlcklkIjoiMTMyOCJ9.9bpzSBBdhZnKyq_M1Xt7T8SF3CwzGCen4gihVxwNpKk";
	static String employeeID;

//	@Test
	public void sampleTest() {

		/** BaseURI for all enpoints */
//		RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

		// JWT
		token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2NDcwMjQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY5MDIyNCwidXNlcklkIjoiMTMyOCJ9.9bpzSBBdhZnKyq_M1Xt7T8SF3CwzGCen4gihVxwNpKk";

		// Preparing request for /getOneEmployee.php
		// Using .log().all() to print out everything being with sent with request
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", "27887A").log().all();

		// making call to /getOneemployee.php(// Concatanates with baseURI) dring to run
		// time
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

//		System.out.println(getOneEmployeeResponse.asString());

		// second way using rest assured prettyPrint();
//		getOneEmployeeResponse.prettyPrint();

		// using assertThat() to verify status code.
		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}

	@Test()
	public void AaPOSTcreatedEmployee() {
		System.out.println("aPOSTcreatedEmployee");

		// preparing request for creating an employee
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\n" + "  \"emp_firstname\": \"RRobertoo\",\n" + "  \"emp_lastname\": \"CCarloss\",\n"
						+ "  \"emp_middle_name\": \"J\",\n" + "  \"emp_gender\": \"M\",\n"
						+ "  \"emp_birthday\": \"1980-10-10\",\n" + "  \"emp_status\": \"Employee\",\n"
						+ "  \"emp_job_title\": \"Cloud Architect\"\n" + "}")
//				.log().all()
		;

		// making call to /createEmployee.php
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		// print to response
//		createEmployeeResponse.prettyPrint();

		// using jsonPath() to view the response body which lets us get the employee ID
		// we are stroring employeeID as a string
		// with other calls
		
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

		// optional: print employeeId
//		System.out.println(employeeID);

		// verify status code 201
		createEmployeeResponse.then().assertThat().statusCode(201);

		// verifying response body "Message" is paired with "Entry Created"
		// equalTo() method comes from Hamcrest package - NEED TO IMPORT MANUALLY
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));

		// verifying employee first name equals to "Arthur"
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("RRobertoo"));

		// verifying server Apache/2.4.39 (Win64) PHP/7.2.18
		createEmployeeResponse.then().assertThat().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");

	}

	@Test
	public void AbGETcreatedEmployee() {
		System.out.println("bGETcreatedEmployee");


		/** Preparing request to get created employee */
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).queryParam("employee_id", employeeID);

		// storing response for retriving created employee
		Response getcreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");

		// printing response
//		getcreatedEmployeeResponse.prettyPrint();

		// storing response employee id int empID to compare with static global eployee
		// ID
		String empID = getcreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		boolean verifyingEmployeeID = empID.equalsIgnoreCase(employeeID);

		// asserting to verify the above condation is true
		Assert.assertTrue(verifyingEmployeeID);

		// verifying status code is 200
		getcreatedEmployeeResponse.then().assertThat().statusCode(200);

		String response = getcreatedEmployeeResponse.asString();

		JsonPath js = new JsonPath(response);

		String employeeId = js.getString("employee[0].employee_id");
		String empFirstName = js.getString("employee[0].emp_firstname");
		String empMiddleName = js.getString("employee[0].emp_middle_name");
		String empLastName = js.getString("employee[0].emp_lastname");
		String empBirthday = js.getString("employee[0].emp_birthday");
		String empGender = js.getString("employee[0].emp_gender");
		String empJobTitle = js.getString("employee[0].emp_job_title");
		String empStatus = js.getString("employee[0].emp_status");

		/** Asserting response employee ID matches stored employee Id */
		Assert.assertTrue(employeeId.contentEquals(employeeID));

		/** Asserting rest of the value mathching expected */
		Assert.assertEquals(empFirstName, "RRobertoo");
		Assert.assertEquals(empMiddleName, "J");
		Assert.assertEquals(empLastName, "CCarloss");
		Assert.assertEquals(empBirthday, "1980-10-10");
		Assert.assertEquals(empGender, "Male");
		Assert.assertEquals(empJobTitle, "Cloud Architect");
		Assert.assertEquals(empStatus, "Employee");

	}

	@Test
	public void AcGETallEmployees() {
		System.out.println("cGETallEmployees");

		/** Preparing request to get all employees */
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);

		/** Storing response into */
		Response getAllEmployeeResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");

		/** Printing response */

//		getAllEmployeeResponse.prettyPrint();

		/** Storing rsponse as a String */
		String response = getAllEmployeeResponse.asString();

		JsonPath js = new JsonPath(response);

		int count = js.getInt("Employees.size()");
//		System.out.println(count);

		System.out.println(employeeID);

		for (int i = 0; i < count; i++) {

			String allEmployeeIds = js.getString("Employees[" + i + "].employee_id");

			if (allEmployeeIds.contentEquals(employeeID)) {
				System.out.println("Employee ID: " + employeeID + " is present in the body");
				String firstNameOfEmpID = js.getString("Employees[" + i + "].emp_firstname");
				System.out.println(firstNameOfEmpID);
				break;

			}
		}

		/** print first name of all employees */
//	for(int i=0; i<count; i++) {
//			
//			String allFirstName = js.getString("Employees[" + i + "].emp_firstname"); 
//		System.out.println(allFirstName);
//			

	}

	@Test
	public void AdPUTUpdatedCreatedEmployee() {
		System.out.println("dPUTUpdatedCreatedEmployee");
		
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).
				body("{\\n\" + \n" + 
						"						\"\\\"employee_id\\\": \\\"\"+employeeID+\"\\\",\\n\" + \n" + 
						"						\"\\\"emp_firstname\\\": \\\"Ronaldo\\\",\\n\" + \n" + 
						"						\"\\\"emp_middle_name\\\": \\\"Junior\\\",\\n\" + \n" + 
						"						\"\\\"emp_lastname\\\": \\\"CCarloss\\\",\\n\" + \n" + 
						"						\"\\\"emp_birthday\\\": \\\"1980-10-10\\\",\\n\" + \n" + 
						"						\"\\\"emp_gender\\\": \\\"M\\\",\\n\" + \n" + 
						"						\"\\\"emp_job_title\\\": \\\"Cloud Architect\\\",\\n\" + \n" + 
						"						\"\\\"emp_status\\\": \\\"Super Contractor\\\"\\n\" + \n" + 
						"						\"}");

		Response putApdateCreatedEmployeeResponse = getCreatedEmployeeRequest.when().put("/updateEmployee.php\n");

		String response = putApdateCreatedEmployeeResponse.asString();
		
		JsonPath js = new JsonPath(response);
		
		String employeeId = js.getString("employee[0].employee_id");
		String updatedFirstName = js.getString("employee[0].emp_firstname");
		String updatedMiddleName = js.getString("employee[0].emp_middle_name");
		String updatedLastName = js.getString("employee[0].emp_lastname");
		String updatedBirthday = js.getString("employee[0].emp_birthday");
		String updatedGender = js.getString("employee[0].emp_gender");
		String updatedJobTitle = js.getString("employee[0].emp_job_title");
		String updatedStatus = js.getString("employee[0].emp_status");


		/** Asserting response value mathching expected */
		Assert.assertTrue(employeeId.contentEquals(employeeID));
		Assert.assertEquals(updatedFirstName, "Ronaldo");
		Assert.assertEquals(updatedMiddleName, "Junior");
		Assert.assertEquals(updatedLastName, "CCarloss");
		Assert.assertEquals(updatedBirthday, "1980-10-10");
		Assert.assertEquals(updatedGender, "Male");
		Assert.assertEquals(updatedJobTitle, "Cloud Architect");
		Assert.assertEquals(updatedStatus, "Super Contractor");

		
		
	}

}
