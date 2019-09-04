Feature: Guest user action in demowebshop
@Sanity,Smoke
Scenario: user choice to opt for an account
Given user access the signup page
And gets the credentials

@Regression
Scenario: user access to login page of demowepshop
Given user has valid account creds for demowebshop
And provide the valid creds as inputs for the login process
Then verifies tha state of the login status