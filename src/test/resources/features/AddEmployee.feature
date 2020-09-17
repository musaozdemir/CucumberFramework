Feature: Add Employee Functionalty

  Background: 
    When login with valid credentials
    When navigate to Add employee page

  @addEmployee
  Scenario: Add new employee without login details without middle name
    When add employee details
    Then click save button
    And verify employee name in employee list

  @addEmployee
  Scenario: Add new employee with login details
    When add employee details
    When click login details
    Then click save button
    And verify employee name in employee list

  @parameter
  Scenario: Add new employee without login details with middle name
    When enter first name as "Musa" middle name "M" and last name "Ozdemir"
    Then click save button
    And verify that "Musa M Ozdemir" is added successfully

  @examples
  Scenario Outline: Adding multiple employee without login details
    When enter employee "<First Name>",  "<Middle Name>" and "<Last Name>"
    Then click save button
    And verify that "<First Name>",  "<Middle Name>" and "<Last Name>" is successfully added

    Examples: 
      | First Name | Middle Name | Last Name |
      | Mark       | J           | Smith     |
      | John       | F           | kennedy   |
      | Musa       | M           | Ozdemir   |