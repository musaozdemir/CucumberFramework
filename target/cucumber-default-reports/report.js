$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee Functionalty",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add new employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the dasboard logo is displayes",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.verify_the_dasboard_logo_is_displayes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Add employee page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.navigate_to_Add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify to add employee text box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_to_add_employee_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add employee details and save",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.add_employee_details_and_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify employee name in employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_employee_name_in_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add new employee");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new employee with login details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the dasboard logo is displayes",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.verify_the_dasboard_logo_is_displayes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Add employee page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.navigate_to_Add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify to add employee text box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_to_add_employee_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add employee details with login details and save",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.add_employee_details_with_login_details_and_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify employee name in employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_employee_name_in_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Add new employee with login details");
formatter.after({
  "status": "passed"
});
});