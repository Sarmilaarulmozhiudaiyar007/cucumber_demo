Feature: my validations demo for testme in bdc

Scenario: User access to guest registeration
Given Application is launched by guest user
When user clicks on sign Up link available
And Provider the requied data in the form
Then user submits the data
And verifies for the account creation


