Feature: user guest actions in demowebshop
Scenario: user logins the webpage
Given user has the valid credentials
And user sends <"email"> and <"password"> as a input
Then user clicks the login button

Scenario: user closes the webpage
Given user gets access to the login page
And user clicks the logout button
Then user closes the webpage

Examples: multiple usernames and passwords are given
    |email                       ||password     |
    |sarmilaarul@gmail.com       ||sarmi007*    |
    |shangaviraji@gmail.com      ||s9677365295  |