Feature: guest user action to the demowebshop
Background: user launches the demowebshop web page
Given user has the valid credentials for the demowebshop 
And user enters the valid credentials as the input to the login page
Then checks the login status

Scenario: user adds items to the cart
Given user gets access to the add item page
And user selects the headphone under electronics
Then user clicks the add to cart button

Scenario: user adds one more item of his choice
Given user again goes to the add item page
And user selects fiction book under Books 
Then user selects add to card option

