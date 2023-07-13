Feature: TodoMVC Scenarios

Scenario: Verify the user is able to add an item to the Empty Todo List
Given an empty Todo list
When I add a Todo for "Buy Milk"
Then only that item is listed
And the list summary is "1 item left"
And the list’s filter is set to "All" with "Completed" & "Active" unset
And "Clear completed" is unavailable

