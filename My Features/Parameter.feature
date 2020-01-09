Feature: Test me Validation

  Background: launch test me app
    Given User launch the application

  Scenario Outline: Login verfication for three users
    Given Application  launched by user
    Then enter username "<username>"
    Then enter password "<password>"
    Then click on login button
    Then CLick on all category
    Then click on home electronics
    Then User click on headphone
    Then User CLick on add to cart
    Then User click on cart
    Then User CLick on remove from cart

    Examples: 
      | username | password  |
      | Amit     | password1 |
      | Sumit    | password2 |
      | raman    | password3 |
