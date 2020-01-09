

Feature: my demo on tags
@smoke @regression


  Scenario: Register in amazon
    Given I launch app
    Then I register with valid data
 
@smoke

  Scenario: Login in amazon
    Given application is working 
    Then I provide data
    @regression
  Scenario: Order in amazon
    Given I am placing order for my selected item
    
    @uat @smoke
    Scenario: Cancellation in amazon
    Given I cancel the order as it not meets my expectation

 