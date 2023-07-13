Feature: testleaf application testing

Scenario: Login with Valid Credential and get success response

Given Open Testleaf CRM Application and Login
And Enter Username as "demosalesManager"
And Enter Password as "crmsfa"
And Click Login Button
Then Login Success and Navigate to Go Homepage

Scenario: Login with Invalid Credential and Login should not success

Given Open Testleaf CRM Application and Login
And Enter Username as "CRMSFA"
And Enter Password as "demosalesManager"
And Click Login Button
Then Login should not Success and get error message