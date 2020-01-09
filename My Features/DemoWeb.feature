Feature: DemoWebshop validations
Scenario: Guest user registeration in DemoWebshop
Given User launches the DemoWebshop App
Then User clicks on SignIn button
And User Provides the valid data for all fields
When User clicks in submit button at the end of the  form
Then verifies the result of the resgistration
And prints the message

Scenario: Register user login in DemoWebshop
Given Application launched by registered user
Then User access the login Link
And Provides the valid data as input 
And Verfies the login status
