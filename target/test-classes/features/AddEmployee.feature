Feature: Add Employee Functionalty

  @regression
  Scenario: Add new employee
    When login with valid credentials
    Then verify the dasboard logo is displayes
    When navigate to Add employee page
    Then verify to add employee text box
    When add employee details and save
    Then verify employee name in employee list

  @regression
  Scenario: Add new employee with login details
    When login with valid credentials
    Then verify the dasboard logo is displayes
    When navigate to Add employee page
    Then verify to add employee text box
    When add employee details with login details and save
    Then verify employee name in employee list
