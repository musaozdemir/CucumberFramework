Feature: Login Functionalty

Scenario: Login with valid credentials
Given go to HRMS login page
When login with valid credentials
Then verify the dasboard logo is displayes
And quit the browser


Scenario: Login with invalid credentials
Given go to HRMS login page
When login with invalid credentials
Then verify the error message
And quit the browser

Scenario: Login with empty username
Given go to HRMS login page
When login with empty username
Then verify the error message empty username
And quit the browser

Scenario: Login with empty password
Given go to HRMS login page
When login with empty password
Then verify the error message empty password
And quit the browser
