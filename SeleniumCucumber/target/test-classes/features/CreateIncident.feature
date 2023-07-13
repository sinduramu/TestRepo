Feature: Service Now Incident Management - Incidents

Scenario: TC001 Create Incident with request body as file
Given Set the end point for Service now Incident Management
And Set the authentication for Service now application
And Set the Queryparam for Create Incident request
And Set the Content type in the create Incident request
And Set the accept in the create Incident request
And Set the request body in create Incident request
When Send the POST request to Service now Incident Management
Then Validate the status code
And Validate the response that has number starts with INC