package com.hrms.utils;

import org.json.JSONObject;

public class APIPayloadCommonMethods {

	public static String createEmployeeBody() {

		String createEmployeeBody = "{\n" + "  \"emp_firstname\": \"RRobertoo\",\n"
				+ "  \"emp_lastname\": \"CCarloss\",\n" + "  \"emp_middle_name\": \"J\",\n"
				+ "  \"emp_gender\": \"M\",\n" + "  \"emp_birthday\": \"1980-10-10\",\n"
				+ "  \"emp_status\": \"Employee\",\n" + "  \"emp_job_title\": \"Cloud Architect\"\n" + "}";
		return createEmployeeBody;

	}

	public static String createEmployeePayload() {

		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "RRobertoo");
		obj.put("emp_lastname", "CCarloss");
		obj.put("emp_middle_name", "J");
		obj.put("emp_gender", "M");
		obj.put("emp_birthday", "1980-10-10");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "Cloud Architect");

		return obj.toString();

	}

	public static String createEmployeePayloadMoreDynamic(String firstName, String lastName, String middleName,
			String gender, String dob, String employeeStatus, String employeeJobTitle) {
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", firstName);
		obj.put("emp_lastname", lastName);
		obj.put("emp_middle_name", middleName);
		obj.put("emp_gender", gender);
		obj.put("emp_birthday", dob);
		obj.put("emp_status", employeeStatus);
		obj.put("emp_job_title", employeeJobTitle);
		return obj.toString();
	}

	

}
