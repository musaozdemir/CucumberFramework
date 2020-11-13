package com.hrms.utils;

import static io.restassured.RestAssured.given;

import com.hrms.API.Final.steps.GenerateTokenSteps;

import io.restassured.specification.RequestSpecification;

public class APICommonMethods {

	/**
	 * Use this method to create an employee pass blow parameters
	 * 
	 * @param token
	 * @param createEmployeeBody
	 ** @return RequestSpecification
	 */

	public static RequestSpecification createEmployeeRequest(String token, String createEmployeeBody) {

		return given().header("Authorization", token).header("Content-Type", "application/json")
				.body(createEmployeeBody);

	}

	/**
	 * Use this method to get one employee pass blow parameters
	 * 
	 * @param token
	 * @param employeeID
	 * @return RequestSpecification
	 */

	public static RequestSpecification getOneEmployeeRequest(String token, String employeeID) {

		return given().header("Content-Type", "application/json").header("Authorization", token).param("employee_id",
				employeeID);
	}

	/** Use this method to generate a token */
	/**
	 * 
	 * @param generateTokenBody
	 * @return
	 */

	public static RequestSpecification generateTokenRequest(String generateTokenBody) {
		return given().header("Content-Type", "application/json").body(generateTokenBody);

	}

}