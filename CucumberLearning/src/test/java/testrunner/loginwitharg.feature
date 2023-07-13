Feature: testleaf application testing

  Scenario Outline: Login with Valid Credential and get success response
    Given Open Testleaf CRM Application and Login
    And Enter Username as "<username>"
    And Enter Password as "<password>"
    And Click Login Button
    Then Login Success and Navigate to Go Homepage

  Scenario Outline: Login with Invalid Credential and Login should not success
    Given Open Testleaf CRM Application and Login
    And Enter Username as "<username>"
    And Enter Password as "<password>"
    And Click Login Button
    But Login should not Success and get error message

    Examples: 
      | username         | password         |
      | demosalesManager | crmsfa           |
      | crmsfa           | demosalesManager |
