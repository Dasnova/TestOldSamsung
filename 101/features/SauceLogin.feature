
Feature: For User to login successfully into Sauce website

 Background: Shopping verification 
  Scenario: Login and Log out
    Given that User is on the Web page    
    When User enters the correct login credentials
    And add items to the cart
    Then User should logout
    