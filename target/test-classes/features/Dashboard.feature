Feature: Dashboard Functionality

  @dash
  Scenario: Dashboard tabs verifications
    When login with valid credentials
    Then verify the following dashboards tabs
			| Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
			
			