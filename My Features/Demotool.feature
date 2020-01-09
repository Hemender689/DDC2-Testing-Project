Feature: TestMeApp validations

Scenario: Login
Given  Application is up and running and is launched
Then User clicks on SignIn link
And user provides valid creds
Then user clicks on sbmit button