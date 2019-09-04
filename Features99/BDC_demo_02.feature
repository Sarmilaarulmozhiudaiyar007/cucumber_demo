Feature: BDC validation on demowebshop
@Regression
Scenario:  Register user access to cart in demowebshop
Given user launched dempowebshop app in chrome browser
Then user searches the item of his choice
And adds that item to the cart
@Sanity
Scenario:  Register user access track the ordered item in demowebshop
Given user has already placed an order for his favourite item
And user tries to access the order tracking dashboard
Then identifies the state of the order




