@login
Feature: Login Functionalty

  @regression
  Scenario: Login with valid credentials
    When login with valid credentials
    Then verify the dasboard logo is displayes

 @smoke
  Scenario: Login with invalid credentials
    When login with invalid credentials
    Then verify the error message

 
  Scenario: Login with empty username
    When login with empty username
    Then verify the error message empty username


  Scenario: Login with empty password
    When login with empty password
    Then verify the error message empty password